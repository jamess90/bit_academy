package example.person.leg.impl;

import example.person.leg.ILeg;

public class leg_shortPants implements ILeg{
	
	@Override
	public void showInfo() {
		System.out.println("���� : ���");
		System.out.println("�귣�� : ��Ʈ�ڽ�");
	}
	
	@Override
	public String toString() {
		return "������";
	}
}
