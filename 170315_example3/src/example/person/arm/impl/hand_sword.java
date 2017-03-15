package example.person.arm.impl;

import example.person.arm.IHand;

public class hand_sword implements IHand{
	
	@Override
	public void showInfo() {
		System.out.println("브랜드 : (주)나카무라");		
	}
	
	
	@Override
	public String toString() {
		return "칼";
	}
}
