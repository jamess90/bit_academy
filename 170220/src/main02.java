
public class main02 {

	public static void main(String[] args) {
		//�ڹ��� �⺻ �ڷ���
		//1) char ���ڸ� ǥ���ϱ� ���� �ڷ��� ũ�� : 2byte
		// ���ڴ� ���� ����ǥ�� Ȱ���Ѵ�.
		
		char ch = 'A';		//�� ���� ���ڸ� ���� �� �� �ִ�.
		//char ch2 = 'AB';	//error
		
		//2) byte, short, int, long
		// ����(+,-,*,/) �ÿ� ��� ���� �ڷ�����  int�� �ڵ����� ��ȯ�ϱ� ������
		// ������ ǥ�� �� ���� �׻� int�� ������ �����ϴ� ���� ����
		// * byte�� �ڷḦ ���� ���� �ּ� �ڷ������� �ڷ���� ���� �� �� ����Ѵ�.
		
		int num = 100;
		//int num2 = 100.123; �Ǽ� �ڷḦ ������ ������ ���� �� �� ����.
		
		long l = 100L;	//long���� ���� �ڿ� L�� �ٿ��ش�.
		
		//3) float, double
		//�Ҽ��� �ڷ���(�Ǽ���)
		
		float f = 10.123f;	//float���� �Ǽ� �ڿ� f�� �ٿ� �ش�.
		double d = 10.123;	//double���� �Ҽ��� ǥ�� �ϸ� �ȴ�.
		
		//4) ����(true/false)�� ǥ���ϴ� boolean
		boolean b1 = true; 
		boolean b2 = false;
		
		//boolean b3 = 10;		//true/false �̿� �ٸ� ���� ���� �� �� ����.
		
		//�ڷ��� ����ȯ
		
		char ch2 = 'A'+1;	//2byte
		int i2 = ch2;	//4byte	���� ������ �ִ� �����ʹ� ū ������ ������ ������ �Ű� �� �� �ִ�.
						//�ڵ� ����ȯ(������, �Ͻ��� ����ȯ)
		
		System.out.println(ch2);
		System.out.println(i2);
		
		double d2 = 10.1;		//8 byte
		int i3 = (int)d2;			//4 byte	�����(������) ����ȯ
		
		System.out.println(d2);
		System.out.println(i3);
		
		byte bb = (byte)512;
		System.out.println(bb);
		
		String str = "Hello";	//���ڿ��� ū ����ǥ
		System.out.println(str); 
		
		
		
		
		
	}

}
