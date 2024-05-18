-- Write your PostgreSQL query statement below
SELECT a.student_id ,a.student_name ,b.subject_name, COALESCE(attended_exams,0) AS attended_exams FROM Students a
CROSS JOIN Subjects b
FULL JOIN
(SELECT  student_id,subject_name,COUNT(*) AS attended_exams FROM Examinations
GROUP BY subject_name , student_id) c ON a.student_id = c.student_id AND b.subject_name = c.subject_name ORDER BY a.student_id ,b.subject_name   ASC;