# Write your MySQL query statement below
select product_id,product_name from Product where product_id not in(
select p.product_id from product p left join
                sales s on p.product_id=s.product_id
                where s.sale_date<'2019-01-01' or s.sale_date>'2019-03-31' or s.sale_date is null)
