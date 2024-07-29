-- 코드를 작성해주세요
select 
year1 as YEAR,
max_size-SIZE_OF_COLONY as YEAR_DEV,
ID
from ECOLI_DATA as a
join (
    select year(DIFFERENTIATION_DATE) as year1,
    max(SIZE_OF_COLONY) as max_size
    from ECOLI_DATA
    group by year(DIFFERENTIATION_DATE)
    ) as b
on year(a.DIFFERENTIATION_DATE) = b.year1
order by YEAR asc, YEAR_DEV asc