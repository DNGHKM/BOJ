-- 코드를 입력하세요
SELECT BOOK_ID, 
date_format(PUBLISHED_DATE, "%Y-%m-%d") as PUBLISHED_DATE
from BOOK
where category = '인문' && year(PUBLISHED_DATE)=2021
order by published_date asc