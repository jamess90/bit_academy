package example.person.leg.impl;

import example.person.leg.ILeg;

public class leg_bluePants implements ILeg{

	@Override
	public void showInfo() {
		System.out.println("색상 : 청색");
		System.out.println("브랜드 : GUESS");		
	}
	
	@Override
	public String toString() {
		return "청바지";
	}
}
