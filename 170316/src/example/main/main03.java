package example.main;

public class main03 {

	public static void main(String[] args) {
		int n = 0;
		
//		if(n == 0){
//			System.out.println("n�� 0�Դϴ�.");
//			return;	//�Լ� ����
//		}
		
		ExceptionTest(n);
		
		try{
			int result = 10 / n;
			return;
		}catch(ArithmeticException e){
			System.out.println(e.getMessage());
			return;
		}finally{
			System.out.println("���� ��ó�� ���� �� return");
		}
	}
	public static String ExceptionTest(int n){
		try{
			int result = 10 / n;
			return "true";
		}catch(ArithmeticException e){
			System.out.println(e.getMessage());
			return "false";
		}finally{
			System.out.println("�Լ� ����");
		}
	}
	
}
