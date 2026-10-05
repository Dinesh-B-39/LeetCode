# Write your MySQL query statement below
-- select d.name,e.name as Employees,max(salary) from Employee e join Department d on e.departmentId=d.id group by d.id;

select d.name as "Department",e.name as "Employee",e.salary as "Salary" from Employee e join Department d on e.departmentId=d.id join (select d.name as Dname,max(e.salary) as Esalary from Employee e join Department d on e.departmentId=d.id group by d.id) as t on t.Dname=d.name and e.salary=t.Esalary where t.Dname is not null;