-- Last updated: 7/9/2026, 3:18:26 PM
# Write your MySQL query statement below
# Write your MySQL query statement below
select Person.firstName, Person.lastName, Address.city ,Address.state 
FROM Person
LEFT JOIN Address
ON Person.personId = Address.personId;