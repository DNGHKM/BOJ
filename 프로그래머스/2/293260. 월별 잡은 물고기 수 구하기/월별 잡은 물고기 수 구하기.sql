select 
count(id) as FISH_COUNT,
month(TIME) as MONTH
from FISH_INFO
group by MONTH
order by MONTH asc