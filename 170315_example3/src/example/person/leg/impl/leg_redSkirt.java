package example.person.leg.impl;

import example.person.leg.ILeg;

public class leg_redSkirt implements ILeg{

	@Override
	public void showInfo() {
		System.out.println("���� : ����");
		System.out.println("�귣�� : ���̼�");		
	}
	
	@Override
	public String toString() {
		return "����ġ��";
	}
}
