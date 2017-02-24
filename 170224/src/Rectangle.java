
public class Rectangle extends Shape {
	private double width;
	private double height;
	private String name;
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
		this.name = "���簢��";
	}

	// �������̵��� ����
	// 1) ��ȯ��, �޼ҵ��, �Ű������� �θ��� �޼ҵ�� �Ϻ��� ��ġ�ؾ� �Ѵ�.
	// 2) �������� �����ڴ� �θ��� �ͺ��� �аų� ���ƾ� �Ѵ�.

	@Override
	protected final void makeArea() {
		super.makeArea(); // �θ��� �޼ҵ� ȣ�� (super.�޼ҵ��)
		super.area = this.width * this.height;
	}

	@Override
	public final void showShapeInfo() {
		// ���� ���ϱ�
		this.makeArea();
		System.out.println("��   �� : " + this.name);
		System.out.println("��   �� : " + this.width);
		System.out.println("��   �� : " + this.height);
		System.out.println("��   �� : " + super.area);
		System.out.print("Ư   ¡ : ");
	}
	
	public void stack(){
		System.out.println("���� �� �ִ�.");
	}
}