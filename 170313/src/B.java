
public class B extends A{

//	public B(){
//		System.out.println("B()생성");
//	}
	
	// 부모 클래스의 생성자에 매개변수가 있으면
	// 자식 클래스에서 부모 클래스의 매개변수까지 받아내어
	// 명시적으로 부모 클래스의 인스턴스를 만들어야 한다.
	public B(int num) {
		
//		System.out.println("Hello");	// error!
		// 부모클래스의 생성자 호출보다 먼저 실행될 수 없다.
		super(num); // 부모 클래스의 생성자 호출 시점
		System.out.println("B(int num) 생성");
		
	}
	
}
