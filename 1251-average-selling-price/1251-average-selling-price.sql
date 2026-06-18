# Write your MySQL query statement below
select p.product_id,ROUND(IFNULL((sum(u.units*p.price)/sum(u.units)),0),2) as average_price from prices p LEFT join unitssold u on 
P.PRODUCT_ID=U.PRODUCT_ID AND 
u.purchase_date>=p.start_date and u.purchase_date<=p.end_date group by p.product_id