# Write your MySQL query statement below
select person_name from (select person_id,person_name,weight,turn as x,
case
    when turn=1 then weight
else weight+(select sum(weight) from Queue where turn<x)
end as total_weight from Queue) as t  where total_weight<=1000 order by total_weight desc limit 1