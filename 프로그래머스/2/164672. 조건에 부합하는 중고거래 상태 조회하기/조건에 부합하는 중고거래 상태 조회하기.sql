-- 코드를 입력하세요
SELECT
BOARD_ID,
WRITER_ID,
TITLE,
PRICE,
CASE
        WHEN STATUS = 'SALE' THEN '판매중'
        WHEN STATUS = 'RESERVED' THEN '예약중'
        ELSE '거래완료'
    END AS salary_level
from USED_GOODS_BOARD 
where Year(CREATED_DATE)=2022 && month(CREATED_DATE)=10 && day(CREATED_DATE)=5
order by BOARD_ID desc;
