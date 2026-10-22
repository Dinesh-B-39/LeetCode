# Write your MySQL query statement below
select max(new_emp.salary) as "SecondHighestSalary" from (select id,salary,dense_rank() over(order by salary desc)as lim from Employee) as new_emp where lim=2;
