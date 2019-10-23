# Spring Boot - Amazon Web Services - Amazon Lambda

## Introduction

> Proyecto de Java para montar plataforma sin servidor.

## Estructura del Proyecto

> HandyAWS -> Código Lambda para creación de CRUD usando los servicios de Amazon.

## Uso del Proyecto - Rutas AWS

Listado de todos los artículos (GET) https://4r5ex7lrsl.execute-api.us-east-1.amazonaws.com/dev/proxy?id=all

Insertar nuevos artículos (POST) https://90lvirey3f.execute-api.us-east-1.amazonaws.com/dev/inventory

Ex.   {
    "id": 105,
    "toolType": "Hammer",
    "brand": "Pittsburg",
    "name": "16 oz Claw Hammer",
    "count": 23
  }

Actualizar artículos (PUT)  https://zloijd9p73.execute-api.us-east-1.amazonaws.com/dev/{id}

Ex.   {
    "id": 105,
    "toolType": "Hammer",
    "brand": "Pittsburg",
    "name": "16 oz Claw Hammer",
    "count": 23
  }

Eliminar artículos (DELETE) https://z97fdeekt2.execute-api.us-east-1.amazonaws.com/dev/{id}
