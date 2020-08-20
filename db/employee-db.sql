DROP TABLE IF EXISTS department;
CREATE TABLE department(id INT PRIMARY KEY, name VARCHAR(255));

DROP TABLE IF EXISTS employee;
CREATE TABLE employee(
	id INT PRIMARY KEY, 
	first_name VARCHAR(255), 
	last_name VARCHAR(255),
	department_id INT
	);

DROP TABLE IF EXISTS address;
CREATE TABLE address(
	id INT PRIMARY KEY,
	employee_id INT,
	address_line_1 VARCHAR(255),
	address_line_2 VARCHAR(255),
	apartment_suit VARCHAR(255),
	zip_code VARCHAR(255),
	city VARCHAR(255),
	state VARCHAR(255),
	country VARCHAR (255)
	);

ALTER TABLE employee ADD FOREIGN KEY (department_id) REFERENCES department(id) ;
ALTER TABLE address ADD FOREIGN KEY (employee_id) REFERENCES employee(id) ;

INSERT INTO department VALUES(1, 'SHIELD');
INSERT INTO department VALUES(2, 'Avengers');
INSERT INTO department VALUES(3, 'Hydra');

INSERT INTO employee VALUES(1, 'Nick', 'Fury', '1');
INSERT INTO employee VALUES(2, 'Tony', 'Stark', '2');
INSERT INTO employee VALUES(3, 'Arnim', 'Zola', '3');

INSERT INTO address VALUES (1, 1, 'Theodore Roosevelt Island', '',
	'001', '12345', 'Washington', 'DC', 'USA');
INSERT INTO address VALUES (2, 2, 'Fifth Avenue', 'Manhattan',
	'890', '12345', 'New York', 'NY', 'USA');
INSERT INTO address VALUES (3, 3, 'Unknown Av.', '',
	'000', '12-34', 'Berlin', 'Brandenburg', 'Germany');
