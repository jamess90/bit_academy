
public class main04 {

	public static void main(String[] args) {
		
		
		B.goo();
		
		B b1 = new B();
		b1.m_num++;
		B.s_num++;
		
		b1.foo();
		b1.goo();
		
		
		System.out.println(b1.m_num);
		System.out.println(B.s_num);
		
		B b2 = new B();
		b2.m_num++;
		B.s_num++;
		
		System.out.println(b2.m_num);
		System.out.println(B.s_num);
		
		b1.foo();		// �Ϲ� ��� �޼ҵ�� ���� ������ �̿��Ͽ� ȣ��
						// ��ü�� ��������߸� ��� ������ ���°� �Ǳ� ������
		
		B.goo();		// ���� �޼ҵ�� ���α׷� ������ �� �̹� ��밡���� �����̴�.
						// ���� ���� ������ �ʿ� ����. ( ���� ������ ��������)
	
	}

}
