# Write your MySQL query statement below
Select c.customer_id FROM Customer c GROUP BY c.customer_id
HAVING
 COUNT(distinct c.product_key) = (
    SELECT COUNT(*)FROM Product);