
public class House2 {

	IDoor iDoor;

	public House2(IDoor iDoor) {
		this.iDoor = iDoor;

	}

	public void in(){
		iDoor.openDoor();
		System.out.println("Áý¿¡ µé¾î¿È");
		System.out.println();
	}
	
	public void out(){
		System.out.println("Áý¿¡¼­ ³ª¿È");
		iDoor.closeDoor();
		System.out.println();
	}
	
	
}