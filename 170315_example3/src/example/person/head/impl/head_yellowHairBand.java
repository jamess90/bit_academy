package example.person.head.impl;

import example.person.head.IHead;

public class head_yellowHairBand implements IHead{
	
	@Override
	public void showInfo() {
		System.out.println("���� : ���");
		System.out.println("�귣�� : ����Ű");
		
	}
	
	@Override
	public String toString() {
		return "��� �Ӹ���";
	}
}
