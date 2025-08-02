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
