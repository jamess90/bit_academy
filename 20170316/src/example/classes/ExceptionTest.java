package example.classes;

public class ExceptionTest {

	//Checked Exception : 
	//ExceptionŬ���� ��� ���� ����
	
	//foo��� �޼ҵ带 ȣ�� ���� �� 
	// MyException ���ܰ� �� �� ������ ó���ض�~~~
	public void foo(int n) throws MyException{
		
		//���ܰ� �߻� �� ����
		if(n < 0){
			//���� �߻�!
			// ���� �߻� �ÿ� ���� ��ü�� ���� catch���� ������
			throw new MyException();
		}else{
			System.out.println("foo(int) : " + n);
		}
		
	}
	//RuntimeException Ŭ������ ��ӹ��� ���ܴ� throws�� �ݵ�� ���� �ʿ�� ����.
	// ������ ���°� ����.
	public void goo(int n) throws MyRuntimeException{
		if(n < 0){
			throw new MyRuntimeException("������ �Ű������� ��� �� �� ����.");
		}else{
			System.out.println("goo(int) : " + n);
		}
	}
	
}
