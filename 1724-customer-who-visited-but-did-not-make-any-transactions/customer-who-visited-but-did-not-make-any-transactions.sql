SELECT customer_id,COUNT(customer_id) as count_no_trans FROM Visits
LEFT JOIN Transactions ON Visits.visit_id =  Transactions.visit_id WHERE transaction_id iS NULL
GROUP BY customer_id;