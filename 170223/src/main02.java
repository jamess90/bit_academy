
public class main02 {
	public static void main(String[] args) {

		B b1 = new B();
		
		b1.m_showInfo();
		b1.s_showInfo();
		
		
		B b2 = new B();
		B b3 = new B();
		B b4 = new B();
		B b5 = new B();

		// 외부에서 static 변수를 활용하기
		// ( 클래스명.static 변수명 )
		// 단, static 변수가 public으로 되어있어야 한다.
		// 즉, static 변수도 접근제한자의 영향을 받는다.
		
		// static 변수에 접근하기 위해서는 인스턴스 이름으로 해도 되지만
		// 헷갈릴 여지가 있기 때문에 클래스 이름으로 한다.
		System.out.println("B.s_num : " + B.s_num);
		
		
		
	}
}
