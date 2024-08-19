SELECT a.PRODUCT_ID, a.PRODUCT_NAME, a.price*b.sum as TOTAL_SALES
from FOOD_PRODUCT a left join (
    select PRODUCT_ID, sum(AMOUNT) as sum
    from FOOD_ORDER
    where extract(month from PRODUCE_DATE) = 5
    group by PRODUCT_ID) b
on a.PRODUCT_ID = b.PRODUCT_ID
where a.price*b.sum>0
order by TOTAL_SALES desc, PRODUCT_ID asc