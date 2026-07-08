# Write your MySQL query statement below
select n.name,b.bonus FROM Employee n LEFT JOIN Bonus b ON b.empId = n.empId where b.bonus < 1000 or b.bonus is null