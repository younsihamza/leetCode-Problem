with help as (
    SELECT * ,rank() OVER(partition by customer_id order by order_date) 
    FROM Delivery
)

SELECT 
    ROUND(
        SUM(CASE WHEN order_date = customer_pref_delivery_date THEN 1 ELSE 0 END)::numeric / SUM(1)::numeric * 100.0,2) 
        as immediate_percentage
FROM help
WHERE rank = 1;
