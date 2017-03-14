package example.building.door.impl;

import example.building.Building;

public class main02 {

	public static void main(String[] args) {
		Building building1 = new Building(new HingedDoor());
		
		building1.in();
		building1.out();

		
		Building building2 = new Building(new SlidingDoor());
		
		building2.in();
		building2.out();
	}
}
