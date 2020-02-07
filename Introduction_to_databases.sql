CREATE DATABASE exercise;

USE DATABASE exercise;

SHOW DATABASES;

CREATE TABLE orders(
order_no INT NOT NULL PRIMARY KEY,
order_amt INT,
customer_name VARCHAR(40),
customer_id INT NOT NULL
);

CREATE TABLE sales(
order_no INT NOT NULL PRIMARY KEY,
salesperson_id INT NOT NULL,
salesperson_name VARCHAR(30)
);

DESC orders;
DESC sales;

/*ALTER TABLE sales
ADD FOREIGN KEY (order_no) REFERENCES orders(order_no);*/


INSERT INTO orders VALUES
(1,1200,'prashant',32),(2,4000,'shubham',8),
(3,3400,'vishal',71),(4,5542,'ankit',9),
(5,8000,'ujjwal',98),(6,3123,'prashant',32),
(7,6740,'shubham',8);

INSERT INTO sales VALUES
(1,101,'ramesh'),(2,109,'suresh'),
(3,101,'ramesh'),(4,103,'mahesh'),
(5,104,'dinesh'),(6,109,'suresh'),
(7,103,'mahesh');


SELECT salesperson_name,COUNT(salesperson_id) as count FROM sales GROUP BY salesperson_name HAVING COUNT(*) > 1;

SELECT salesperson_id,salesperson_name,sales.order_no,order_amt FROM sales INNER JOIN orders ON sales.order_no=orders.order_no;

CREATE INDEX index1_sales ON sales(salesperson_id);

SHOW INDEX FROM sales;

SELECT sales.order_no, salesperson_name, customer_name FROM sales
INNER JOIN orders
ON sales.order_no=orders.order_no;




