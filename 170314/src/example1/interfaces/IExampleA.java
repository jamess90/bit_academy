package example1.interfaces;

public interface IExampleA {
	
	// 1) �߻� �޼ҵ常 �ۼ��ȴ�,
	void foo();		// �߻�޼ҵ�
	
	// 2) ������ ������ �޼ҵ�� static ������ �޼ҵ� �ۿ� �� �� ����.
	static void goo(){
		System.out.println("IExampleA.goo()");
	}
	
	// 3) ��� ���� ����(�ʵ�)�� ������ �� �� ����.
	//private int a = 10;		// ��������� �ƴϴ�... 
	int a = 10;					// ���������� public static final�� �پ��ִ�.
	
}
