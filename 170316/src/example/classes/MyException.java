package example.classes;

//사용자 정의 Exception
public class MyException extends Exception{
	//1) getMessage 오버라이딩
	//2) 생성자에서 예외 메세지 입력
	
	@Override
	public String getMessage() {
		return "매개변수가 음수입니다.";
	}
	
}
