-- 코드를 입력하세요
SELECT
a.ANIMAL_ID,
a.NAME
from ANIMAL_INS a, ANIMAL_OUTS b
where a.ANIMAL_ID = b.ANIMAL_ID and a.DATETIME > b.DATETIME
order by a.DATETIME asc