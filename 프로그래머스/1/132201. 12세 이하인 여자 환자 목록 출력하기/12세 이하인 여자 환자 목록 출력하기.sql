SELECT PT_NAME, 
       PT_NO,
       GEND_CD, 
       AGE, 
        if(tlno is null, 'NONE', tlno) as TLNO
from PATIENT as p
where p.age<=12 and p.GEND_CD='W'
order by p.age desc, p.pt_name asc