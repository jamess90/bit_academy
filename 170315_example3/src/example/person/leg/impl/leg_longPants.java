package example.person.leg.impl;

import example.person.productInfo;
import example.person.leg.ILeg;

public class leg_longPants extends productInfo implements ILeg{

	public leg_longPants(String color, String brand) {
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
		return color + "긴 바지";
	}
}
