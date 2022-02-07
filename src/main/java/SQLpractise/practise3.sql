use pract;

SELECT upper(first_name) as workername FROM pract.Worker;

select distinct (DEPARTMENT) from Worker;

select substring(first_name,1,3) from Worker;

SELECT  INSTR(FIRST_NAME, 'a') FROM Worker WHERE  FIRST_NAME = 'Amitabh';

Select RTRIM(FIRST_NAME) from Worker;

Select LTRIM(FIRST_NAME) from Worker;

select distinct (DEPARTMENT) as dep , length(DEPARTMENT) as len from Worker;

Select REPLACE(FIRST_NAME,'a','A') from Worker where FIRST_NAME = 'Amitabh';

SELECT CONCAT(FIRST_NAME, ' ', LAST_NAME) name FROM pract.Worker;

select * from worker order by first_name;

select * from worker order by first_name , DEPARTMENT desc;

select * from worker where first_name ='Satish' or first_name = 'Vipul' ;

select * from worker where first_name not in ('vipul', 'satish');

select * from worker where department = 'admin';

select * from worker where first_name regexp '[a-zA-Z]{6}h$';

select * from worker where salary >=100000 and salary<=300000;

select * from worker where joining_date >=  date('2014-02-01') and joining_date <=  date('2014-02-28');

select count(*) from worker where department = 'Admin';

select CONCAT(FIRST_NAME, ' ', LAST_NAME) as name from worker where salary >=100000 and salary<=300000;

SELECT CONCAT(FIRST_NAME, ' ', LAST_NAME) As Worker_Name, Salary
FROM worker 
WHERE WORKER_ID IN 
(SELECT WORKER_ID FROM worker 
WHERE Salary BETWEEN 100000 AND 300000);

select 	department ,count(*) as count from worker group by department order by count;

select * from worker w , title t where t.worker_title='manager' and t.worker_ref_id=w.worker_id;

select * from worker w join title t where t.worker_title='manager' and t.worker_ref_id=w.worker_id;

SELECT WORKER_TITLE, AFFECTED_FROM, COUNT(*)
FROM Title GROUP BY WORKER_TITLE, AFFECTED_FROM HAVING COUNT(*) > 1;

select WORKER_TITLE, count(*) from title group by 1 having count(*)>1;

SELECT * FROM Worker WHERE MOD (WORKER_ID, 2) = 0;
SELECT * FROM Worker WHERE MOD (WORKER_ID, 2) <>0;


create table cloneTable2 as select * from title where 1=0;


select * from cloneTable;
SELECT * INTO clone1 FROM title;

select * from title
natural join cloneTable;
select * from worker  where worker_id not in (select worker_ref_id from title);
insert into worker(worker_id,first_name,last_name,salary) values(65,'klm','njk',400000); 
select curdatetime();
select * from worker      limit 5;
select * from worker limit 15,5;
select distinct(salary) from worker order by salary desc limit 1,1;

SELECT Salary
FROM Worker W1
WHERE 4 = ( SELECT COUNT( DISTINCT ( W2.Salary ) )
 FROM Worker W2
 WHERE W2.Salary >= W1.Salary
 );

select * from worker
union all
select * from worker;

 select   worker_id,first_name from  worker where  row_number() over(order by worker_id)>=(select count(worker_id)/2 from worker);

-- set @ct := (select count(worker_id)/2 from worker)
select  @ct :=6;
select *  from worker limit @ct;

SELECT t.DEPARTMENT,t.FIRST_NAME,t.Salary from(SELECT max(Salary) as TotalSalary,DEPARTMENT from Worker group by DEPARTMENT) as TempNew 
Inner Join Worker t on TempNew.DEPARTMENT=t.DEPARTMENT and TempNew.TotalSalary=t.Salary;
 
 select DEPARTMENT, salary from worker where  salary in (select max(salary) from worker group by DEPARTMENT);
 
 SELECT distinct Salary from worker a WHERE  (SELECT count(distinct Salary) from worker b WHERE b.Salary >= a.Salary) <= 3 order by a.Salary desc;
 
 
 SELECT distinct Salary from worker a WHERE  (SELECT count(distinct Salary) from worker b WHERE b.Salary <= a.Salary) <= 3 order by a.Salary desc;

use pract;

select * from worker where salary in (select max(salary) from worker);

select * from worker  join  (select  max(salary) from worker) maxsal;

(select  max(salary) from worker);

select w.*,  max(salary) over(partition by department ) as 'max salry'  from worker w;

-- aggreegate - max,min,sum

-- rank functions - rank, densse_rank, row_number,ntile

select * from(select *,  dense_rank() over(order  by salary desc)  kk  from worker) w where kk = 1 limit 1;

select w.*,  rank() over(order  by salary desc ) kk  from worker w ;

select w.*,  row_number() over(order by salary desc) ronm  from worker w ;

select w.*,  ntile(2) over() ronm  from worker w where w.ronm <=1;

select * from (select *, ntile(2) over(order by worker_id) nt from worker) t where t.nt = 2;






