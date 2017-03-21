-- DUAL ���̺� : ������ ���� �׽�Ʈ ���� �͵��� ���� �� �� �ִ�.--
-- �Լ� �׽�Ʈ, ����, ���� ��� --
SELECT 'HELLO ' || 'ORACLE' FROM DUAL;

-- FLOOR(�Ǽ�) : �Ǽ��θ� ������--
SELECT 34.5678, FLOOR(34.5678) FROM DUAL;

-- ROUND(�Ǽ�) : �Ҽ��� ù°�ڸ����� �ݿø�
SELECT 34.5678, ROUND(34.5678) FROM DUAL;

-- ROUND(�Ǽ�, �ڸ���) : ������ �ڸ���+1 ���� �ݿø�
SELECT 34.5678, ROUND(34.5678, 2) FROM DUAL;

-- TRUNC(�Ǽ�, �ڸ���) : ������ �ڸ���+1 ���� ����
SELECT 34.5678, TRUNC(34.5678, 2) FROM DUAL;

SELECT ROUND(5/3, 3) AS RESULT FROM DUAL;

--TRUNC, ROUND �ڸ����� ������ ���� �����ο��� ���� �Ǵ� �ݿø��� �Ͼ��.--
SELECT 34.5678, TRUNC(34.5678, -1) FROM DUAL;
SELECT 34.5678, ROUND(36.5678, -1) FROM DUAL;

-- MOD(����1,����2) : ����1�� ����2�� ���� ���� ������ --
SELECT MOD(10,3) FROM DUAL;


------------���ڿ� ���� �Լ�------------
--UPPER(���ڿ�) => ��� ���ڿ��� �빮�ڷ� ġȯ--
--LOWER(���ڿ�) => ��� ���ڿ��� �ҹ��ڷ� ġȯ--
--INITCAP(���ڿ�) => ���⸦ �������� ù ���ڸ� �빮�ڷ� ġȯ--
SELECT 'Welcome to Oracle', UPPER('Welcome to Oracle') FROM DUAL;
SELECT 'Welcome to Oracle', LOWER('Welcome to Oracle') FROM DUAL;
SELECT 'welcome to oracle', INITCAP('welcome to oracle') FROM DUAL;

--CONCAT(���ڿ�,���ڿ�) => ���ڿ� �̾��ֱ� ( || )
SELECT CONCAT('welcome to', ' oracle') FROM DUAL;


--SUBSTR(���ڿ�, ����, ��)--
--                                 ����)--
--   w  e   l    c   o  m   e  --
--   1   2   3   4   5   6   7  --
-- -7 -6 -5 -4 -3 -2 -1
SELECT SUBSTR('welcome',-5,4) FROM DUAL;
SELECT SUBSTR('�ȳ��ϼ���',1,3) FROM DUAL;
--SELECT SUBSTRB('�ȳ��ϼ���',0,10) FROM DUAL;--

--LPAD                                      RPAD--
--���ʿ������� ä���            �����ʿ������� ä���
--���� ���ڿ�, ���ڿ� ����, Ư������(������ ���ڿ�)--
SELECT LPAD('Hello World',20,'#') FROM DUAL;
SELECT RPAD('Hello World',20,'#') FROM DUAL;



SELECT LTRIM('     oracle#####') FROM DUAL;  --���ڿ� ���� ���� ���� �����ϱ�
SELECT RTRIM('#####oracle     ') FROM DUAL;  --���ڿ� ���� ������ ���� �����ϱ�
SELECT TRIM('     oracle     ') FROM DUAL;          --���ڿ��� �������� ���� ���� ����
SELECT TRIM('     O  R  A  C  L  E     ') FROM DUAL; --���ڿ� ��� �ִ� ������ ���� �Ұ�
 
--TRIM�� �̿��� Ư�� ���ڿ� �����ϱ�
--TRIM(������ ���� FROM '���� ���ڿ�')
SELECT TRIM('a' FROM 'aaaaOracleaaaa') FROM DUAL;

--TRIM�� �̿��Ͽ� ��� ���� ����� - �ȵ�
SELECT TRIM(' ' FROM '     O  R  A  C  L  E     ') FROM DUAL;



--1) ����� �޿� ǥ���� ~������� ǥ�� �޿��� 1000 �ʰ��� ����鸸--
--ex) sal��
-- 1200 : 1000������ --
-- 1900 : 2000������--
SELECT ENAME, ROUND(SAL, -3) || ' $��'
FROM EMP
WHERE SAL > 1000;

--2) ¦�� �����븦 �޴� ����� ���� ��� ���� ǥ��
SELECT *
FROM EMP
WHERE MOD(TRUNC(SAL,-3)/1000 ,2) = 0
AND SAL > 1000;







