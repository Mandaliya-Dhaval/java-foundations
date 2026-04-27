-- Database selection
USE automation_db;

-- 1) Select all rows from employees
SELECT * FROM employees;

-- 2) Select employees where dept = 'QA'
SELECT * FROM employees WHERE dept = 'QA';

-- 3) Highest salary employee (top 1)
SELECT * FROM employees ORDER BY salary DESC LIMIT 1;

-- 4) Count employees per department
SELECT dept, COUNT(*) AS cnt
FROM employees
GROUP BY dept;

-- 5) Employees with salary between 80000 and 95000
SELECT * FROM employees WHERE salary BETWEEN 80000 AND 95000;