# 🔐 Spring Boot Basic Authentication with Password Encoding

This project demonstrates how to secure REST APIs using **Basic Authentication** in a **stateless** way, with **users stored in a database** and **passwords hashed using BCrypt**.

## Features

- Basic Authentication (`Authorization: Basic ...`)
- Passwords stored using **BCrypt hashing**
- Stateless authentication (no session)
- Custom `UserDetailsService` for DB integration
- H2/MySQL support (configurable)
- CSRF disabled for APIs
- 
## Tech Stack

- Java 17
- Spring Boot 3.x
- Spring Security
- Spring Data JPA
- BCryptPasswordEncoder
- MySQL

 ## Getting Start
🔧 Setup
Clone the repo:
  https://github.com/your-username/springboot-basic-auth.git

git clone
cd springboot-basic-auth

Configure application.properties:
spring.datasource.url=jdbc:mysql://localhost:3306/spring_basic_auth
spring.datasource.username=root
spring.datasource.password=12Root@

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect

Run the application:
./mvnw spring-boot:run
