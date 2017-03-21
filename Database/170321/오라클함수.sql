-- DUAL 테이블 : 간단한 연산 테스트 같은 것들을 진행 할 수 있다.--
-- 함수 테스트, 연산, 수식 등등 --
SELECT 'HELLO ' || 'ORACLE' FROM DUAL;

-- FLOOR(실수) : 실수부를 버린다--
SELECT 34.5678, FLOOR(34.5678) FROM DUAL;

-- ROUND(실수) : 소숫점 첫째자리에서 반올림
SELECT 34.5678, ROUND(34.5678) FROM DUAL;

-- ROUND(실수, 자릿수) : 지정한 자릿수+1 에서 반올림
SELECT 34.5678, ROUND(34.5678, 2) FROM DUAL;

-- TRUNC(실수, 자릿수) : 지정한 자릿수+1 에서 버림
SELECT 34.5678, TRUNC(34.5678, 2) FROM DUAL;

SELECT ROUND(5/3, 3) AS RESULT FROM DUAL;

--TRUNC, ROUND 자릿수에 음수가 들어가면 정수부에서 버림 또는 반올림이 일어난다.--
SELECT 34.5678, TRUNC(34.5678, -1) FROM DUAL;
SELECT 34.5678, ROUND(36.5678, -1) FROM DUAL;

-- MOD(숫자1,숫자2) : 숫자1을 숫자2로 나눈 것의 나머지 --
SELECT MOD(10,3) FROM DUAL;


------------문자열 관련 함수------------
--UPPER(문자열) => 모든 문자열을 대문자로 치환--
--LOWER(문자열) => 모든 문자열을 소문자로 치환--
--INITCAP(문자열) => 띄어쓰기를 기준으로 첫 문자를 대문자료 치환--
SELECT 'Welcome to Oracle', UPPER('Welcome to Oracle') FROM DUAL;
SELECT 'Welcome to Oracle', LOWER('Welcome to Oracle') FROM DUAL;
SELECT 'welcome to oracle', INITCAP('welcome to oracle') FROM DUAL;

--CONCAT(문자열,문자열) => 문자열 이어주기 ( || )
SELECT CONCAT('welcome to', ' oracle') FROM DUAL;


--SUBSTR(문자열, 시작, 끝)--
--                                 갯수)--
--   w  e   l    c   o  m   e  --
--   1   2   3   4   5   6   7  --
-- -7 -6 -5 -4 -3 -2 -1
SELECT SUBSTR('welcome',-5,4) FROM DUAL;
SELECT SUBSTR('안녕하세요',1,3) FROM DUAL;
--SELECT SUBSTRB('안녕하세요',0,10) FROM DUAL;--

--LPAD                                      RPAD--
--왼쪽에서부터 채우기            오른쪽에서부터 채우기
--원본 문자열, 문자열 갯수, 특수문자(삽입할 문자열)--
SELECT LPAD('Hello World',20,'#') FROM DUAL;
SELECT RPAD('Hello World',20,'#') FROM DUAL;



SELECT LTRIM('     oracle#####') FROM DUAL;  --문자열 기준 왼쪽 공백 삭제하기
SELECT RTRIM('#####oracle     ') FROM DUAL;  --문자열 기준 오른쪽 공백 삭제하기
SELECT TRIM('     oracle     ') FROM DUAL;          --문자열을 기준으로 양쪽 공백 삭제
SELECT TRIM('     O  R  A  C  L  E     ') FROM DUAL; --문자열 가운데 있는 공백은 삭제 불가
 
--TRIM을 이용한 특정 문자열 삭제하기
--TRIM(삭제할 문자 FROM '원본 문자열')
SELECT TRIM('a' FROM 'aaaaOracleaaaa') FROM DUAL;

--TRIM을 이용하여 모든 공백 지우기 - 안됨
SELECT TRIM(' ' FROM '     O  R  A  C  L  E     ') FROM DUAL;



--1) 사원의 급여 표현을 ~만원대로 표시 급여가 1000 초과인 사람들만--
--ex) sal이
-- 1200 : 1000만원대 --
-- 1900 : 2000만원대--
SELECT ENAME, ROUND(SAL, -3) || ' $대'
FROM EMP
WHERE SAL > 1000;

--2) 짝수 연봉대를 받는 사람에 대한 모든 정보 표시
SELECT *
FROM EMP
WHERE MOD(TRUNC(SAL,-3)/1000 ,2) = 0
AND SAL > 1000;







