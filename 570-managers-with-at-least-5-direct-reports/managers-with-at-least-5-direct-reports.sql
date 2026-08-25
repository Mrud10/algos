# Write your MySQL query statement below
Select o.name FROM Employee n JOIN Employee o 
ON 
n.managerId = o.id
GROUP BY 
o.name,o.id
HAVING
COUNT(n.managerId) >= 5
