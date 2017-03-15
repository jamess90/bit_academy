package example.person.arm.impl;

import example.person.arm.IHand;

public class hand_gun implements IHand{
	
	@Override
	public void showInfo() {
		System.out.println("색상 : 검정");
		System.out.println("브랜드 : 글록");		
	}
	
	@Override
	public String toString() {
		return "총";
	}
}
