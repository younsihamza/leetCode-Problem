
SELECT name 
FROM
(SELECT   managerId,COUNT(*) AS direct_reports FROM Employee    WHERE managerid IS NOT NULL GROUP BY managerId) a
LEFT JOIN Employee b ON b.id = a.managerId  WHERE direct_reports >= 5 AND id IS NOT NULL  ;