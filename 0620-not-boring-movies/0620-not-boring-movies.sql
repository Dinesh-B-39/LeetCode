# Write your MySQL query statement below
select * from cinema c where c.id%2=1 and description not like "boring" order by rating desc
