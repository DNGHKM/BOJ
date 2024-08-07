SELECT
ORDER_ID,
PRODUCT_ID,
TO_CHAR(OUT_DATE, 'YYYY-MM-DD') as OUT_DATE,
case 
    when OUT_DATE is null then 
    '출고미정'
    when OUT_DATE > to_Date('2022-05-01', 'YYYY-MM-DD') then 
    '출고대기'
    else '출고완료'
end as 출고여부
from FOOD_ORDER
-- where IN_DATE <= to_Date('2022-05-01', 'YYYY-MM-DD')
order by ORDER_ID asc