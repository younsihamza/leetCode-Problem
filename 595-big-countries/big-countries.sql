-- Write your PostgreSQL query statement below
SELECT name, population, area FROM World WHERE population >= (25*10^6) OR area >= (3*10^6);