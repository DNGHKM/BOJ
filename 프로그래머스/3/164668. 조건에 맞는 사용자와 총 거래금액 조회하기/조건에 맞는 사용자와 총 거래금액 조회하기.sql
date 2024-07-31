-- 코드를 입력하세요
SELECT
USER_ID, 
NICKNAME,
sum(a.PRICE) as TOTAL_SALES
from USED_GOODS_BOARD as a
join USED_GOODS_USER  as b
on a.WRITER_ID = b.USER_ID
where STATUS = 'DONE'
group by USER_ID
having sum(PRICE) >= 700000
order by TOTAL_SALES asc