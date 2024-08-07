-- 코드를 입력하세요

select 
CATEGORY,
sum(sales) as TOTAL_SALES
from BOOK a,
(SELECT 
BOOK_ID,
sum(SALES) as sales
from BOOK_SALES 
where extract(year from SALES_DATE) = 2022 and extract(month from SALES_DATE) = 1
group by BOOK_ID) b
where a.BOOK_ID=b.BOOK_ID
group by CATEGORY
order by CATEGORY asc