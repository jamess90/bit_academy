package example_class;

public class main04 {

	public static void main(String[] args) {
		
		// UpCasting
		// '자식 is a 부모'가 성립된다.
		
		Shape s = new Circle(20);	//원을 만들고 이걸 도형이라고 부른다.
		s.makeArea();					// 도형의 넓이를 구하라 -> 원의 넓이를 구하라
		
		System.out.println(s);			// 원을 도형으로 부르겠다. 도형을 객체로 불러서
											// 객체의 정보를 출력해라-> 원에 대한 정보를 출력
											// System.out.println(Object x);
		Circle c = (Circle)s;
	
		
		// DownCasting
		// 부모 is 자식 (문법x 논리x) -> 컴파일 에러
		// Circle c = new Shape();		// 추상 클래스가 아니더라도 논리적으로 알맞지
											// 않기 때문에 컴파일 오류
											// 도형은 원이다 (x)
		
		// 하지만 도형이 애초에 어떠한 (원이든 사각형이든) 도형으로 만들어져
		// 있었다면 논리적으로 맞다.
		// 이 도형은 원이다.
		
		Circle circle = (Circle)s;		// 이 도형은 원이다.
		Square square = (Square)s;	// 이 도형은 사각형이다.(문법o 논리 o)
											// 하지만 애초에 도형이 원으로 만들어져 있기 때문에
					// 컴파일에서는 에러가 안나지만, 실행시에 에러가 난다.
					// ClassCastException (형번환 예외)
		
		
		
	}
	
}
