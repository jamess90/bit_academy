package example.building;
import example.building.door.*;
import example.building.door.impl.HingedDoor;

public class Building {
	
	private IDoor door;

	public Building(IDoor door) {
		this.door = door;
	}
	
	public void in(){
		System.out.println("신원 확인");
		System.out.println("보안 확인");

		door.openDoor();
		door.closeDoor();
	}

	public void out(){
		System.out.println("보안 확인");

		door.openDoor();
		door.closeDoor();
	}
	
	
	
	
}
