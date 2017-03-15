package example.person.body.impl;

import example.person.productInfo;
import example.person.body.IBody;

public class body_T_Shirt extends productInfo implements IBody {

	public body_T_Shirt(String color, String brand) {
		this.color = color;
		this.brand = brand;
	}
	
	@Override
	public void showInfo() {
		System.out.println("���� : " + this.color);
		System.out.println("�귣�� : " + this.brand);
	}
	
	@Override
	public String toString() {
		return color + "Ƽ����";
	}
}
