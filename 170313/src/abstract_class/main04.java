package abstract_class;

public class main04 {

	public static void main(String[] args) {

		
//		AA a1 = new AA(10);	// 추상 클래스는 객체로 만들 수 없다.
		
		// 익명 클래스 -> 람다식과 연관(함수지향 프로그래밍)
		AA a2 = new AA(20){
			
			protected void foo() {
				
			};
		};

		BB b1 = new BB(10,20);
		
//		CC c1 = new CC(10);
		
		DD d1 = new DD(10, 20, 30);
	}
	
}
