
public class B extends A{

//	public B(){
//		System.out.println("B()����");
//	}
	
	// �θ� Ŭ������ �����ڿ� �Ű������� ������
	// �ڽ� Ŭ�������� �θ� Ŭ������ �Ű��������� �޾Ƴ���
	// ��������� �θ� Ŭ������ �ν��Ͻ��� ������ �Ѵ�.
	public B(int num) {
		
//		System.out.println("Hello");	// error!
		// �θ�Ŭ������ ������ ȣ�⺸�� ���� ����� �� ����.
		super(num); // �θ� Ŭ������ ������ ȣ�� ����
		System.out.println("B(int num) ����");
		
	}
	
}
