
public class main01 {

	public static void main(String[] args) {
		//1. 리터럴
		//  -> 코드 상에 써져있는 명확한 값
		
		int a = 10; //변수 : a, 상수(리터럴) : 10
		
		//2. final 키워드를 이용한 식별자가 있는 상수 (상수화)
		// final 키워드를 붙이면 변수가 아닌 상수의 형태로 지정 가능
		// final은 C에서의 const와 비슷하다. class나 method의 재정의를 막기 위하여 사용한다.
		// final이 붙으면 변수 이름을 대문자로 한다.
		
		final int TEN = 10;
		
		a = 20;
//		TEN = 20;
		
	}
}
