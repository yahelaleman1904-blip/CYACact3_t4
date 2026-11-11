# Proyecto CRUD API REST - Actividad 3

Este repositorio contiene el desarrollo de una API RESTful construida con Spring Boot. El objetivo principal de esta práctica es implementar un CRUD completo (Crear, Leer, Actualizar, Eliminar), demostrando el manejo de persistencia de datos con Spring Data JPA, la relación entre entidades de base de datos y el despliegue final en un entorno de producción.

## Tecnologías Utilizadas

* **Lenguaje y Framework:** Java 17, Spring Boot 4.1.2
* **Gestor de Dependencias:** Maven
* **Base de Datos:** MySQL (Entorno local y producción)
* **Herramientas de Desarrollo:** Visual Studio Code, DBeaver
* **Pruebas de API:** Postman
* **Despliegue:** Servidor VPS en DigitalOcean (Ubuntu)

## Arquitectura y Entidades

El proyecto maneja una base de datos relacional con dos entidades principales, demostrando una relación de tipo Uno a Muchos (`@OneToMany`) y Muchos a Uno (`@ManyToOne`):

1. **Consola:** Entidad principal que almacena el nombre y fabricante de las plataformas de hardware.
2. **Videojuego:** Entidad dependiente que almacena el título y género del juego, enlazada directamente mediante un ID a la consola a la que pertenece.

## Endpoints de la API

La API expone las siguientes rutas para interactuar con los recursos:

**Consolas**
* `GET /api/consolas` - Obtiene el listado de todas las consolas.
* `POST /api/consolas` - Crea un nuevo registro de consola.

**Videojuegos**
* `GET /api/videojuegos` - Obtiene el listado de todos los videojuegos, incluyendo los datos de la consola relacionada.
* `GET /api/videojuegos/{id}` - Obtiene un videojuego específico por su ID.
* `POST /api/videojuegos` - Registra un nuevo videojuego asociado a una consola existente.
* `PUT /api/videojuegos/{id}` - Actualiza la información de un videojuego existente.
* `DELETE /api/videojuegos/{id}` - Elimina un registro de la base de datos.

## Despliegue en Producción

El proyecto fue empaquetado en un archivo ejecutable `.jar` y transferido mediante el protocolo SCP a un servidor VPS aprovisionado en DigitalOcean. Actualmente se encuentra en ejecución en segundo plano aislando el tráfico en un puerto específico mediante la utilidad `nohup`.

* **URL Base de Producción:** `http://216.238.94.85:8082`

---

## Evidencias de Funcionamiento

A continuación se presentan las pruebas realizadas a los endpoints en el entorno de producción utilizando Postman, comprobando la correcta ejecución de los métodos HTTP y la persistencia en la base de datos MySQL del servidor.

### 1. Creación de Entidad Principal (POST - Consola)
Creación del registro base para establecer la relación.
![Prueba POST Consola](G:\Respaldo chino\yahel\Pictures\Screenshots\Crear una Consola (POST - Crear).png)

### 2. Creación de Entidad Relacionada (POST - Videojuego)
Registro de un videojuego enlazado exitosamente al ID de la consola previamente creada.
![Prueba POST Videojuego](ruta/a/tu/imagen/2-post-videojuego.png)

### 3. Lectura de Datos y Relación (GET - Videojuegos)
Consulta general que demuestra la estructura anidada del JSON, comprobando que la relación `@ManyToOne` funciona correctamente.
![Prueba GET Videojuegos](ruta/a/tu/imagen/3-get-videojuegos.png)

### 4. Actualización de Registro (PUT - Videojuego)
Modificación de los datos de un registro existente apuntando a su ID.
![Prueba PUT Videojuego](ruta/a/tu/imagen/4-put-videojuego.png)

### 5. Eliminación de Registro (DELETE - Videojuego)
Eliminación exitosa del registro, retornando un código de estado 200 OK.
![Prueba DELETE Videojuego](ruta/a/tu/imagen/5-delete-videojuego.png)

### 6. Verificación de Despliegue Público
Captura del navegador demostrando que la API se encuentra pública, respondiendo correctamente desde la dirección IP del servidor VPS.
![Prueba Navegador VPS](ruta/a/tu/imagen/6-navegador-vps.png)
