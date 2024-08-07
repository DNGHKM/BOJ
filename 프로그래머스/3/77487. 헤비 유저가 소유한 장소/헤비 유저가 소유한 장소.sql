-- 코드를 입력하세요
select 
a.ID,
a.NAME,
a.HOST_ID
from 
PLACES a, (
    SELECT
    HOST_ID,
    count(HOST_ID)
    from PLACES 
    group by HOST_ID
    having 	count(host_id) >= 2
) b
where a.HOST_ID = b.HOST_ID