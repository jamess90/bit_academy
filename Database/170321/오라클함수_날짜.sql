--��¥ ������ �Լ�--
-- ���� ��¥ �� �ð��� ���� �ϰ��ִ� SYSDATE--
SELECT SYSDATE FROM DUAL;

SELECT SYSDATE+1 FROM DUAL;
SELECT SYSDATE-2 FROM DUAL;

SELECT SYSDATE-28 FROM DUAL;
SELECT SYSDATE+28 FROM DUAL;

-- ��¥ - ��¥ => ��¥�� ��¥ ������ �ϼ�--
SELECT * FROM EMP;
SELECT ROUND(SYSDATE - HIREDATE)
FROM EMP;

SELECT HIREDATE, ROUND (HIREDATE, 'MONTH') FROM EMP;


-- �ް� �� ���� �� �������� ���ϴ� �Լ�--
-- �������� �Ի��Ϻ��� ���ñ��� �� ���� �� �ߴ°�?--
SELECT ENAME, SYSDATE, HIREDATE,
ROUND(MONTHS_BETWEEN (SYSDATE, HIREDATE)) 
FROM EMP;

--���� �� ���ϱ�
-- �Ի��Ͽ��� 6���� ��
SELECT ENAME, HIREDATE, ADD_MONTHS(HIREDATE, 5) FROM EMP;


--NEXT_DAY(��¥, ����)
-- ��¥�κ��� ���� ����� ���� ������ ��������?
SELECT SYSDATE, NEXT_DAY(SYSDATE-30, '�����') FROM DUAL;

-- ������ �������� 7���� �� ���� ����� �Ͽ���--
SELECT ADD_MONTHS(SYSDATE,7), NEXT_DAY(ADD_MONTHS(SYSDATE, 7), '�Ͽ���')
FROM DUAL;

-- �ش� ���� ������ �� --
SELECT HIREDATE, LAST_DAY(HIREDATE) FROM EMP;


SELECT SYSDATE, TO_CHAR(SYSDATE+365, 'YYYY-MM-DD DAY') FROM DUAL;
SELECT SYSDATE FROM DUAL; --JAVA�� java.sql.Date Ŭ������ ��� ����--

SELECT TO_CHAR(SYSDATE, 'YYYY/MM/DD, HH:MI:SS AM') FROM DUAL;

-- ��¥ �� �ð��������� �ʿ��� ��� - �ַ� �Խ��ǿ��� ���� ���
-- ��¥�� �ʿ��� ���                     - ���θ� ��ǰ ��� ��¥, �Դ��� ����, ������ ���� ���~~~~


SELECT TO_CHAR (1230000) || '��'  FROM DUAL;
SELECT 1230000 || '��' FROM DUAL;

SELECT TO_CHAR (123456, 'L000,000,000'), TO_CHAR (123456, 'L999,999,999') FROM DUAL;



--����---
--EMP ���̺��� ������� ������� �� ������ ���

SELECT TO_CHAR(HIREDATE, 'YYYY-MM-DD DAY HH24:MI:SS')
FROM EMP;

--TO_DATE => ���ڿ�-> ��¥��
SELECT ENAME, HIREDATE FROM EMP WHERE HIREDATE=19810220;
SELECT ENAME, HIREDATE FROM EMP WHERE HIREDATE=TO_DATE('19810220','YYYYMMDD');

SELECT SYSDATE-'2009/01/01' FROM DUAL;
SELECT SYSDATE - TO_DATE('20090101','YYYYMMDD') FROM DUAL;
--�����ͺ��̽��� ��¥�� ���� �Ҷ��� ��¥��(YYYYMMDDHHMISS) ���� �״�� ����..

SELECT TRUNC(SYSDATE-TO_DATE('2008/01/01', 'YYYY/MM/DD')) FROM DUAL;


--TO_NUMBER -> ���ڿ��� -> �������·�
SELECT '10000' - '20000' FROM DUAL; -- ���� x
SELECT TO_NUMBER('10000') - TO_NUMBER('20000') FROM DUAL; --���� o














