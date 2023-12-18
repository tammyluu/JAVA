CREATE DATABASE jdbc1;

USE jdbc1;

CREATE TABLE etudiant (
id INT AUTO_INCREMENT PRIMARY KEY,
first_name VARCHAR(200),
last_name VARCHAR(200),
num_class VARCHAR(10),
date_diplome DATE
);
