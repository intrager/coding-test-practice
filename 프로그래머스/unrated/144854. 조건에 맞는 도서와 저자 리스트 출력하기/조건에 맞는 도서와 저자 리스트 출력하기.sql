SELECT a.BOOK_ID as BOOK_ID, b.AUTHOR_NAME as AUTHOR_NAME, date_format(a.PUBLISHED_DATE, '%Y-%m-%d') as PUBLISHED_DATE
from BOOK as a join AUTHOR as b on a.author_id = b.AUTHOR_ID 
where a.CATEGORY = '경제'
order by a.PUBLISHED_DATE asc;