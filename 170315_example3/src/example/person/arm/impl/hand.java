package example.person.arm.impl;

import example.person.arm.IHand;

public class hand implements IHand{
	
	@Override
	public void showInfo() {
		System.out.println("���� : ���");
		System.out.println("�귣�� : ����ǥ");		
	}
	
	
	@Override
	public String toString() {
		return "�Ǽ�";
	}
}
