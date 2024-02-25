select
   to_char(SALES_DATE, 'yyyy') as YEAR
 , to_number(to_char(sales_date, 'MM')) as MONTH
 , count(distinct sale.user_id) as PUCHASED_USERS
 , round(count(distinct sale.user_id) / (select count(user_id)
                                        from user_info
                                        where to_char(joined, 'yyyy') = '2021'), 1) as PUCHASED_RATIO 
from online_sale sale
where exists (
              select 1
              from user_info info
              where info.user_id = sale.user_id
                and to_char(info.joined, 'yyyy') = '2021'
             )
group by to_char(sales_date, 'yyyy'), to_number(to_char(sales_date, 'MM'))