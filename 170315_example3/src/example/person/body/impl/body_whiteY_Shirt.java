package example.person.body.impl;

import example.person.body.IBody;

public class body_whiteY_Shirt implements IBody{

	@Override
	public void showInfo() {
		System.out.println("���� : ���");
		System.out.println("�귣�� : ��ũ����");		
	}
	
	@Override
	public String toString() {
		return "��� ���̼���";
	}
}
