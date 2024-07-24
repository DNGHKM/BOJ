SELECT 
    ugb.TITLE,
    ugb.BOARD_ID,
    ugr.REPLY_ID, 
    ugr.WRITER_ID, 
    ugr.CONTENTS, 
    DATE_FORMAT(ugr.CREATED_DATE, '%Y-%m-%d') as CREATED_DATE
from USED_GOODS_BOARD as ugb
join USED_GOODS_REPLY as ugr
on ugb.BOARD_ID = ugr.BOARD_ID
where year(ugb.created_date) = 2022 and month(ugb.created_date) = 10
order by ugr.CREATED_DATE asc, ugb.title asc