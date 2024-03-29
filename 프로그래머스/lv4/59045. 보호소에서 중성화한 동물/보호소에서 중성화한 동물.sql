SELECT O.ANIMAL_ID, O.ANIMAL_TYPE, O.NAME
  FROM ANIMAL_INS I, ANIMAL_OUTS O
 WHERE I.ANIMAL_ID = O.ANIMAL_ID
   AND I.SEX_UPON_INTAKE LIKE 'Intact%'
   AND O.SEX_UPON_OUTCOME NOT IN (SELECT SEX_UPON_OUTCOME
                                    FROM ANIMAL_OUTS
                                   WHERE SEX_UPON_OUTCOME LIKE ('Intact%'))
ORDER BY O.ANIMAL_ID;