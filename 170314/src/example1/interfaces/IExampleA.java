package example1.interfaces;

public interface IExampleA {
	
	// 1) 추상 메소드만 작성된다,
	void foo();		// 추상메소드
	
	// 2) 구현된 형태의 메소드는 static 형태의 메소드 밖에 올 수 없다.
	static void goo(){
		System.out.println("IExampleA.goo()");
	}
	
	// 3) 멤버 변수 형태(필드)의 변수도 올 수 없다.
	//private int a = 10;		// 멤버변수가 아니다... 
	int a = 10;					// 묵시적으로 public static final이 붙어있다.
	
}
