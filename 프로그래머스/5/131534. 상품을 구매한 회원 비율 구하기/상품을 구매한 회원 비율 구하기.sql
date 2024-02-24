select to_number(to_char(SALES_DATE, 'yyyy')) as year
  , to_number(to_char(SALES_DATE, 'MM')) as month
  , count(distinct user_id) as PUCHASED_USERS
  , round(count(distinct user_id) / (select count(*)
                                     from USER_INFO
                                     where to_char(JOINED, 'yyyy') = '2021') , 1) as PUCHASED_RATIO
from ONLINE_SALE
where user_id in (select user_id
                  from USER_INFO
                  where to_char(JOINED, 'yyyy') = '2021')
group by to_number(to_char(SALES_DATE, 'yyyy')), to_number(to_char(SALES_DATE, 'MM'))
order by year, month