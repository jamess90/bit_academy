
public class main01 {
	public static void main(String[] args) {
		B b1 = new B(100);
		
		String str = b1.toString();
		// B���� toString()�� ������ �Ǿ����� �ʱ� ������
		// �ٷ� ���� �θ��� AŬ������ toString()�� ȣ���Ѵ�.
		// ���� A���� toString()�� ������ �Ǿ� ���� ������
		// Object�� toString()�� ȣ���Ѵ�.
		System.out.println(str);
	}
}
