Create Database cars;
use cars;

Create table BMW(Id INT PRIMARY KEY,
  color VARCHAR(50),
  speed VARCHAR(50),
  car_engine VARCHAR(10),
  family VARCHAR(20));
  
INSERT INTO BMW VALUES 
(9, 'red', '380kmph', 'V4',null),
(5, 'white', '200kmph', 'V4','SUV'),
(6, 'blue', '340kmph', 'V6','Hatchback'),
(7, 'black', '300kmph', 'V8','SUV')
;
Select * from BMW;

Select Distinct car_engine from BMW;

Select family from BMW where car_engine="V8";

Update BMW set color="ivory" where family="Sedan";

Select * from BMW;

SELECT * FROM BMW
WHERE color LIKE 'i%';


Select * from BMW where ID Between 2 AND 3;
 
 
CREATE TABLE customer(
customer_id INT NOT NULL PRIMARY KEY,
name VARCHAR(20)
);

CREATE TABLE orders(
order_id INT NOT NULL PRIMARY KEY,
amount INT,
customer int
);

insert into customer values (1,'Sahil'),
(2,'Nupur'),
(3,'Kaustubh'),
(4,'Rutuja'),
(5,'Jenil')


 insert into orders values (1,200,9),
 (2,500,1),
 (3,400,11),
 (4,600,20),
 (5,1500,4)
 
 SELECT * FROM customer;
 SELECT * FROM orders;
 
 SELECT customer.customer_id,customer.name,orders.amount FROM customer INNER JOIN orders ON customer.customer_id=orders.customer;
 
 SELECT customer.customer_id,customer.name,orders.amount FROM customer LEFT OUTER JOIN orders ON customer.customer_id=orders.customer;
 
 SELECT customer.customer_id,customer.name,orders.amount FROM customer RIGHT OUTER JOIN orders ON customer.customer_id=orders.customer;
 
 SELECT customer.customer_id,customer.name,orders.amount FROM customer LEFT OUTER JOIN orders ON customer.customer_id=orders.customer UNION 
 SELECT customer.customer_id,customer.name,orders.amount FROM customer RIGHT OUTER JOIN orders ON customer.customer_id=orders.customer;
 
 SELECT * FROM customer NATURAL JOIN orders WHERE customer.customer_id=orders.order_id;
 
 SELECT * FROM orders NATURAL JOIN customer WHERE customer.customer_id=orders.order_id;
 
  
use cars;
SELECT COUNT(ID),family
FROM BMW
GROUP BY family;

use cars;
SELECT COUNT(ID),family
FROM BMW
GROUP BY family having count(ID)>2;

SELECT ID,color, ISNULL(family) FROM BMW;
SELECT ID,color, IFNULL(family,"Just BMW XD") FROM BMW;







 
