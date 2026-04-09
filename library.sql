CREATE DATABASE IF NOT EXISTS book DEFAULT CHARSET utf8;
USE book;

-- 删除旧表（避免重复执行报错）
DROP TABLE IF EXISTS book;
DROP TABLE IF EXISTS users;

-- 图书表
CREATE TABLE book(
	book_id INT PRIMARY KEY,
	book_name VARCHAR(20),
	book_state VARCHAR(20),
	book_place VARCHAR(20)
);
INSERT INTO book (book_id,book_name,book_state,book_place) VALUES (1,'Java','未借出','A架1层');
INSERT INTO book (book_id,book_name,book_state,book_place) VALUES (2,'C++','未借出','A架2层');
INSERT INTO book (book_id,book_name,book_state,book_place) VALUES (3,'数据结构','未借出','B架1层');
INSERT INTO book (book_id,book_name,book_state,book_place) VALUES (4,'Python','未借出','B架2层');

-- 用户表
CREATE TABLE users(
	user_name VARCHAR(20) PRIMARY KEY,
	password VARCHAR(20)
);
INSERT INTO users (user_name,password) VALUES ('admin','123456');