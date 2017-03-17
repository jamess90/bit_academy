package example.classes;

public class MyRuntimeException extends RuntimeException{

	//예외 메세지를 외부에서 입력 받아 사용한다.
	public MyRuntimeException(String errmsg){
		super(errmsg);
	}
	
}
