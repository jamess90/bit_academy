package example.main;

import example.classes.ExceptionTest;
import example.classes.MyException;
import example.classes.MyRuntimeException;

public class main04 {

	public static void main(String[] args) {
		ExceptionTest exceptionTest = new ExceptionTest();
	
		try {
			//�ݵ�� ���ܸ� ó���ض�
			//Exception Ŭ������ ����� Checked Exception �̱� ������
			exceptionTest.foo(-1);
		} catch (MyException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		try
		{
			exceptionTest.goo(0);
		}catch(MyRuntimeException e){
			System.out.println(e.getMessage());
		}
												
		
		
		
	}
	
}