package example.person.head.impl;

import example.person.head.IHead;

public class head_yellowHairBand implements IHead{
	
	@Override
	public void showInfo() {
		System.out.println("색상 : 노랑");
		System.out.println("브랜드 : 나이키");
		
	}
	
	@Override
	public String toString() {
		return "노란 머리띠";
	}
}
