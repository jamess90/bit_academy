
public class B {

	//�޼ҵ� �����ε�
	// �޼ҵ��� �̸��� �ߺ��ؼ� ���� �ϴ� ��
	// ��, �Ű������� Ÿ��(����)�� ����, ������ �޶�� �Ѵ�.
	
	//�����ε� ����� ����ϴ� ���
	//�޼ҵ尡 �Ű������� ���� �ǹ̰� ����� �۾��� ���� �� ��
	// ex) System.out.println();

	// char ���� ��� �޼ҵ�� : System.out.printChar(char ch);
	// int ���� ��� �޼ҵ�� : System.out.printInt(int i);
	// boolean ���� ��� �޼ҵ�� : System.out.printBoolean(boolean b);
	
	void foo(){
		System.out.println("B_FOO()");
	}
	
	//�޼ҵ��� �̸��� �Ȱ����� �Ű������� �ٸ��� ������ ���� ����(�����ε�)
	void foo(int num){
		System.out.println("B_FOO(int) : " + num);
	}
	//�Ű������� ����(�ڷ���)�� �ٸ��� ������ �����ε� ����
	void foo(double d){
		System.out.println("B_FOO(double) : " + d);
	}
	//�Ű������� ������ �ٸ��� ������ �����ε� ����
	void foo(int num1, int num2){
		System.out.println("B_FOO(int,int) : " + num1 + " " + num2);
	}
	
	//�Ű������� ������ �޶� �����ε� ����
	void foo(int num, double d){
		System.out.println("B_FOO(int,double) : " + num + " " + d);
	}
	void foo(double d, int num){
		System.out.println("B_FOO(double,int) : " + d + " " + num);
	}

//	//�Ű������� �������� �����ε� ���� ���ǿ� ���Ե��� �ʴ´�.
//	void goo(int num1){
//		System.out.println("B_GOO(int) : " + num1);
//	}
//	void goo(int num2){
//		System.out.println("B_FOO(int) : " + num2);
//	}
	
	
	
	
	
	
}
