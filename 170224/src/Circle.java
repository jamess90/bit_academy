
public final class Circle extends Shape {

	private int r;

	public Circle(int r) {
		// super();
		this.r = r;
		this.name = "��";
	}

	// �������̵��� ����
	// 1) ��ȯ��, �޼ҵ��, �Ű������� ���θ��� �޼ҵ�� �Ϻ��� ��ġ�ؾ� �Ѵ�.
	// 2) �������� �����ڴ� �θ��� �ͺ��� �аų� ���ƾ� �Ѵ�.

	@Override
	protected final void makeArea() {
		super.makeArea(); // �θ��� �޼ҵ� ȣ�� (super.�޼ҵ��)
		// super.area = this.r * this.r * 3.14;
		super.area = Math.pow(this.r, 2) * Math.PI;
	}

	// �߻� �޼ҵ带 ��ӹ��� Ŭ���������� ������ ������ �ؾ��Ѵ�.
	@Override
	public final void showShapeInfo() {
		// ���� ���ϱ�
		this.makeArea();
		System.out.println("��   �� : " + this.name);
		System.out.println("������ : " + this.r);
		System.out.println("��   �� : " + super.area);
		System.out.print("Ư   ¡ : ");

	}

	// Object Ŭ������ ���ǵ� toString() �������̵�
	// -> Object Ŭ�������� ��ü�� ǥ���ϴ� ���(��Ű����.Ŭ����@�޸� ���Ұ�)�� �ƴѤ�
	//    �ش� Ŭ������ ������ ������� ������ �� �ְ� ���ش�.
	//    ������ ��� ������ ���� Ȯ���ϴ� �뵵�� �����.
	
	@Override
	public String toString() {
		
//		return super.toString();			// �θ��� toString()�� ���� �� ����
												// Ŭ����@�޸� �ּҰ�
		makeArea();
		return "[������ : " + this.r + "]\n" + "[��   �� : " + super.area + "]";
	}
	
	
	public void rolling(){
		System.out.println("��������.");
	}
}
