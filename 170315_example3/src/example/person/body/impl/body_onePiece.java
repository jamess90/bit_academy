package example.person.body.impl;

import example.person.body.IBody;

public class body_onePiece implements IBody{

	@Override
	public void showInfo() {
		System.out.println("���� : �ɹ���");
		System.out.println("�귣�� : �������ϻ�");		
	}
	
	@Override
	public String toString() {
		return "���ǽ�";
	}
	
}
