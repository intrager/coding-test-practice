SELECT left(PRODUCT_CODE, 2) as category, count(PRODUCT_ID) as products 
from PRODUCT 
group by category order by PRODUCT_CODE asc;