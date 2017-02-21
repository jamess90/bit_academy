
public class main04 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 5;
		
		System.out.println(num1 > 10);	//false => num1이 10보다 큰가?
		System.out.println(num1 >= 10);	//true  => num1이 10보다 크거나 같은가?
		
		System.out.println(num2 < 10);	//true
		System.out.println(num2 < num1);//num2가 들고 있는 값이 num1이 들고 있는 값보다 작은가?
		
		// = -> 대입 연산
		// == : 왼쪽에 있는 값이 오른쪽에 있는 값과 같은가?
		// != : 왼쪽에 있는 값이 오른쪽에 있는 값과 다른가?(부정)
		System.out.println(num1 == 10);	//num1이 들고 있는 값이 10과 같은가?
		System.out.println(num1 != 10); //num1이 들고 있는 값이 10과 다른가?
		System.out.println(num1 != num2);
		
		//num1이 5보다 크고, 10보다 작거나 같은가		==>  true
		System.out.println(num1 > 5 && num1 <= 10);
		
		//num2가 5보다 작거나 같거나 num2가 10보다 큰가	==> true
		System.out.println(num2 <= 5 || num2 > 10);
		//5<num<10	=> 잘못된 문법
		
		// &&(AND) : 왼쪽이 거짓이면 오른쪽 연산은 수행하지 않는다.
		// ||(OR ) : 왼쪽이 참이면 오른쪽 연산은 수행하지 않는다.
		
		//조건연산자(삼항연산자) ?
		//num1이 num2보다 크다면 num3에 10을 집어 넣고
		// 아니면 20을 집어 넣어라.
		// 조건(비교, 논리) -> boolean 결과 ? 참일 때 실행할 문장 : 거짓일 때 실행할 문장
		int num3 = num1 < num2 ? 10 : 20;
		System.out.println(num3);
		
		int num4 = 5;
		//num4가 들고 있는 값에서 5를 더한 다음에 변수 num4에 대입
		num4 += 5;	//num4 = num4+5
		
		System.out.println(num4);
		
		num4 -= 10;	//num4 = num4-10;
		num4 *= 1;	// num4 = num4 * 1;
		num4 /= 1;	// num4 = num4 / 1;
		
		
	
		
		
	}
	
}
