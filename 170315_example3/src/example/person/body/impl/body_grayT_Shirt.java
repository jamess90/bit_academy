package example.person.body.impl;

import example.person.body.IBody;

public class body_grayT_Shirt implements IBody {

	@Override
	public void showInfo() {
		System.out.println("���� : ȸ��");
		System.out.println("�귣�� : ���Ŀ�");		
	}
	
	@Override
	public String toString() {
		return "ȸ�� Ƽ����";
	}
}
