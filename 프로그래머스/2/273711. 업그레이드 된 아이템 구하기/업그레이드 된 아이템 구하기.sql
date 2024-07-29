select
a.ITEM_ID,
a.ITEM_NAME,
a.RARITY
from ITEM_INFO as a
join ITEM_TREE as b
on a.ITEM_ID = b.ITEM_ID
join ITEM_INFO  as c
on b.PARENT_ITEM_ID = c.ITEM_ID
where c.RARITY = 'RARE'
order by a.ITEM_ID desc