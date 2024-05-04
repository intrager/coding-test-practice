select sum(grade.SCORE) as SCORE, emp.EMP_NO, emp.EMP_NAME, emp.POSITION, emp.EMAIL
from HR_EMPLOYEES emp
inner join HR_GRADE grade
        on emp.EMP_NO = grade.EMP_NO
where grade.YEAR = '2022'
group by emp.EMP_NO, emp.EMP_NAME, emp.POSITION, emp.EMAIL
order by score desc
limit 1;