package example.classes;

public class ExceptionTest {

	//Checked Exception : 
	//Exception클래스 상속 받은 예외
	
	//foo라는 메소드를 호출 했을 때 
	// MyException 예외가 날 수 있으니 처리해라~~~
	public void foo(int n) throws MyException{
		
		//예외가 발생 될 조건
		if(n < 0){
			//예외 발생!
			// 예외 발생 시에 예외 객체를 만들어서 catch문에 던진다
			throw new MyException();
		}else{
			System.out.println("foo(int) : " + n);
		}
		
	}
	//RuntimeException 클래스를 상속받은 예외는 throws를 반드시 써줄 필요는 없다.
	// 하지만 쓰는게 좋다.
	public void goo(int n) throws MyRuntimeException{
		if(n < 0){
			throw new MyRuntimeException("음수가 매개변수로 들어 올 수 없다.");
		}else{
			System.out.println("goo(int) : " + n);
		}
	}
	
}
