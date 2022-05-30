use mysql;

show tables;
select * from servers;

use db;
select version();
create database kk;
drop database kk;
create table emp(id int,name varchar(30));
drop table emp;
describe emp;
rename table emp to kk;
alter table kk rename to emp;
truncate table emp;

alter table emp add column phonenumber int,
						add column  address varchar(50);
                        
alter table emp add  primary key(id);
alter table emp add primary key (age);
ALTER table emp add unique(phonenumber);
insert into emp values(222,"suresh","chennai","ssdfasdf",45673 );
select * from emp;

alter table emp add constraint  numbercheck check ( phonenumber = 10);

insert into emp values (1221,'narender','delhi''asjdjdfjdfskjfjsf',9879798978);
insert into emp(id,name,phonenumber) values(13123,'hari',878909876);
update  emp set name = "pradeep" where id=1235;

-- batch insert
insert into emp value(3444421,'gg','sdsd','qwwqeqe',23123123),
(4324,'gg','sdsd','qwwqeqe',412123),
(31,'gg','sdsd','qwwqeqe',234444);


select distinct name,city from emp;
select distinct * from emp;
select name from emp where not name='gg';
alter table emp add column age int check (age>=18);
desc emp;
alter table emp drop  column address;
alter table emp modify  column name  varchar(25) ;
alter table emp rename column empname to pname;
alter table emp drop index phonenumber_2;
show index from emp;

alter table emp add constraint unique key(phonenumber);


alter table emp add constraint age check(age>18); 

use classicmodels;
rename table kk to orders;

alter table emp drop  index phonenumber;
alter table emp add  unique(phonenumber);
desc customers;
use classicmodels;

/* with clause CTE*/
with avglimit as (select avg(creditlimit) hh from customers)
select  customernumber cnumber,customername  cname from customers where  customernumber like "%4"  order by cname;

-- case clause
select customernumber,customername cname,
			case  
				when creditlimit > 89787 then "high"
				when creditlimit < 34564 then "medium"
				else  "medium" end kk
             from customers order by cname limit 20;
             
 alter table customers rename   column  contactLastName  to  clastname,
									rename   column contactFirstName  to  cfirstname;


use employees;
-- joins

-- inner join

select  dm.emp_no as kk ,e.emp_no as pk from employees  e inner join dept_manager dm on e.emp_no = dm.emp_no order by e.first_name desc;
 
with temp as
(select  dm.emp_no as kk ,e.emp_no as pk from employees  e inner join dept_manager dm on e.emp_no = dm.emp_no order by e.first_name desc) 
 select *  from temp where temp.pk='111877';
 
 -- delete on join
 delete   employees from  employees  inner join dept_manager on employees.emp_no = dept_manager.emp_no 
 where employees.emp_no='110039';
 
 select * from employees where emp_no='111692';

select temp.emp_no  as kk from temp;

-- update on join

update employees e join dept_manager dm on  e.emp_no = dm.emp_no set last_name = 'viramalla' where e.emp_no='111692';

-- delete from temp where e.emp_no=111939;

select dept_no, count(emp_no) as empcount from dept_manager group by dept_no;
select dept_no, avg(emp_no) as empcount from dept_manager group by dept_no;

-- natuaral join
select * from employees  natural  join dept_manager ;

-- left outer join or left join
select * from employees e left outer join  dept_manager  dm on e.emp_no = dm.emp_no order by dm.emp_no desc;

-- right outer join or right join
select * from employees e right outer join dept_manager dm on e.emp_no=dm.emp_no;

-- full join 
with kkk  as
(select e.emp_no from employees e left join dept_manager dm on e.emp_no = dm.emp_no
union all
select dm.dept_no  from employees em right join dept_manager dm on em.emp_no = dm.emp_no)
select count(*) from kkk;

-- cross join
select count(*) from employees e cross join dept_manager d order by e.emp_no, d.emp_no desc;

with kkk as 
(select emp_no from employees group by emp_no  having count(emp_no)>=1  order by first_Name)
select count(*) from kkk;

select * from dept_emp;

-- self join
use employees;
select dep1.dept_no, count(*) from dept_emp dep1 left  join dept_emp dep2 on dep1.dept_no=dep2.emp_no group by dep1.dept_no order by dep1.dept_no;

-- views

create or replace view employeeview  as select emp_no from employees limit 100;

select * from employeeview;

alter view employeeview as select emp_no  from emp_no;

create or replace view   employeeview as select first_name ,last_name from employees limit 10;

select * from test;

update test set first_name='park' where last_name='Bamford';
use employees;

set autocommit=0;

savepoint a;

select * from departments;

update departments set dept_name='cs' where dept_no='d009';

rollback to a;

select autocommit;

SHOW GRANTS FOR root@localhost;  

GRANT ALL ON mystudentdb.* TO dd@localhost;  

/* SELECT: It enables us to view the result set from a specified table.
INSERT: It enables us to add records in a given table.
DELETE: It enables us to remove rows from a table.
CREATE: It enables us to create tables/schemas.
ALTER: It enables us to modify tables/schemas.
UPDATE: It enables us to modify a table.
DROP: It enables us to drop a table.
INDEX: It enables us to create indexes on a table.
ALL: It enables us to give ALL permissions except GRANT privilege.
GRANT: It enables us to change or add access rights.*/

CREATE USER john@localhost IDENTIFIED BY 'jtp12345';  

SHOW GRANTS FOR john@localhost;  

REVOKE UPDATE, INSERT ON *.*  from  john@localhost;  

REVOKE update  ON mystudentdb.* FROM john@localhost; 

select emp_no,  if(salary>5000,"good","ok") as res  from salaries order by salary;


-- database abd table info;

show engines;
show table status like 'employees'; 
SHOW CREATE TABLE employees;
SHOW CREATE database employees;
start transaction;
-- all
commit;

-- pagination -1 
select salary from salaries order by salary desc limit 2,1;
-- pagination -2 
select salary from salaries order by salary desc  limit 1 offset 2;

-- nth salry 
-- params  n-1,1
-- for 11 highest salry
select salary from salaries order by salary desc limit 10,1;

use employees;

select * from mysql.USER;
create user if not exists   viru identified by '1234';
 REPAIR TABLE vehicle;  

-- table locking 

select user from mysql.user;

alter user 'pradeep@localhost' account lock;

use employees; 

-- union and union all (mysql full join)
-- uniaon all
select emp_no,name from test3 
union all
select emp_no,name from test2
 union all
select emp_no,name from test;

-- union
select emp_no,name from test3 
union
select emp_no,name from test2
union
select emp_no,name from test;

 
 create user  abc@localhost identified by '123456a';
 
  alter user abc@localhost identified by '123456a' account lock;
 
 alter user abc@localhost identified by '123456a' account unlock;
 
 show grants for abc@localhost;
 
 



