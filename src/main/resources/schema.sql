DROP DATABASE IF EXISTS stock_service;
CREATE DATABASE stock_service;
USE stock_service;
DROP TABLE IF EXISTS tbl_stock CASCADE;
CREATE TABLE tbl_stock (
    stock_num BIGINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    item_name VARCHAR(255),
    item_price BIGINT UNSIGNED,
    stock_quantity SMALLINT UNSIGNED
);