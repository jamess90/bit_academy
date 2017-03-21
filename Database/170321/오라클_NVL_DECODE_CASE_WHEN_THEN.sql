--NVL(�÷���, null�� �� ������ ��)
-- �÷��� �ִ� �����Ͱ� NULL�� �ƴϸ� ���� ������ �ִ� ���� �״�� ����Ѵ�.

SELECT NVL(COMM, 0) + SAL, COMM, SAL, SAL+COMM
FROM EMP;

-- ��� �̸�, Ŀ�̼��� NULL�̸� 0 ���
SELECT ENAME, NVL(TO_CHAR(COMM), '����')
FROM EMP;

--NVL�� ��� �� ���� �տ� �ִ� Ÿ�԰� �ڿ� �ִ� Ÿ���� �Ȱ��ƾ� �Ѵ�.
SELECT EMPNO, ENAME,  NVL(TO_CHAR(MGR, '9999'), ' C E O ') AS MANAGER FROM EMP WHERE MGR IS NULL;

--���� MGR�ڵ� -> NUMBER
select TO_CHAR(MGR, '9999') FROM EMP WHERE MGR IS NULL;

--DECODE
-- �÷��� ������ �������鼭 ����� ���� �ٲ۴�.
-- SWITCH CASE�� ������ �Ѵ�

--                                       DEPTNO�� 10�� �� A�� ���
--                                                         20�� �� B�� ���
--                                                         �� �ܴ� DEFAULT
SELECT DEPTNO, DECODE(DEPTNO, 10, 'A', 
                                                              20, 'B', 
                                                             'DEFAULT') FROM EMP ORDER BY DEPTNO;

--1980/01/01���� 1981/12/31 ���� �Ի��� ����� ���� ������ ���Ͻÿ�
-- BETWEEN AND ���
SELECT *
FROM EMP
WHERE HIREDATE BETWEEN TO_DATE('19800101','YYYYMMDD') AND TO_DATE('19811231','YYYYMMDD');

-- 10��, 30�� �μ� ������� ����(�⺻�޿� + Ŀ�̼�)�� ���Ͻÿ�
SELECT SAL, SAL+NVL(COMM,0) FROM EMP WHERE DEPTNO IN (10,20);

-- �޿��� 1000 �̻��� ������� ��� ��ȣ, �̸�, ������ 1000 ��� '���Թ���' ���, 2000 ��� '�԰� �츸�ϴ�',  �� �ܴ� '�ſ� �߹���'  ���
-- (�޿� �������� ����)

SELECT EMPNO, ENAME, DECODE(ROUND(SAL,-3), 1000, '���Թ���',
                                                                                      2000, '�԰� �츸�ϴ�', '�ſ� �߹���')
FROM EMP WHERE SAL >= 1000
ORDER BY SAL;


--CASE  WHEN ����1 THEN ���ǿ� ���� ���
--           WHEN ����2 THEN ���ǿ� ���� ���
--           WHEN ����3 THEN ���ǿ� ���� ���
--           WHEN ����4 THEN ���ǿ� ���� ���
--           WHEN ����5 THEN ���ǿ� ���� ���
--           ELSE ������ ��� ���� ���� �� �׿� ���
--END
     

SELECT ENAME, DEPTNO,
CASE WHEN DEPTNO=10 THEN 'ACCOUNTING' 
           WHEN DEPTNO=20 THEN 'RESEARCH'
           WHEN DEPTNO=30 THEN 'SALES'
           WHEN DEPTNO=40 THEN 'OPERATIONS'
           ELSE 'NO DEPT'
END AS DNAME --END �ڿ��� AS�� �̿��Ͽ� �÷��� ������ �����ϴ�--
FROM EMP;

--SELECT EMPNO, ENAME, DECODE(ROUND(SAL,-3), 1000, '���Թ���', 2000, '�԰� �츸�ϴ�', '�ſ� �߹���'); --�� CASE WHEN THEN������
SELECT EMPNO, ENAME,
CASE WHEN ROUND(SAL,-3) = 1000 THEN '���Թ���'
           WHEN ROUND(SAL,-3) = 2000 THEN '�԰� �츸�ϴ�'
           ELSE '�ſ� �߹���' 
END AS SAL_LIFE
FROM EMP;

--��ü ����� ���, �̸�, �μ���ȣ, �޿��� 0�̻� 1000���ϸ�      'lv4'
--                                               �޿��� 1000�̻� 2000���ϸ� 'lv3'
--                                               �޿��� 2000�̻� 3000���ϸ� 'lv2'
--                                               �޿��� 3000�̻� 4000���ϸ� 'lv1'
--                                               �� �ܴ� 'GOD'



SELECT EMPNO,ENAME, DEPTNO, SAL,
CASE  WHEN SAL BETWEEN 0 AND 1000 THEN 'LV4'
            WHEN SAL BETWEEN 1000 AND 2000 THEN 'LV3'
            WHEN SAL BETWEEN 2000 AND 3000 THEN 'LV2'
            WHEN SAL BETWEEN 3000 AND 4000 THEN 'LV1'
            ELSE 'GOD' END AS SAL_LEVEL
FROM EMP ORDER BY SAL DESC;



SELECT * FROM EMP ORDER BY DEPTNO;
--�μ��� 10���� �� ������ CLERK 'HELLO 10'
--�μ��� 10���� �� ������ MANAGER�̸� 'BYE 10'

--�μ��� 20���� �� ������ ANALYST�� 'HELLO 20'
--�μ��� 20���� �� ������ CLERK 'BYE 20'

--�μ��� 30���� �� ������ SALESMAN�̸� 'HELLO 30'
--�μ��� 30���� �� ������ CLERK�̸� 'BYE 30'

-- �� ����� �̸�, ���, �μ��ڵ�, ���� ���






