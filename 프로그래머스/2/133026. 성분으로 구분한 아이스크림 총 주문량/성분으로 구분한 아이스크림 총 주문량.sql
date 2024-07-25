-- 코드를 입력하세요
SELECT
    a.INGREDIENT_TYPE,
    sum(TOTAL_ORDER) as TOTAL_ORDER
from ICECREAM_INFO as a
join FIRST_HALF as b
on a.FLAVOR = b.FLAVOR
group by a.INGREDIENT_TYPE
order by TOTAL_ORDER asc