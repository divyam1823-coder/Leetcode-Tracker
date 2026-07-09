-- Last updated: 7/9/2026, 3:16:46 PM
# Write your MySQL query statement below
UPDATE Salary
SET sex = CASE
              WHEN sex = 'f' THEN 'm'
              ELSE 'f'
          END;