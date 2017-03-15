package example.person.head.impl;

import example.person.productInfo;
import example.person.head.IHead;

public class head_Hat extends productInfo implements IHead{
	
	public head_Hat(String color, String brand) {
		this.color = color;
		this.brand = brand;
	}
	
	@Override
	public void showInfo() {
		System.out.println("색상 : " + this.color );
		System.out.println("브랜드 : " + this.brand );
	}
	
	@Override
	public String toString() {
		return color + "모자";
	}
}
