-- 코드를 입력하세요
SELECT
a.ANIMAL_ID,
a.NAME
from ANIMAL_OUTS a
left outer join ANIMAL_INS b
on b.ANIMAL_ID=a.ANIMAL_ID
where b.DATETIME is null
order by a.animal_id