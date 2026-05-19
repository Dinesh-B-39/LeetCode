# Write your MySQL query statement below
select w2.id from weather w1 join weather w2
            on DATE_ADD(w1.recordDate,INTERVAL 1 DAY)=w2.recorddate
            and w1.temperature<w2.temperature
