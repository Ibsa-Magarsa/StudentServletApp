# Student Registration Web Application

This is a simple Java Servlet web application that allows users to register students into a MySQL database and view all registered students in a table.

The project is built using:
- Java Servlets (Jakarta Servlet API)
- JSP (Java Server Pages)
- JDBC (MySQL Connector/J)
- Tomcat Server
- MySQL Database

---

## 🚀 Features

✔ Register a student with name, email, and year  
✔ Store student data in MySQL  
✔ Display all students in an HTML table  

---

## 🗄 Database Setup

Run the SQL script provided in the project:

File: `database.sql`

It contains:
```sql
CREATE DATABASE studentdb;
USE studentdb;

CREATE TABLE students (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE,
    year INT NOT NULL
);
