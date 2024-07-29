select ID,
if(ROW_NUMBER() OVER (order by SIZE_OF_COLONY desc) / (select count(*) from ECOLI_DATA)<=0.25, 'CRITICAL', 
   if(ROW_NUMBER() OVER (order by SIZE_OF_COLONY desc) / (select count(*) from ECOLI_DATA)<=0.5,'HIGH', 
      if(ROW_NUMBER() OVER (order by SIZE_OF_COLONY desc) / (select count(*) from ECOLI_DATA)<=0.75,'MEDIUM','LOW')))
      as COLONY_NAME
from ECOLI_DATA 
order by ID