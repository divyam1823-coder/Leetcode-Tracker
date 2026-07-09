-- Last updated: 7/9/2026, 3:16:29 PM
SELECT
    c.customer_id
FROM Customer c
GROUP BY c.customer_id
HAVING COUNT(DISTINCT c.product_key) =
(
    SELECT COUNT(*)
    FROM Product
);