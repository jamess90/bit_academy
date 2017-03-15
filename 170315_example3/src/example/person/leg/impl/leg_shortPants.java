package example.person.leg.impl;

import example.person.leg.ILeg;

public class leg_shortPants implements ILeg{
	
	@Override
	public void showInfo() {
		System.out.println("»ö»ó : Èò»ö");
		System.out.println("ºê·£µå : ¾ÆÆ®¹Ú½º");
	}
	
	@Override
	public String toString() {
		return "ÇÖÆÒÃ÷";
	}
}
