-- SQL Query - Workbench - Test
-- SQL Query - Core Java - Application
-- SQL Query - Servlet - Application
-- DDL (Data Definition Language)

-- Database Management
create database java3; -- Ctrl+Shift+Enter
use java3; -- Activate Database -- Ctrl+Enter
show databases;
-- drop database java3;

-- Data types
    -- int, double(m, d)
	-- timestamp
    -- char(m)
    -- varchar(m)

-- Table Management

CREATE TABLE contacts(
	id int NOT NULL AUTO_INCREMENT PRIMARY KEY, 
    full_name varchar(50),
    contact_address varchar(50)    
);

use java3;
show tables;
drop table contacts;

-- insert record
insert into contacts(full_name, contact_address) values('Raj Rai','NEP');

-- select record
select * from contacts;

-- search record
select * from contacts;
select * from contacts where full_name='Roshan Thapa';
select * from contacts where contact_address='IND';
select * from contacts where id=2;

-- delete record
delete from contacts;
delete from contacts where id=4;

-- alter table - reset auto increment
alter table contacts auto_increment = 1;

-- update
update contacts set full_name='Roshan Thapa', contact_address='IND' where id=2;








