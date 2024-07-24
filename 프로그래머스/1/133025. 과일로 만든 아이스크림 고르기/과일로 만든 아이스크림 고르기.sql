-- 코드를 입력하세요
SELECT 
fh.FLAVOR
from FIRST_HALF as fh
    join ICECREAM_INFO as ii
on fh.FLAVOR = ii.FLAVOR
where ii.INGREDIENT_TYPE = 'fruit_based' && fh.TOTAL_ORDER>3000
order by fh.TOTAL_ORDER desc