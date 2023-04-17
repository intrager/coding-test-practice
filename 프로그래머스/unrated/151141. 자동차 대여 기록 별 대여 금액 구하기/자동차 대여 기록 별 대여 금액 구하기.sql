WITH 트럭 AS(
    SELECT CAR_ID, CAR_TYPE, DAILY_FEE
      FROM CAR_RENTAL_COMPANY_CAR
     WHERE CAR_TYPE = '트럭'
)
, 대여 AS(
    SELECT A.HISTORY_ID
           , B.CAR_TYPE 
           , A.CAR_ID
           , (A.END_DATE-A.START_DATE + 1) AS RENTAL_DATE
           , CASE WHEN (A.END_DATE - A.START_DATE + 1) BETWEEN 7 AND 29 THEN '7일 이상'
                  WHEN (A.END_DATE - A.START_DATE + 1) BETWEEN 30 AND 89 THEN '30일 이상'
                  WHEN (A.END_DATE - A.START_DATE + 1) >= 90 THEN '90일 이상'
                  ELSE '7일 이하'
              END AS DURATION_TYPE
           , B.DAILY_FEE
      FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY A
           INNER JOIN 트럭 B
           ON A.CAR_ID = B.CAR_ID
)
, 계산 AS(
    SELECT A.HISTORY_ID, A.DAILY_FEE, A.RENTAL_DATE, B.DURATION_TYPE
           , CASE WHEN A.DURATION_TYPE = '7일 이하' THEN TO_NUMBER(A.RENTAL_DATE * A.DAILY_FEE)
                  ELSE (TO_NUMBER(A.RENTAL_DATE * A.DAILY_FEE * (1-(B.DISCOUNT_RATE/100))))
              END AS FEE
      FROM 대여 A
           LEFT OUTER JOIN CAR_RENTAL_COMPANY_DISCOUNT_PLAN B
           ON A.CAR_TYPE = B.CAR_TYPE
           AND A.DURATION_TYPE = B.DURATION_TYPE
)
SELECT HISTORY_ID, FEE
  FROM 계산
ORDER BY FEE DESC, HISTORY_ID DESC;