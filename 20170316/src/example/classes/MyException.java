package example.classes;

//����� ���� Exception
public class MyException extends Exception{
	//1) getMessage �������̵�
	//2) �����ڿ��� ���� �޼��� �Է�
	
	@Override
	public String getMessage() {
		return "�Ű������� �����Դϴ�.";
	}
	
}
