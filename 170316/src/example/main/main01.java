package example.main;

public class main01 {

	public static void main(String[] args) {
		//Wrapper Class
		// �⺻�ڷ����� Ŭ����ȭ
		
		//int->�⺻�ڷ���
		int a1 = 10;
		
		//Boxing
		Integer w_a1 = new Integer(10);
		
		//���ڿ��� ���� ���ϴ� �⺻ �ڷ��� ���·� ������
		Integer w_a2 = new Integer("10");
		int w_a3 = Integer.valueOf("10");
		
		int w_a4 = Integer.valueOf(10);
		
		//UnBoxing
		System.out.println(w_a1.intValue() + w_a2.intValue());
		
		
		
		//Auto Boxing
		Integer auto_integer = 10; //new Integer(10);
		
		//Auto UnBoxing
		System.out.println(w_a1 + w_a2);

		
		
	}
	
}
