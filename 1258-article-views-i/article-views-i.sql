-- Write your PostgreSQL query statement below
SELECT author_id  as id FROM Views WHERE author_id = viewer_id GROUP BY author_id;