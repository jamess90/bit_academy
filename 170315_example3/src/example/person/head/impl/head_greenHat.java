package example.person.head.impl;

import example.person.head.IHead;

public class head_greenHat implements IHead{
	
	@Override
	public void showInfo() {
		System.out.println("색상 : 초록");
		System.out.println("브랜드 : MLB");		
	}
	
	@Override
	public String toString() {
		return "초록색 모자";
	}
}
