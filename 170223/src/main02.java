
public class main02 {
	public static void main(String[] args) {

		B b1 = new B();
		
		b1.m_showInfo();
		b1.s_showInfo();
		
		
		B b2 = new B();
		B b3 = new B();
		B b4 = new B();
		B b5 = new B();

		// �ܺο��� static ������ Ȱ���ϱ�
		// ( Ŭ������.static ������ )
		// ��, static ������ public���� �Ǿ��־�� �Ѵ�.
		// ��, static ������ ������������ ������ �޴´�.
		
		// static ������ �����ϱ� ���ؼ��� �ν��Ͻ� �̸����� �ص� ������
		// �򰥸� ������ �ֱ� ������ Ŭ���� �̸����� �Ѵ�.
		System.out.println("B.s_num : " + B.s_num);
		
		
		
	}
}
