package example_class;

public class main04 {

	public static void main(String[] args) {
		
		// UpCasting
		// '�ڽ� is a �θ�'�� �����ȴ�.
		
		Shape s = new Circle(20);	//���� ����� �̰� �����̶�� �θ���.
		s.makeArea();					// ������ ���̸� ���϶� -> ���� ���̸� ���϶�
		
		System.out.println(s);			// ���� �������� �θ��ڴ�. ������ ��ü�� �ҷ���
											// ��ü�� ������ ����ض�-> ���� ���� ������ ���
											// System.out.println(Object x);
		Circle c = (Circle)s;
	
		
		// DownCasting
		// �θ� is �ڽ� (����x ��x) -> ������ ����
		// Circle c = new Shape();		// �߻� Ŭ������ �ƴϴ��� �������� �˸���
											// �ʱ� ������ ������ ����
											// ������ ���̴� (x)
		
		// ������ ������ ���ʿ� ��� (���̵� �簢���̵�) �������� �������
		// �־��ٸ� �������� �´�.
		// �� ������ ���̴�.
		
		Circle circle = (Circle)s;		// �� ������ ���̴�.
		Square square = (Square)s;	// �� ������ �簢���̴�.(����o �� o)
											// ������ ���ʿ� ������ ������ ������� �ֱ� ������
					// �����Ͽ����� ������ �ȳ�����, ����ÿ� ������ ����.
					// ClassCastException (����ȯ ����)
		
		
		
	}
	
}
