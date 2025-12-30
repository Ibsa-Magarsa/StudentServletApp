-- Create database
CREATE DATABASE studentdb;
USE studentdb;

-- Create table
CREATE TABLE students (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE,
    year INT NOT NULL
);

-- Example insert data (optional)
INSERT INTO students (name, email, year) VALUES
('John Doe', 'john@example.com', 2),
('Mary Smith', 'mary@example.com', 1);
