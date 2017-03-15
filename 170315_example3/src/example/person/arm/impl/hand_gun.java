package example.person.arm.impl;

import example.person.productInfo;
import example.person.arm.IHand;

public class hand_gun extends productInfo implements IHand{
	
	public hand_gun(String color, String brand) {
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
		return color + "��";
	}
}
