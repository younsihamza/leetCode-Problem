-- Write your PostgreSQL query statement below
SELECT  TO_CHAR(trans_date, 'YYYY-MM') as month, country, count(*) as trans_count ,
        SUM(case when state='approved' THEN 1 ELSE 0 END) as  approved_count, 
        sum(amount) as trans_total_amount,
        sum(CASE WHEN state='approved' THEN amount ELSE 0 END) as approved_total_amount
FROM Transactions
GROUP BY  TO_CHAR(trans_date, 'YYYY-MM'), country