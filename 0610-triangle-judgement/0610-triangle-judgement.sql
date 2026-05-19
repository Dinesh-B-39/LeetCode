# Write your MySQL query statement below
select x,y,z,
case
when x+y>z and y+z>x and x+z>y THEN "Yes"
Else "No"
End as triangle
from triangle
