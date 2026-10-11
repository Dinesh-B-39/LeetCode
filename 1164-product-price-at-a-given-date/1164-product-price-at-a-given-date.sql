# Write your MySQL query statement below
-- select product_id,t.new_price(select product_id,new_price from Products group by product_id having max(change_date)<="2019-08-16" order by change_date desc limit 1) as t where product_id=t.product_id from Products
select p.product_id,p.new_price as price from products p join (select product_id,MAX(change_date) as dat from Products WHERE change_date<="2019-08-16"  group by product_id ) as t on p.product_id=t.product_id and p.change_date=t.dat where t.dat is not null
UNION
select product_id,10 as "price" from Products group by product_id  having max(change_date)>"2019-08-16" and min(change_date)>"2019-08-16" order by product_id