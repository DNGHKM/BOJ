select 
    distinct(a.CAR_ID),
    case when availability is null then '대여 가능'
        else '대여중'
    end as availability
from CAR_RENTAL_COMPANY_RENTAL_HISTORY a, 
(select 
     CAR_ID,
    '대여중' as AVAILABILITY
from CAR_RENTAL_COMPANY_RENTAL_HISTORY 
where to_date('2022-10-16','YYYY-MM-DD') between START_DATE and END_DATE
) b
where a.CAR_ID = b.CAR_ID(+)
order by car_id desc


