package example.person.body.impl;

import example.person.body.IBody;

public class body_onePiece implements IBody{

	@Override
	public void showInfo() {
		System.out.println("색상 : 꽃무늬");
		System.out.println("브랜드 : 강남지하상가");		
	}
	
	@Override
	public String toString() {
		return "원피스";
	}
	
}
