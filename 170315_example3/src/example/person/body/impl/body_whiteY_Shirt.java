package example.person.body.impl;

import example.person.body.IBody;

public class body_whiteY_Shirt implements IBody{

	@Override
	public void showInfo() {
		System.out.println("색상 : 흰색");
		System.out.println("브랜드 : 파크랜드");		
	}
	
	@Override
	public String toString() {
		return "흰색 와이셔츠";
	}
}
