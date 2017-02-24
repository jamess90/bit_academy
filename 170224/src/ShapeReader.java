
public class ShapeReader {

//	public void readShape (Circle circle){
//		
//	}
//	public void readShape (Square square){
//		
//	}
//	

	public void readShape (Shape shape){			// ȣ��� �� Up-casting�� �Ͼ��.
		shape.showShapeInfo();
	
//		shape.rolling();			// ���� �ִ� �޼ҵ�
//		shape.stack();				// �簢���� �ִ� �޼ҵ�
										// ������ ���������� �� ������ ���� Ȯ��� ����� ȣ���� �� ����.
		
		
		if(shape instanceof Circle){						// instanceof�� boolean���� ��ȯ
			Circle circle = (Circle)shape;					// Down-casting�� �Ͼ��.
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
			System.out.println("��ϵ� ������ �ƴϴ�.");
		}
	}
}
