# Write your MySQL query statement below
select round((count(*)/(select count(distinct customer_id) from delivery))*100,2) as immediate_percentage from Delivery d join (select customer_id,min(order_date) as dat,count(*) as z from Delivery group by customer_id) as k on d.customer_id=k.customer_id and d.order_date=k.dat where 
k.dat is not null and d.customer_pref_delivery_date=k.dat