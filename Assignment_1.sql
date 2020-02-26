CREATE DATABASE datasession;

GRANT ALL PRIVILEGES ON datasession.* TO 'root'@'%' IDENTIFIED BY 'mysql';
-- ALTER USER 'root'@'localhost' IDENTIFIED WITH mysql_native_password BY 'password'; 

USE datasession;

CREATE TABLE ass1(
    emp_id INTEGER PRIMARY KEY AUTO_INCREMENT NOT NULL,
    first_name VARCHAR(20) NOT NULL,
    last_name VARCHAR(20) NOT NULL,
    address VARCHAR(255) NOT NULL,
    city VARCHAR(20),
    age INTEGER NOT NULL
);

INSERT INTO ass1(first_name, last_name, address, city, age)
VALUES('Prashant', 'Brahmbhatt', 'Madhav Vihar', 'Aligarh', 22),
('Aman', 'Patel', 'ADA Colony', 'Lucknow', 23),
('Shivam', 'Mishra', 'Agra Road', 'Aligarh', 20),
('Pranjal', 'Singh', 'Preet Vihar', 'Delhi', 27),
('Vikrant', 'Thakur', 'Avas Vikas', 'Gorakhpur', 29);

SELECT * FROM ass1;

-- To allow the users to export or import using bash 
-- Add the line secure_file_priv = "" in the /etc/mysql/mysql.conf.d/mysqld.cnf 
-- The restart the service using sudo service mysql restart
-- chmod 1777 /var/lib/mysql-files/

SELECT * FROM ass1
INTO OUTFILE '/var/lib/mysql-files/ass1.csv' 
FIELDS ENCLOSED BY '"' 
TERMINATED BY ';' 
ESCAPED BY '"' 
LINES TERMINATED BY '\r\n';

CREATE TABLE ass2(
    emp_id INTEGER PRIMARY KEY AUTO_INCREMENT NOT NULL,
    first_name VARCHAR(20) NOT NULL,
    last_name VARCHAR(20) NOT NULL,
    address VARCHAR(255) NOT NULL,
    city VARCHAR(20),
    age INTEGER NOT NULL
);

-- NOT ABLE TO LOAD FROM IT
-- LOAD DATA INFILE "/var/lib/mysql-files/ass1.csv" INTO TABLE ass2(first_name, last_name, address, city, age) 
-- FIELDS ENCLOSED BY '"' 
-- TERMINATED BY ';' 
-- ESCAPED BY '"' 
-- LINES TERMINATED BY '\r\n';