package abstract_class;

public class main04 {

	public static void main(String[] args) {

		
//		AA a1 = new AA(10);	// �߻� Ŭ������ ��ü�� ���� �� ����.
		
		// �͸� Ŭ���� -> ���ٽİ� ����(�Լ����� ���α׷���)
		AA a2 = new AA(20){
			
			protected void foo() {
				
			};
		};

		BB b1 = new BB(10,20);
		
//		CC c1 = new CC(10);
		
		DD d1 = new DD(10, 20, 30);
	}
	
}
