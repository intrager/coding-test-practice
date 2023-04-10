WITH 맛 AS(
    SELECT FLAVOR, SUM(TOTAL_ORDER) AS 판매량
      FROM (SELECT FLAVOR, TOTAL_ORDER
              FROM FIRST_HALF
            UNION ALL
            SELECT FLAVOR, TOTAL_ORDER
              FROM JULY
            )
    GROUP BY FLAVOR
)
, 랭크 AS (
    SELECT FLAVOR, 판매량
           , RANK() OVER (ORDER BY 판매량 DESC) AS RANK
      FROM 맛
)
SELECT FLAVOR
  FROM 랭크
 WHERE RANK <= 3;