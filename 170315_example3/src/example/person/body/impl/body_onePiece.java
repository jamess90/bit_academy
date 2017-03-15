package example.person.body.impl;

import example.person.productInfo;
import example.person.body.IBody;

public class body_onePiece extends productInfo implements IBody{

	public body_onePiece(String color, String brand) {
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
		return color + "원피스";
	}
	
}
