package example.person.leg.impl;

import example.person.leg.ILeg;

public class leg_redSkirt implements ILeg{

	@Override
	public void showInfo() {
		System.out.println("색상 : 빨강");
		System.out.println("브랜드 : 다이소");		
	}
	
	@Override
	public String toString() {
		return "빨간치마";
	}
}
