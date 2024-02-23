select
  to_CHAR(sales_date, 'yyyy-mm-dd')
, PRODUCT_ID
, USER_ID
, SALES_AMOUNT
from (
    select
      sales_date
    , PRODUCT_ID
    , USER_ID
    , SALES_AMOUNT
    from online_sale
    where to_CHAR(sales_date, 'yyyy-mm') = '2022-03'
    union
    select
      sales_date
    , PRODUCT_ID
    , null as USER_ID
    , SALES_AMOUNT
    from offline_sale
    where to_CHAR(sales_date, 'yyyy-mm') = '2022-03'
)
order by sales_date, PRODUCT_ID, USER_ID