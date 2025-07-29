## 🚀  Funcionalidades Principales
1. Gestión de Tópicos
- Crear tópicos: Publica nuevos temas con título, mensaje y autor (veterinario registrado).

- Listar tópicos: Visualiza todos los tópicos existentes en orden cronológico.

- Modificar tópicos: Edita el título o contenido (solo usuarios autenticados).

- Eliminar tópicos: Borra publicaciones (solo el autor o administradores).

2. Usuarios
- Registro/Login: Solo veterinarios verificados pueden participar.

- Autenticación segura: JWT (JSON Web Tokens) para proteger operaciones.

3. API RESTful
- Endpoints documentados con Swagger para integración frontend.


## 🛠  Tecnologías Utilizadas
- Backend
- Base de Datos
- Otros
- Java 17	(Próximamente)
- MySQL
- Spring Boot 3.x
- Spring Security
- Flyway (migraciones)
- JWT
- Hibernate
- Swagger/OpenAPI
  
## 📋  Instalación y Uso


| REQUISITOS |
| ---------- |
|JDK 17+|
|MySQL 8.x|
|Maven|

Pasos para ejecutar
Clona el repositorio:

bash
git clone https://github.com/MarcosGallinger/forovet.api.git
Configura la base de datos en application.yml:

yaml
spring:
  datasource:
    url: jdbc:mysql://localhost:3006/forumvet_api
    username: tu_usuario
    password: tu_contraseña
Ejecuta las migraciones con Flyway:

bash
mvn flyway:migrate
Inicia la aplicación:

bash
mvn spring-boot:run
Accede a la documentación API:
## 🔗 http://localhost:8080/swagger-ui.html

## 🌐  Endpoints Principales

|Método  |	Ruta       |	Descripción|
| ------ | ----------- | ----------- |
|POST	   |/topicos     |	Crear nuevo tópico|
|GET	   |/topicos     |	Listar todos los tópicos|
|PUT	   |/topicos/{id}|	Actualizar tópico (por ID)|
|DELETE	 |/topicos/{id}|	Eliminar tópico (solo autor/admin)|
|POST	   |/login       |	Iniciar sesión|

## 🐕 Ejemplo de JSON para Tópico

json
`{
  "titulo": "Manejo de diabetes en gatos",
  "mensaje": "¿Qué protocolos recomiendan para felinos con diabetes mellitus?",
  "autor": "Dra. Laura Pérez"
}`

## 🛡  Seguridad
Solo usuarios autenticados pueden crear/modificar/eliminar tópicos.

Validación de roles:

VETERINARIO: Gestiona sus propios tópicos.

ADMIN: Acceso total.

## 📬  Contribuciones
¡Contribuciones son bienvenidas! Abre un issue o envía un pull request.

📜 Licencia
MIT License © 2025 [Marcos Gallinger]

🔗 Repositorio: github.com/MarcosGallinger/forovet.api
📧 Contacto: contacto@forovet.com
