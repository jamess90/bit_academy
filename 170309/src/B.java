
public class B {

	public int m_num = 10;			// B클래스 객체가 생성될 때 생성
	public static int s_num = 10;	// 프로그램 시작 시 생성
									// 즉 B클래스가 객체가 되지 않아도 사용할 수 있는 변수

	public void foo(){
		System.out.println("멤버 메소드 foo()");
	}
	
	public static void goo(){
		System.out.println("정적 메소드 goo()");
	}
	
	// 정적 메소드 내부에서 일반 멤버 변수나 메소드를 사용할 수 있을까?
	// 일반 멤버 메소드에서 정적 메소드나 정적 변수를 사용할 수 있을까?
	
}
