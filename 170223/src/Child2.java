
public class Child2 extends Parent2{

	private int num3;
	private int num4;
	
	// �ڽ� Ŭ������ �θ� Ŭ������ ��ü ������ ���� å���� �����Ѵ�.
	// �ڽ� Ŭ������ �����ڿ��� �θ� Ŭ������ �����ڿ� ���� å���� ����.
	// (��������� �θ��� �����ڸ� ȣ���Ͽ� ��ü�� �����.)
	public Child2(int num1, int num2, int num3, int num4) {
		
//		System.out.println("��ü �����");		//error!
															// �θ� �����Ǳ� ���� �ڽ��� �ƹ��͵� �� �� ����.
		
		super(num1, num2);		// �θ� Ŭ���� ��ü�� ����� ���� �Ű����� ����
										// �ڽ� Ŭ�������� �θ� Ŭ������ ����� ���� �Ű������� ��� �޴´�.
	
		this.num3 = num3;
		this.num4 = num4;
		
		System.out.println("Child2 ������ ȣ��");
	}
	
	public void ShowChild2Info(){
		System.out.println("num3 : " + num3);
		System.out.println("num4 : " + num4);
	}

}
