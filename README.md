# Spring Boot - Amazon Web Services - Amazon Lambda

## Introduction

> Proyecto de Java para montar plataforma sin servidor.

## Estructura del Proyecto

> HandyAWS -> Código Lambda para creación de CRUD usando los servicios de Amazon.

## Uso del Proyecto - Rutas AWS

Listado de todos los artículos (GET) https://yh2utx84ba.execute-api.us-east-1.amazonaws.com/dev/dev?id=all

Insertar nuevos artículos (POST) https://icbso10o5a.execute-api.us-east-1.amazonaws.com/dev/inventory

Ex. { "id": 105, "toolType": "Hammer", "brand": "Pittsburgh", "name": "16 oz. Claw Hammer", "count": 23 }

Eliminar artículos (DELETE) https://2z8bupm3kl.execute-api.us-east-1.amazonaws.com/dev/{id}

Actualizar artículos (PUT) https://q7oa2vpdv3.execute-api.us-east-1.amazonaws.com/dev/{id}
