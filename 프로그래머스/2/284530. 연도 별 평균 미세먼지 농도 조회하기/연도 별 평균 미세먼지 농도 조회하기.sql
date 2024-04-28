select 
    -- DATE_FORMAT(YM, '%Y') AS YEAR,    -- 문자열 출력 (오답)
    -- LEFT(YM, 4) AS YEAR,              -- 문자열 출력 (오답)
    year(YM) as 'YEAR'
  , round(avg(PM_VAL1), 2) as PM10
  , round(avg(PM_VAL2), 2) as 'PM2.5'
from AIR_POLLUTION
where LOCATION1 = '경기도'
  and LOCATION2 = '수원'
group by YEAR
order by YEAR;