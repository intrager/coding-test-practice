select ROUND(AVG(case when length is null then 10
                      else length end), 2) as AVERAGE_LENGTH
from FISH_INFO;