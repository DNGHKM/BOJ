-- 코드를 입력하세요
SELECT distinct(car_id) as car_id
from car_rental_company_car a
natural join car_rental_company_rental_history b
where to_char(start_date, 'mm')=10 and car_type ='세단'
group by car_id
order by car_id desc;