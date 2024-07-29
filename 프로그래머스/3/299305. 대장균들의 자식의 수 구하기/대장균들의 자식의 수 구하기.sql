select 
a.ID,
if(b.CHILD_COUNT is null, 0, b.CHILD_COUNT) as CHILD_COUNT
from ECOLI_DATA  as a
left join
(
select 
PARENT_ID,
count(PARENT_ID) as CHILD_COUNT
from ECOLI_DATA 
group by PARENT_ID
) as b
on a.ID = b.PARENT_ID