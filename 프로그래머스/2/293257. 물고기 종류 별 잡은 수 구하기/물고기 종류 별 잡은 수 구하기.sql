select 
count(a.FISH_TYPE) as FISH_COUNT,
b.FISH_NAME
from FISH_INFO as a
join FISH_NAME_INFO as b
on a.FISH_TYPE = b.FISH_TYPE
group by b.FISH_NAME
order by FISH_COUNT desc