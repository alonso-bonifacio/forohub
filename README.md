# Forohub

Forohub es un proyecto desarrollado en Java que implementa una REST API backend con seguridad mediante JWT.

## Descripción

Forohub es una aplicación diseñada para gestionar tópicos. El módulo de Tópicos permite realizar operaciones CRUD (Crear, Leer, Actualizar y Eliminar) y cuenta con validaciones en las solicitudes que provienen de diferentes partes (variables de ruta, cuerpo de la solicitud y consultas).

## Características

- CRUD completo para el módulo de Tópicos.
- Seguridad en los endpoints mediante JWT.
- Validaciones integradas en las solicitudes.
- Arquitectura RESTful.
- Tiene implementado Swagger.

## Uso

Para interactuar con la API, utiliza herramientas como Postman o cURL. Asegúrate de incluir el token JWT en las solicitudes que requieran autenticación.
Endpoints principales:

- POST /auth - Para loguearse en el API y obtener el JWT.
- POST /topicos - Crear un nuevo tópico.
- GET /topicos - Obtener la lista de tópicos.
- PUT /topicos - Actualizar un tópico.
- DELETE /topicos/{id} - Eliminar un tópico por su ID.
