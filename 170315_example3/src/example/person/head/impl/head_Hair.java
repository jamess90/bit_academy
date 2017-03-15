package example.person.head.impl;

import example.person.productInfo;
import example.person.body.IBody;
import example.person.head.IHead;

public class head_Hair extends productInfo implements IHead {

	
	public head_Hair(String color, String brand) {
		this.color = color;
		this.brand = brand;
	}
	
	@Override
	public void showInfo() {
		System.out.println("���� : " + this.color );
		System.out.println("�귣�� : " + this.brand );
	}
	
	@Override
	public String toString() {
		return color + "�Ӹ�";
	}
}
