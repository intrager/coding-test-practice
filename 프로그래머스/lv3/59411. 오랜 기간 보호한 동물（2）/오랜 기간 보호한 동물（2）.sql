SELECT ANIMAL_ID, NAME
  FROM (SELECT I.ANIMAL_ID, O.NAME
          FROM ANIMAL_INS I, ANIMAL_OUTS O
         WHERE I.ANIMAL_ID = O.ANIMAL_ID
        ORDER BY O.DATETIME - I.DATETIME DESC
       )
FETCH FIRST 2 ROW ONLY;