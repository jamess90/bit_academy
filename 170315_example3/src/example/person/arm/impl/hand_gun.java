package example.person.arm.impl;

import example.person.arm.IHand;

public class hand_gun implements IHand{
	
	@Override
	public void showInfo() {
		System.out.println("���� : ����");
		System.out.println("�귣�� : �۷�");		
	}
	
	@Override
	public String toString() {
		return "��";
	}
}
