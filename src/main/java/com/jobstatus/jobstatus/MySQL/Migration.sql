DROP DATABASE IF EXISTS jobStatus_db;
CREATE DATABASE IF NOT EXISTS jobStatus_db;

USE jobStatus_db;

CREATE USER IF NOT EXISTS jobStatus_user@localhost IDENTIFIED BY 'codeup';
GRANT ALL ON jobStatus_db.* TO jobStatus_user@localhost;

CREATE TABLE IF NOT EXISTS orders (
    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    job_name VARCHAR (255) NOT NULL,
    status VARCHAR (255) NOT NULL,
    PRIMARY KEY (id)
    );