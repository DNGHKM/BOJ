SELECT
a.NAME, 
a.DATETIME
from ANIMAL_INS a
left outer join ANIMAL_OUTS b
on a.ANIMAL_ID = b.ANIMAL_ID 
where b.DATETIME is null
order by a.datetime asc
FETCH FIRST 3 ROWS ONLY