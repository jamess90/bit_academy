
public class House {

	// ��
	// �����̵� ����
	// 1�ܰ� ����
	// House Ŭ������ SlidingDoor Ŭ������ ������ �ִ�. ('House' Has - a 'SldingDoor')
	private SlidingDoor slide;
	private HingedDoor hinged;

	public House() {
		slide = new SlidingDoor();
		hinged = new HingedDoor();
	}

	public void in() {
		slide.openDoor();
		System.out.println("���� ����");
	}


	public void out() {
		slide.closeDoor();
		System.out.println("������ ����");
	}
	public void in2() {
		hinged.openDoor();
		System.out.println("���� ����");
	}

	public void out2() {
		hinged.closeDoor();
		System.out.println("������ ����");
	}

}
