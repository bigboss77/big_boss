-- 1、删除数据库
DROP DATABASE LoginTest; 
-- 2、创建数据库
CREATE DATABASE LoginTest;
-- 3、使用数据库 
USE LoginTest;
-- 4、删除数据表
DROP TABLE admin;
-- 5、创建数据表
CREATE TABLE admin(
	aid    VARCHAR(50)  ,
	password VARCHAR(32),
	CONSTRAINT pk_aid PRIMARY KEY(aid)
);
-- 6、增加测试数据
INSERT INTO admin(aid,password) VALUES('admin','bigboss');
-- 7、提交
COMMIT;
