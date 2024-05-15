SELECT name , bonus FROM (
SELECT * FROM Employee AS  a
FULL JOIN Bonus AS b ON a.empId = b.empId
)
WHERE bonus < 1000  OR bonus IS NULL ;
