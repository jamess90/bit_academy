package example.main;

public class main01 {

	public static void main(String[] args) {
		//Wrapper Class
		// 기본자료형을 클래스화
		
		//int->기본자료형
		int a1 = 10;
		
		//Boxing
		Integer w_a1 = new Integer(10);
		
		//문자열을 내가 원하는 기본 자료형 형태로 만들자
		Integer w_a2 = new Integer("10");
		int w_a3 = Integer.valueOf("10");
		
		int w_a4 = Integer.valueOf(10);
		
		//UnBoxing
		System.out.println(w_a1.intValue() + w_a2.intValue());
		
		
		
		//Auto Boxing
		Integer auto_integer = 10; //new Integer(10);
		
		//Auto UnBoxing
		System.out.println(w_a1 + w_a2);

		
		
	}
	
}
