# Spring Boot ToDo App

## Overview

This is a simple ToDo application built using Spring Boot, with a focus on learning and implementing CRUD operations, user authentication, and database connectivity. The application allows multiple users to manage their ToDo lists, perform basic CRUD operations, and utilizes Spring Security for user authentication. Initially, static data was used, later upgraded to use an H2 database, and eventually connected to a MySQL database using Docker.

## Features

- **User Authentication:** Spring Security is implemented to ensure secure user authentication.
- **CRUD Operations:** Users can perform Create, Read, Update, and Delete operations on their ToDo items.
- **Database Connectivity:**
  - Initially, static data (List) was used for storing ToDo items.
  - H2 database was later integrated to persist data while the application is running.
  - Docker container was used to connect the application to a MySQL database for more robust and persistent data storage.

## Technologies Used

- **Spring Boot:** For building the application.
- **Spring Security:** For user authentication.
- **JSP and JSPF:** For creating dynamic views.
- **Bootstrap:** For a responsive and visually appealing user interface.
- **H2 Database:** For in-memory database during development.
- **MySQL:** As the production database, connected through Docker.
