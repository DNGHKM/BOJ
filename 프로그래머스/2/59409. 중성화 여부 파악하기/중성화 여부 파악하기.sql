-- 코드를 입력하세요
SELECT
ANIMAL_ID,
NAME,
if(SEX_UPON_INTAKE like '%Neutered%' or SEX_UPON_INTAKE like '%Spayed%','O', 'X')
from ANIMAL_INS 
order by ANIMAL_ID