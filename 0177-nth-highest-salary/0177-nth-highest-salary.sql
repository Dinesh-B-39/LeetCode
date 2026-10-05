CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
    declare m int;
    set m=n-1;
  RETURN (
      select salary from (select distinct salary as salary from Employee) as t
      order by salary desc limit m,1

  );
END