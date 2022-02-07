use classicmodels;

select * from customers;

select cid,cname,postalcode  from customers where postalcode ='44000';

select distinct(country) from customers;

select * from customers where country='italy';

select * from customers where state is null;

select country,state  from customers group by country,state;

select max(creditlimit) cl from customers;

select creditlimit from customers order by creditlimit  desc limit 1;

select * from employees where salary  (1321231);

select * from employee where deptid = (select depid from deparmnt where name ="sales");

use employees;

select * from employees where emp_no in (select emp_no from dept_emp where dept_no = (select  dept_no  from departments where  dept_name='finance'));

select salary from salaries order by salary desc;
select salary from salaries order by salary desc  limit 1 offset 2;
use db;
create table emp2 as select * from emp where 1=0;
select * into emp2 from emp;
insert into emp values(121,'aSDd', 10,'wddasdad');
drop table emp2;

use db;

show create table employees;

drop table test;

CREATE   TABLE `test5` (
  `emp_no` int primary key,
  `name` varchar(30) NOT NULL ,
  gend  char(1), 
  `age` int 
) ;

drop table test6;
CREATE   TABLE `test11` (
  `emp_no` int ,
  `name` varchar(30) NOT NULL ,
  gend  char(1), 
  `age` int,
  kk int
) ;

insert into test7 values (33453453,'vbc','F',28);

select * from test7;

update test5 set emp_no = 4567 where emp_no=33453453;

drop table employees;

truncate table test2;

delete from  test2;

alter table test modify column gend char(2);
alter table test drop constraint namecheck;

insert into test3 values (1,'vbc','F',28),
									(2,'kbk','M',28),
                                    (3,'lok','F',948),
                                    (47,'ljk','M',88),
                                    (5,'kll','M',68),
                                    (92,'luh','F',38),
                                    (7,'lkk','M',58),
                                    (101,'ka','F',18);

select * from test t1 join test2 t2 join test3 t3 where t1.emp_no=t2.emp_no and t3.emp_no=t2.emp_no;

select * from test t1 , test2 t2 , test3 t3 where t1.emp_no=t2.emp_no and t3.emp_no=t2.emp_no;

select * from test t1 natural join  test2 t2 natural join test3 ;

update test3 set name='abc',gend='M',age='38' where emp_no=1;

with kk as
(select emp_no,name from test3 union all select emp_no,name from test2)
select count(*) from kk;

-- union and union all (mysql full join)

select emp_no,name from test3 
union all
select emp_no,name from test2
 union all
select emp_no,name from test;

-- triggers 

drop trigger test_AFTER_INSERT_1;

DELIMITER $$
USE `db`$$
CREATE TRIGGER `db`.`test_AFTER_INSERT` AFTER INSERT ON `test2` FOR EACH ROW 
begin
if new.emp_no>9 then
update test2 set new.emp_no=new.emp_no+1;
end if;
end
$$
DELIMITER ;

insert into test values(56,'wewrer','M',23);
select * from test2;

select user();

show tables;

drop table updateempno;

repair table emp;

insert into test(name) values('kkkkkk');

insert into test value (345,'pradeep','M',67);

insert into test(emp_no,name) values (400,'pradeep')  on duplicate key update name ='narender';

select * from test;
truncate table test10;

alter table test add primary key(emp_no);

insert ignore into test11 values (1111,'vbc','F',28,99);

insert into test10  (select * from test11);


alter table test11 drop column age,
drop column kk;


select * from test10;

CREATE   TABLE `test20` (
  `emp_no` int primary key,
  `name` varchar(30) NOT NULL ,
	gend  char(1), 
  `age` int 
) ;

show index from test20;




