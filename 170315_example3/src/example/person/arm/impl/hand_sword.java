package example.person.arm.impl;

import example.person.arm.IHand;

public class hand_sword implements IHand{
	
	@Override
	public void showInfo() {
		System.out.println("�귣�� : (��)��ī����");		
	}
	
	
	@Override
	public String toString() {
		return "Į";
	}
}
