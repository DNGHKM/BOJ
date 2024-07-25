-- 코드를 입력하세요
SELECT
Hour(DATETIME) as HOUR,
count(*) as 'COUNT'
from ANIMAL_OUTS 
where 9 <= Hour(DATETIME) && Hour(DATETIME) < 20
group by HOUR
order by HOUR
