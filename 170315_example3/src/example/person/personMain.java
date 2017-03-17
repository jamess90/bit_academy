package example.person;

import example.person.arm.impl.*;
import example.person.body.impl.*;
import example.person.head.impl.*;
import example.person.leg.impl.*;

public class personMain {

	public static void main(String[] args) {

		person p1 = new person(new head_HairBand("노랑색", "나이키"), 
											new body_Y_Shirt("흰색", "파크랜드"), 
												new hand_gun("주황색","글록"), 
													new leg_shortPants("빨강색","뱅뱅"));
		System.out.println();

		person p2 = new person(new head_Hat("파란색", "다이소"), 
				new body_T_Shirt("흰색", "수제"), 
				new hand("살색","엄마표"), 
				new leg_Skirt("빨강색","지하상가"));
		System.out.println();
	}

}