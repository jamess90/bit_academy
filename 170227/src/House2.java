
public class House2 {

	IDoor iDoor;

	public House2(IDoor iDoor) {
		this.iDoor = iDoor;

	}

	public void in(){
		iDoor.openDoor();
		System.out.println("���� ����");
		System.out.println();
	}
	
	public void out(){
		System.out.println("������ ����");
		iDoor.closeDoor();
		System.out.println();
	}
	
	
}