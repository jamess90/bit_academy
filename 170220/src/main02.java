
public class main02 {

	public static void main(String[] args) {
		//자바의 기본 자료형
		//1) char 문자를 표현하기 위한 자료형 크기 : 2byte
		// 문자는 작은 따옴표를 활용한다.
		
		char ch = 'A';		//한 개의 문자만 대입 할 수 있다.
		//char ch2 = 'AB';	//error
		
		//2) byte, short, int, long
		// 연산(+,-,*,/) 시에 모든 정수 자료형을  int로 자동으로 변환하기 때문에
		// 정수를 표현 할 때는 항상 int로 변수를 선언하는 것이 좋다
		// * byte는 자료를 모을 때나 최소 자료형으로 자료들을 분할 할 때 사용한다.
		
		int num = 100;
		//int num2 = 100.123; 실수 자료를 정수형 변수에 대입 할 수 없다.
		
		long l = 100L;	//long형은 정수 뒤에 L을 붙여준다.
		
		//3) float, double
		//소수점 자료형(실수형)
		
		float f = 10.123f;	//float형은 실수 뒤에 f를 붙여 준다.
		double d = 10.123;	//double형은 소수만 표현 하면 된다.
		
		//4) 논리값(true/false)를 표현하는 boolean
		boolean b1 = true; 
		boolean b2 = false;
		
		//boolean b3 = 10;		//true/false 이외 다른 값을 대입 할 수 없다.
		
		//자료의 형변환
		
		char ch2 = 'A'+1;	//2byte
		int i2 = ch2;	//4byte	작은 공간에 있던 데이터는 큰 공간의 데이터 변수로 옮겨 질 수 있다.
						//자동 형변환(묵시적, 암시적 형변환)
		
		System.out.println(ch2);
		System.out.println(i2);
		
		double d2 = 10.1;		//8 byte
		int i3 = (int)d2;			//4 byte	명시적(강제적) 형변환
		
		System.out.println(d2);
		System.out.println(i3);
		
		byte bb = (byte)512;
		System.out.println(bb);
		
		String str = "Hello";	//문자열은 큰 따옴표
		System.out.println(str); 
		
		
		
		
		
	}

}
