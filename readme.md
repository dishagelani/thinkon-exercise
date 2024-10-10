# User Management API

## Table of Contents
- [Introduction](#introduction)
- [Technologies Used](#technologies-used)
- [Features](#features)
- [API Endpoints](#api-endpoints)
- [Installation](#installation)
- [Postman Collection](#postman-collection)

## Introduction
This project is a RESTful API for managing users. It allows users to be created, read, updated, and deleted (CRUD operations). The API ensures data validation and provides clear error messages for any issues encountered during requests.

## Technologies Used
- **Java 17**: Programming language used for the backend development.
- **Spring Boot**: Framework for building the API.
- **Jakarta Validation**: For validating user input.
- **JPA/Hibernate**: For database interaction.
- **H2 Database**: In-memory database for development and testing.

## Features
- Create new users
- List all available users
- Retrieve a specific user by ID
- Update an existing user
- Delete a user
- Input validation for email format and phone number
- Clear error handling and response messaging

## API Endpoints

| HTTP Method | Endpoint         | Description                          |
|-------------|------------------|--------------------------------------|
| POST        | `/users`         | Create a new user                   |
| GET         | `/users`         | Retrieve all users                  |
| GET         | `/users/{id}`    | Retrieve a specific user by ID      |
| PUT         | `/users/{id}`    | Update an existing user             |
| DELETE      | `/users/{id}`    | Delete a user                       |

## Installation
To run the User Management API locally, follow these steps:

1. **Clone the repository**:
   ```bash
   git clone https://github.com/dishagelani/thinkon-exercise.git

2. **Navigate to the project directory**:   
   ```bash
   cd thinkon-exercise

3. **Build the project**:
   Make sure you have Maven installed. Then run:
   ```bash
   mvn clean install

4. **Run the application**:
   ```bash
   mvn spring-boot:run

4. **Access the API**:
   http://localhost:8080/users

## Postman Collection

You can download the Postman collection for this API [here](https://api.postman.com/collections/32968662-db4ca632-2170-4a3f-9bff-618e44dfba11?access_key=PMAT-01J9VSWK4F13XSTRRE4KF4BGDH)