package example.building.door.impl;

import example.building.door.IDoor;

public class SlidingDoor implements IDoor{

	@Override
	public void openDoor() {
		System.out.println("�̴��̹� ����");
	}
	
	@Override
	public void closeDoor() {
		System.out.println("�̴��̹� �ݱ�");
	}
	
	
	
	
}
