select count(*) as fish_count
from FISH_INFO
where DATE_FORMAT(time, '%Y') = '2021';