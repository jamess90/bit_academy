
public class main03 {
	public static void main(String[] args) {
		
		// 1) �θ��� �����ں��� ȣ���Ѵ�. ( �θ� ��ü�� ���� ���� ����)
		// 2) �ڽ��� �����ڸ� ȣ���Ѵ�. ( �θ� ��ü�� ������� ����
		//    �� ��ü�� �����ϴ� ���·� �ڽ� ��ü�� ����� ����.)
		
		Child child = new Child();				// new Child() �� �߻��ϴ� �޸� �ּҰ��� 
														//	Child ��ü�� �ּҰ��̴�.
		child.foo();									// �θ� ���ǵ� foo();
		child.goo();									// �ڽĿ� ���ǵ� goo();
			
		Parent parent = new Parent();		// �θ��� �����ڸ� ȣ���
		parent.foo();								// �θ� ������ �ִ� foo();
//		parent.goo();								// �ڽ��� ������ �ִ� goo();
		
	}
}
