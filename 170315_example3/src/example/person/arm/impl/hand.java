package example.person.arm.impl;

import example.person.productInfo;
import example.person.arm.IHand;

public class hand extends productInfo implements IHand{
	
	public hand(String color, String brand) {
		this.color = color;
		this.brand = brand;
	}
	
	@Override
	public void showInfo() {
		System.out.println("색상 : " + this.color);
		System.out.println("브랜드 : " + this.brand);
	}
	
	@Override
	public String toString() {
		return color + "손";
	}
}
