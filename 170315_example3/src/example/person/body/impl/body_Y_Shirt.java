package example.person.body.impl;

import example.person.productInfo;
import example.person.body.IBody;

public class body_Y_Shirt extends productInfo implements IBody{

	public body_Y_Shirt(String color, String brand) {
		this.color = color;
		this.brand = brand;
	}
	
	@Override
	public void showInfo() {
		System.out.println("»ö»ó : " + this.color);
		System.out.println("ºê·£µå : " + this.brand);
	}
	
	@Override
	public String toString() {
		return color + "¿ÍÀÌ¼ÅÃ÷";
	}
}
