package example.person.leg.impl;

import example.person.leg.ILeg;

public class leg_bluePants implements ILeg{

	@Override
	public void showInfo() {
		System.out.println("���� : û��");
		System.out.println("�귣�� : GUESS");		
	}
	
	@Override
	public String toString() {
		return "û����";
	}
}
