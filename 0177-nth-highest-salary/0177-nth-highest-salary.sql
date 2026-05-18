CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
    DECLARE m int;
    set m=n-1;
  RETURN (
      # Write your MySQL query statement below.
      select distinct salary from employee order by salary desc limit m,1

  );
END