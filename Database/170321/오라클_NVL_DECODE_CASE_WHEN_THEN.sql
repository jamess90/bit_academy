--NVL(컬럼명, null일 때 설정할 값)
-- 컬럼에 있는 데이터가 NULL이 아니면 원래 가지고 있던 값을 그대로 사용한다.

SELECT NVL(COMM, 0) + SAL, COMM, SAL, SAL+COMM
FROM EMP;

-- 사원 이름, 커미션이 NULL이면 0 출력
SELECT ENAME, NVL(TO_CHAR(COMM), '없음')
FROM EMP;

--NVL을 사용 할 때는 앞에 있는 타입과 뒤에 있는 타입이 똑같아야 한다.
SELECT EMPNO, ENAME,  NVL(TO_CHAR(MGR, '9999'), ' C E O ') AS MANAGER FROM EMP WHERE MGR IS NULL;

--원래 MGR코드 -> NUMBER
select TO_CHAR(MGR, '9999') FROM EMP WHERE MGR IS NULL;

--DECODE
-- 컬럼의 조건을 따져가면서 출력할 값을 바꾼다.
-- SWITCH CASE의 역할을 한다

--                                       DEPTNO가 10일 때 A를 출력
--                                                         20일 때 B를 출력
--                                                         그 외는 DEFAULT
SELECT DEPTNO, DECODE(DEPTNO, 10, 'A', 
                                                              20, 'B', 
                                                             'DEFAULT') FROM EMP ORDER BY DEPTNO;

--1980/01/01부터 1981/12/31 까지 입사한 사람에 대한 정보를 구하시오
-- BETWEEN AND 사용
SELECT *
FROM EMP
WHERE HIREDATE BETWEEN TO_DATE('19800101','YYYYMMDD') AND TO_DATE('19811231','YYYYMMDD');

-- 10번, 30번 부서 사람들의 월급(기본급여 + 커미션)을 구하시오
SELECT SAL, SAL+NVL(COMM,0) FROM EMP WHERE DEPTNO IN (10,20);

-- 급여가 1000 이상인 사람들의 사원 번호, 이름, 월급이 1000 대면 '적게번다' 출력, 2000 대면 '먹고 살만하다',  그 외는 '매우 잘번다'  출력
-- (급여 오름차순 정렬)

SELECT EMPNO, ENAME, DECODE(ROUND(SAL,-3), 1000, '적게번다',
                                                                                      2000, '먹고 살만하다', '매우 잘번다')
FROM EMP WHERE SAL >= 1000
ORDER BY SAL;


--CASE  WHEN 조건1 THEN 조건에 대한 결과
--           WHEN 조건2 THEN 조건에 대한 결과
--           WHEN 조건3 THEN 조건에 대한 결과
--           WHEN 조건4 THEN 조건에 대한 결과
--           WHEN 조건5 THEN 조건에 대한 결과
--           ELSE 조건이 모두 맞지 않을 때 그외 결과
--END
     

SELECT ENAME, DEPTNO,
CASE WHEN DEPTNO=10 THEN 'ACCOUNTING' 
           WHEN DEPTNO=20 THEN 'RESEARCH'
           WHEN DEPTNO=30 THEN 'SALES'
           WHEN DEPTNO=40 THEN 'OPERATIONS'
           ELSE 'NO DEPT'
END AS DNAME --END 뒤에는 AS를 이용하여 컬럼명 지정이 가능하다--
FROM EMP;

--SELECT EMPNO, ENAME, DECODE(ROUND(SAL,-3), 1000, '적게번다', 2000, '먹고 살만하다', '매우 잘번다'); --를 CASE WHEN THEN문으로
SELECT EMPNO, ENAME,
CASE WHEN ROUND(SAL,-3) = 1000 THEN '적게번다'
           WHEN ROUND(SAL,-3) = 2000 THEN '먹고 살만하다'
           ELSE '매우 잘번다' 
END AS SAL_LIFE
FROM EMP;

--전체 사원의 사번, 이름, 부서번호, 급여가 0이상 1000이하면      'lv4'
--                                               급여가 1000이상 2000이하면 'lv3'
--                                               급여가 2000이상 3000이하면 'lv2'
--                                               급여가 3000이상 4000이하면 'lv1'
--                                               그 외는 'GOD'



SELECT EMPNO,ENAME, DEPTNO, SAL,
CASE  WHEN SAL BETWEEN 0 AND 1000 THEN 'LV4'
            WHEN SAL BETWEEN 1000 AND 2000 THEN 'LV3'
            WHEN SAL BETWEEN 2000 AND 3000 THEN 'LV2'
            WHEN SAL BETWEEN 3000 AND 4000 THEN 'LV1'
            ELSE 'GOD' END AS SAL_LEVEL
FROM EMP ORDER BY SAL DESC;



SELECT * FROM EMP ORDER BY DEPTNO;
--부서가 10번일 때 직업이 CLERK 'HELLO 10'
--부서가 10번일 때 직업이 MANAGER이면 'BYE 10'

--부서가 20번일 때 직업이 ANALYST면 'HELLO 20'
--부서가 20번일 때 직업이 CLERK 'BYE 20'

--부서가 30번일 때 직업이 SALESMAN이면 'HELLO 30'
--부서가 30번일 때 직업이 CLERK이면 'BYE 30'

-- 및 사원의 이름, 사번, 부서코드, 직업 출력






