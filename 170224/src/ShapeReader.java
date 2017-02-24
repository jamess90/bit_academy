
public class ShapeReader {

//	public void readShape (Circle circle){
//		
//	}
//	public void readShape (Square square){
//		
//	}
//	

	public void readShape (Shape shape){			// 호출될 때 Up-casting이 일어난다.
		shape.showShapeInfo();
	
//		shape.rolling();			// 원에 있는 메소드
//		shape.stack();				// 사각형에 있는 메소드
										// 때문에 도형에서는 각 도형의 따로 확장된 기능을 호출할 수 없다.
		
		
		if(shape instanceof Circle){						// instanceof는 boolean으로 반환
			Circle circle = (Circle)shape;					// Down-casting이 일어난다.
			circle.rolling();
		}else if(shape instanceof Square){
			Square square = (Square)shape;
			square.stack();
		}else if(shape instanceof Triangle){
			Triangle triangle = (Triangle)shape;
			triangle.pointed();
		}else if(shape instanceof Rectangle){
			Rectangle rectangle = (Rectangle)shape;
			rectangle.stack();
		}
		else{
			System.out.println("등록된 도형이 아니다.");
		}
	}
}
