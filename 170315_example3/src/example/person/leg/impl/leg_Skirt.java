package example.person.leg.impl;

import example.person.productInfo;
import example.person.leg.ILeg;

public class leg_Skirt extends productInfo implements ILeg{

	public leg_Skirt(String color, String brand) {
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
		return color + "ġ��";
	}
}
