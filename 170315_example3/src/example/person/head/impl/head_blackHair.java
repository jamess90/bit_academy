package example.person.head.impl;

import example.person.body.IBody;
import example.person.head.IHead;

public class head_blackHair implements IHead {

	@Override
	public void showInfo() {
		System.out.println("�귣�� : �ؿ����");
	}
	
	@Override
	public String toString() {
		return "���� �Ӹ�";
	}
}
