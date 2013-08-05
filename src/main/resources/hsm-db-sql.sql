--create database

-- master database
create database master character set `gbk` collate `gbk_chinese_ci`;
-- slave database
create database slave character set `gbk` collate `gbk_chinese_ci`;


-- create tables 
use master;
create table users(
id int not null auto_increment,
name varchar(20),
age int,
primary key(id)) ENGINE = INNODB,AUTO_INCREMENT=1000;

use slave;
create table user_info(
id int not null auto_increment,
uid int,
info varchar(20),
primary key(id)) ENGINE = INNODB,AUTO_INCREMENT=1000;


--insert data

use master;
insert into users(name,age) values('xkorey',28);
use slave;
insert into user_info(uid,info) values(1000,'hello xkorey.');
