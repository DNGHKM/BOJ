select
sum(b.SCORE) as SCORE,
a.EMP_NO,
a.EMP_NAME,
a.POSITION,
a.EMAIL
from HR_EMPLOYEES as a
join HR_GRADE as b
on a.EMP_NO = b.EMP_NO
GROUP BY b.EMP_NO
order by SCORE desc
limit 1