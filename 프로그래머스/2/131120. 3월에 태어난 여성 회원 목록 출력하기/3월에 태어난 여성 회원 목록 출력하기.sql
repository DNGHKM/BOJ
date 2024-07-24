-- 코드를 입력하세요
SELECT 
MEMBER_ID,
MEMBER_NAME,
GENDER,
date_format(DATE_OF_BIRTH, "%Y-%m-%d") as DATE_OF_BIRTH
from MEMBER_PROFILE as a
where a.TLNO is not null && month(DATE_OF_BIRTH) = 3 and GENDER = 'W'
order by a.MEMBER_ID asc