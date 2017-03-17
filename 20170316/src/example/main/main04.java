package example.main;

import example.classes.ExceptionTest;
import example.classes.MyException;
import example.classes.MyRuntimeException;

public class main04 {

	public static void main(String[] args) {
		ExceptionTest exceptionTest = new ExceptionTest();
	
		try {
			//반드시 예외를 처리해라
			//Exception 클래스를 상속한 Checked Exception 이기 때문에
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