package example.person.head.impl;

import example.person.head.IHead;

public class head_greenHat implements IHead{
	
	@Override
	public void showInfo() {
		System.out.println("���� : �ʷ�");
		System.out.println("�귣�� : MLB");		
	}
	
	@Override
	public String toString() {
		return "�ʷϻ� ����";
	}
}
