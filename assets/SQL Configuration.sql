CREATE DATABASE IF NOT EXISTS inventory_system;

use inventory_system;

CREATE TABLE products (
    id int(11) PRIMARY KEY AUTO_INCREMENT,
    product_name varchar(40),
    product_code varchar(40),
    product_quantity int(11),
    product_price int(11)
)