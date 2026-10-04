# Write your MySQL query statement below
select z.name,z.balance from(
select u.name,sum(t.amount) as balance from Users u join Transactions t on u.account=t.account group by u.name
) as z where z.balance>10000
