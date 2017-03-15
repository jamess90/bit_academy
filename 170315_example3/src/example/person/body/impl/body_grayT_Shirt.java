package example.person.body.impl;

import example.person.body.IBody;

public class body_grayT_Shirt implements IBody {

	@Override
	public void showInfo() {
		System.out.println("색상 : 회색");
		System.out.println("브랜드 : 스파오");		
	}
	
	@Override
	public String toString() {
		return "회색 티셔츠";
	}
}
