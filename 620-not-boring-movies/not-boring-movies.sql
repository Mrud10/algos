# Write your MySQL query statement below
select id,movie,description,rating FROM Cinema 
WHERE id % 2=1 AND description != 'boring'
ORDER BY rating desc;