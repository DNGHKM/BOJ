-- 코드를 입력하세요
SELECT 
    USER_ID, 
    b.NICKNAME,
    concat(b.CITY,' ',STREET_ADDRESS1,' ',STREET_ADDRESS2) as 전체주소,
    concat(substring(TLNO,1,3),'-',substring(TLNO,4,4),'-',substring(TLNO,8,4))
from USED_GOODS_BOARD as a
join USED_GOODS_USER as b
on a.WRITER_ID = b.USER_ID
group by WRITER_ID
having count(a.WRITER_ID)>=3
order by USER_ID desc