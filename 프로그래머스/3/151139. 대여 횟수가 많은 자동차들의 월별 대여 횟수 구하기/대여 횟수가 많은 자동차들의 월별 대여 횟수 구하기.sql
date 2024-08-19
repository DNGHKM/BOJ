SELECT 
    EXTRACT(MONTH FROM START_DATE) as MONTH,
    CAR_ID,
    count(car_id) as RECORDS
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
where 8 <= EXTRACT(MONTH FROM START_DATE) and EXTRACT(MONTH FROM START_DATE)<=10
group by car_id, EXTRACT(MONTH FROM START_DATE)
having car_id in (select car_id
                from CAR_RENTAL_COMPANY_RENTAL_HISTORY 
                where 8 <= EXTRACT(MONTH FROM START_DATE) and EXTRACT(MONTH FROM START_DATE)<=10
                group by car_id
                having count(car_id) >=5) and count(car_id) !=0
order by MONTH asc, CAR_ID desc
