CREATE TABLE IF NOT EXISTS employees (
	id INT AUTO_INCREMENT PRIMARY KEY,
	first_name VARCHAR NOT NULL,
	last_name VARCHAR NOT NULL,
	salary DECIMAL(8,2) NOT NULL
);

INSERT INTO employees (first_name, last_name, salary) VALUES ('John', 'Doe', 120000);
INSERT INTO employees (first_name, last_name, salary) VALUES ('Red', 'Blue', 480000);