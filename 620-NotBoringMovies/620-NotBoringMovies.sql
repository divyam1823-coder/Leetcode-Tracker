-- Last updated: 7/9/2026, 3:16:50 PM
# Write your MySQL query statement below
# Write your MySQL query statement below

SELECT *
FROM cinema c
WHERE c.id % 2 =1 
    AND 
    c.description != 'boring'
ORDER BY c.rating DESC;