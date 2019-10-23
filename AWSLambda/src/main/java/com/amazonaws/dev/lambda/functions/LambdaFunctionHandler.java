package com.amazonaws.dev.lambda.functions;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.google.gson.Gson;

import software.amazon.awssdk.core.ResponseInputStream;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.services.s3.model.GetObjectRequest;

public class LambdaFunctionHandler implements RequestHandler<HttpQueryStringRequest, HttpProductResponse> {
	@Override
	public HttpProductResponse handleRequest(HttpQueryStringRequest request, Context context) {
		context.getLogger().log("Input: " + request);
		String idAsString = (String)request.getQueryStringParameters().get("id");
		Integer productId = Integer.parseInt(idAsString);
		Product product = getProductById(productId);
		return new HttpProductResponse(product);
	}

	private Product getProductById(int prodId) {
		Region region = Region.US_EAST_1;
		S3Client s3Client = S3Client.builder().region(region).build();
		ResponseInputStream<?> objectData = s3Client.getObject(GetObjectRequest.builder()
				.bucket("handy-inventory-data-995-0")
				.key("handy-tool-catalog.json")
				.build());
		
		InputStreamReader isr = new InputStreamReader(objectData);
		BufferedReader br = new BufferedReader(isr);
		
		Product[] products = null;

		Gson gson = new Gson();
		products = gson.fromJson(br, Product[].class);
		
		for (Product prod : products) {
			if (prod.getId() == prodId) {
				return prod;
			}
		}
		return null;
	}
}