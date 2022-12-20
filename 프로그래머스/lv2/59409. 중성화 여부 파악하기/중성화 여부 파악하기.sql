SELECT animal_id
    ,name   
    , (case SEX_UPON_INTAKE when 'Intact Male' then 'X'
                           when 'Intact Female' then 'X'
       else 'O'
       end) as '중성화' 
   from animal_ins order by animal_id asc;