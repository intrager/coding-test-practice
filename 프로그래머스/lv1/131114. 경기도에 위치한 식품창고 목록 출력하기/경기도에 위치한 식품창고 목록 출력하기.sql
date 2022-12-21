SELECT WAREHOUSE_ID, WAREHOUSE_NAME, ADDRESS, (case FREEZER_YN when 'Y' then 'Y'
                                               else 'N' end) as FREEZER_YN
                                               from FOOD_WAREHOUSE where WAREHOUSE_NAME like '%경기%' order by WAREHOUSE_ID asc;