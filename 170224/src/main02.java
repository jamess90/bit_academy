
public class main02 {
	public static void main(String[] args) {
		// 1) Up-Casting
		//		자식 is a 부모라는 문장이 어색하지 않다. ( 원은 도형이다...(O))
		Shape shape = new Circle(5);

		// 2) Down-Casting
		// 부모 is a 자식이라는 문장이 어색하다. ( 도형은 원이다...(X))
		
		// Circle circle = new Shape();	//error!!! 도형은 원이다 라는 관계가 설정될 수는 없다.
		
		// Up-Casting이 먼저 수행되어야 한다.
		Square square = new Square(24);
		Shape squareShape= square;		// Shape squareShape = new Square(10,20);
		
		Shape squareShape2 = new Square(21);
		
		Square downSquare = (Square)squareShape;	// 이 도형은 사각형이다. (O)
		Square downSquare2 = (Square)squareShape2;
//		Square downSquare2 = new Square(23, 51);
		

//		Circle errorCircle = (Circle)squareShape;		//컴파일 에러가 없다...
																	//실행 시 에러가 난다.
		
		
		// 연산자 instanceof
		// A instanceof B => boolean
		// A는 B클래스로 부를 수 있는가?
		// A는 B클래스를 기반으로 이루어져 있는가?

		// ex>부모 instanceof 자식 -> 이 부모를 자시이라고 부를 수 있는가?
		//	(이 도형을 사각형이라고 할 수 있는가?
		// ex>자식 instanceof 부모 -> 이 자식은 부모클래스를 기반으로 한느가?
		// (이 사각형은 도형을 기반으로 만들어져 있는가?)
		
		
		if(squareShape instanceof Square){
			System.out.println("사각형입니다.");
		
		}
		
		if(shape instanceof Circle){
			System.out.println("원 입니다.");
		}else{
			System.out.println("원도, 사각형이 아닙니다.");
		}
		
		// 사각형이 도형입니까?
		if(square instanceof Shape){
			System.out.println("사각형은 도형입니다.");
		}
		
		shape.showShapeInfo();
	}
}
