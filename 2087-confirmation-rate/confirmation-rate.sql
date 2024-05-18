SELECT user_id ,
    ROUND(COALESCE((COALESCE(confirmed_number, 0) / NULLIF(number_request::FLOAT, 0))::numeric, 0), 2) AS confirmation_rate
FROM (
    SELECT a.user_id , COALESCE(number_request,0) AS number_request, COALESCE(confirmed_number, 0) AS confirmed_number
    FROM (SELECT user_id , COUNT(user_id) AS NUMBER_REQUEST 
    FROM Confirmations  GROUP BY user_id) c
    FULL  JOIN 
    Signups a ON  a.user_id  = c.user_id 
    LEFT JOIN 
        (SELECT user_id , action , COUNT(user_id) AS confirmed_number 
        FROM Confirmations   
        WHERE action='confirmed' GROUP BY action,user_id)  b 
        ON a.user_id = b.user_id
) ORDER BY confirmation_rate;

