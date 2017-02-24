
public class main02 {
	public static void main(String[] args) {
		// 1) Up-Casting
		//		�ڽ� is a �θ��� ������ ������� �ʴ�. ( ���� �����̴�...(O))
		Shape shape = new Circle(5);

		// 2) Down-Casting
		// �θ� is a �ڽ��̶�� ������ ����ϴ�. ( ������ ���̴�...(X))
		
		// Circle circle = new Shape();	//error!!! ������ ���̴� ��� ���谡 ������ ���� ����.
		
		// Up-Casting�� ���� ����Ǿ�� �Ѵ�.
		Square square = new Square(24);
		Shape squareShape= square;		// Shape squareShape = new Square(10,20);
		
		Shape squareShape2 = new Square(21);
		
		Square downSquare = (Square)squareShape;	// �� ������ �簢���̴�. (O)
		Square downSquare2 = (Square)squareShape2;
//		Square downSquare2 = new Square(23, 51);
		

//		Circle errorCircle = (Circle)squareShape;		//������ ������ ����...
																	//���� �� ������ ����.
		
		
		// ������ instanceof
		// A instanceof B => boolean
		// A�� BŬ������ �θ� �� �ִ°�?
		// A�� BŬ������ ������� �̷���� �ִ°�?

		// ex>�θ� instanceof �ڽ� -> �� �θ� �ڽ��̶�� �θ� �� �ִ°�?
		//	(�� ������ �簢���̶�� �� �� �ִ°�?
		// ex>�ڽ� instanceof �θ� -> �� �ڽ��� �θ�Ŭ������ ������� �Ѵ���?
		// (�� �簢���� ������ ������� ������� �ִ°�?)
		
		
		if(squareShape instanceof Square){
			System.out.println("�簢���Դϴ�.");
		
		}
		
		if(shape instanceof Circle){
			System.out.println("�� �Դϴ�.");
		}else{
			System.out.println("����, �簢���� �ƴմϴ�.");
		}
		
		// �簢���� �����Դϱ�?
		if(square instanceof Shape){
			System.out.println("�簢���� �����Դϴ�.");
		}
		
		shape.showShapeInfo();
	}
}
