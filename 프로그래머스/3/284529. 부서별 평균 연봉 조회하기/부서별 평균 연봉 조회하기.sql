select dept.DEPT_ID, dept.DEPT_NAME_EN, round(avg(emp.SAL), 0) as AVG_SAL
from HR_DEPARTMENT dept
inner join HR_EMPLOYEES emp
        on emp.DEPT_ID = dept.DEPT_ID
group by dept.DEPT_ID, dept.DEPT_NAME_EN
order by AVG_SAL desc;