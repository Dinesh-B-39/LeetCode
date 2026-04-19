# Write your MySQL query statement below

select p.firstName,p.lastName,a.city,a.state from
Person p left join Address a on p.personId=a.personId


-- select p.firstname,p.lastname,a.city,a.state from person p
-- left join address a
-- on p.personid=a.personid;