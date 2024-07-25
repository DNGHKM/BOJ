SELECT
MCDP_CD as '진료과 코드',
count(APNT_NO) as '5월예약건수'
from APPOINTMENT 
where month(APNT_YMD)= 5
group by MCDP_CD
order by count(APNT_NO) asc, MCDP_CD asc
