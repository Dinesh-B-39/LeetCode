# Write your MySQL query statement below
select T.date_id,T.make_name,T.unique_leader as unique_leads,P.unique_partner as unique_partners  from
(select date_id,make_name,count(distinct lead_id) as unique_leader from DailySales group by date_id,make_name)as T 
join
(select date_id,make_name,count(distinct partner_id) as unique_partner from DailySales group by date_id,make_name) as P on T.date_id=P.date_id and T.make_name=P.make_name