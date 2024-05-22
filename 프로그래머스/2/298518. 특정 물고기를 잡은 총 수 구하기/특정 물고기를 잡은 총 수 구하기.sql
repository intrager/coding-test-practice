select count(*) AS FISH_COUNT
from FISH_INFO info
inner join FISH_NAME_INFO name
        on info.FISH_TYPE = name.FISH_TYPE
where name.FISH_NAME in ('BASS', 'SNAPPER');