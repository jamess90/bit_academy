
public class main03 {

	public static void main(String[] args) {
		int a = 10;
		a++;			//���� ����(�����ݷ��� �������� 1 ����)    10
		System.out.println(a);		//a => 11
		
		int b = 10;
		++b;			//���� ���� (�����ݷ��� ������ ���� 1 ����)
		System.out.println(b);
		
		int c = 10;
		int d = 10;
		
		System.out.println(c++);
		System.out.println(++d);
		
		
		int e = 0;
		System.out.println(e++);//0
		System.out.println(++e);//2
		System.out.println(e--);//2
		System.out.println(e--);//1
		System.out.println(++e);//1
		System.out.println(--e);//0
		
		System.out.println(2+2);	// 4
		System.out.println(2+2*2);	// ������ �켱 ������ ���� ������ 2*2���� ����..
									// 6
		
		System.out.println(2+2/2*3+2/1-3+1/4*2);
		System.out.println(2+((2/2)*3)+(2/1)-3+((1/4)*2));
		
		//�޸� ũ�⿡ ���� ������
		System.out.println(5/2);	//�� ���ϱ�
		System.out.println(5%2);	//������ ���ϱ�
		System.out.println((double)5/2);
		System.out.println(5/(double)2);
		System.out.println((double)(5/2));
		
		
		
	}
	
}