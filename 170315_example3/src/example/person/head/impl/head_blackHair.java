package example.person.head.impl;

import example.person.body.IBody;
import example.person.head.IHead;

public class head_blackHair implements IHead {

	@Override
	public void showInfo() {
		System.out.println("브랜드 : 준오헤어");
	}
	
	@Override
	public String toString() {
		return "검은 머리";
	}
}
