package example.person.arm.impl;

import example.person.arm.IHand;

public class hand implements IHand{
	
	@Override
	public void showInfo() {
		System.out.println("색상 : 살색");
		System.out.println("브랜드 : 엄마표");		
	}
	
	
	@Override
	public String toString() {
		return "맨손";
	}
}
