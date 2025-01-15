with hold as (
  SELECT count(*) as usersnumber  FROM USERS   
)
SELECT contest_id, ROUND(count(*)::numeric/usersnumber * 100.0,2) as percentage  FROM Users
LEFT JOIN Register  on Users.user_id = Register.user_id
cross JOIN hold 
GROUP BY contest_id ,usersnumber
HAVING contest_id is not null
order by percentage desc , contest_id