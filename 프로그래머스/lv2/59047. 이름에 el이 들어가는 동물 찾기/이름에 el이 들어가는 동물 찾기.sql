SELECT ANIMAL_ID, name from animal_ins where LOWER(animal_ins.name) like '%el%' and animal_type = 'Dog' order by name;