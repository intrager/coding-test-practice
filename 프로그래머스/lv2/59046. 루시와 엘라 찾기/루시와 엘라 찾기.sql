SELECT ANIMAL_ID, NAME, SEX_UPON_INTAKE 
from ANIMAL_INS 
where name regexp '^(Lucy|Ella|Pickle|Rogan|Sabrina|Mitty)$' order by ANIMAL_ID asc;