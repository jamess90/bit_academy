
public class main03 {
	public static void main(String[] args) {
		
		ShapeReader sr = new ShapeReader();
		sr.readShape(new Circle(10));					// Shape shape = new Circle(10);
		System.out.println();	
		sr.readShape(new Square(10));			// Shape shape = new Square(10, 20);
		System.out.println();
		sr.readShape(new Rectangle(10,20));
		System.out.println();
		sr.readShape(new Triangle(10, 20));			// Shape shape = new Triangle(10, 20);
		System.out.println();
		
		
		// �߻�Ŭ������ ������ ��ü�� ���� �� ����.
		// ->�߻� Ŭ������ �ڽ� Ŭ������ ���ؼ��� �޸� �Ҵ��� ���� �� �ִ�.
//		sr.readShape(new Shape());
//		
//		Shape shape =  new Shape();
//		
//		Circle circle = (Circle)shape;
//		Square square = (Square)shape;
	}
}
