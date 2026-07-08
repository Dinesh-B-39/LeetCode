# Write your MySQL query statement below
select w2.id from weather w1 join weather w2 on date_add(w1.recordDate,interval 1 day)=w2.recorddate and w1.temperature<w2.temperature