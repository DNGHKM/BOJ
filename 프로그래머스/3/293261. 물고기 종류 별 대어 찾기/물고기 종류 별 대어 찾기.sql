select a.ID,
c.FISH_NAME,
a.LENGTH
from FISH_INFO as a
join 
    (select 
        a.FISH_TYPE,
        max(a.LENGTH) as len1
    from FISH_INFO as a
    join FISH_NAME_INFO as b
    on a.FISH_TYPE = b.FISH_TYPE
    group by a.FISH_TYPE) as b
on a.FISH_TYPE = b.FISH_TYPE
join FISH_NAME_INFO as c
on a.FISH_TYPE = c.FISH_TYPE
where a.LENGTH = b.len1 