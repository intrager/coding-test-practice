SELECT I.FLAVOR
  FROM ICECREAM_INFO I, FIRST_HALF F
 WHERE I.FLAVOR = F.FLAVOR
   AND F.TOTAL_ORDER > 3000
   AND I.INGREDIENT_TYPE IN ('fruit_based')
ORDER BY TOTAL_ORDER DESC;