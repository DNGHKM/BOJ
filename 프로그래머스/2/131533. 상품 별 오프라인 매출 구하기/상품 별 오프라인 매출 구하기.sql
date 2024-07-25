-- 코드를 입력하세요
SELECT
b.PRODUCT_CODE,
sum(a.SALES_AMOUNT)*b.price SALES
from OFFLINE_SALE as a
join PRODUCT as b
on a.PRODUCT_ID = b.PRODUCT_ID
group by a.PRODUCT_ID
order by SALES desc, b.PRODUCT_CODE asc