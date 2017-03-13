package example_class;

public class main03 {

	public static void main(String[] args) {

		Circle circle = new Circle(30);
		Square square = new Square(20, 40);

		circle.makeArea();
		System.out.println(circle.toString());
		
		square.makeArea();
		System.out.println(square.toString());
	
		circle = null;
		square = null;
	   
       System.gc();  //가비지컬렉터를 호출 합니다.
		
	}
}
