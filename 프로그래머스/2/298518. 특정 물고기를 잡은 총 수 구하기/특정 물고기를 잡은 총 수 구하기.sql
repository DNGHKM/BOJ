select count(a.FISH_TYPE) as FISH_COUNT 
from FISH_INFO as a
join fish_name_info as b
on a.fish_type = b.fish_type
where fish_name = 'BASS' or fish_name = 'SNAPPER'