SELECT t2.id  FROM Weather t1
JOIN Weather t2 on t1.recordDate =  t2.recordDate - INTERVAL '1 DAY'
WHERE  t1.temperature < t2.temperature;
