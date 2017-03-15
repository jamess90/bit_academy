package example.person;

import example.person.arm.impl.*;
import example.person.body.impl.*;
import example.person.head.impl.*;
import example.person.leg.impl.*;

public class personMain {

	public static void main(String[] args) {

		person p1 = new person(new head_HairBand("노랑색", "나이키"), new body_Y_Shirt("흰색", "파크랜드"), new hand_gun("주황색","글록"), new leg_shortPants("빨강색","뱅뱅"));
		System.out.println();
	
	}

}