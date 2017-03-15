package example.person;

import example.person.arm.impl.*;
import example.person.body.impl.*;
import example.person.head.impl.*;
import example.person.leg.impl.*;

public class personMain {

	public static void main(String[] args) {

		person p1 = new person(new head_yellowHairBand(), new body_whiteY_Shirt(), new hand_gun(), new leg_shortPants());
		System.out.println();
		person p2 = new person(new head_greenHat(), new body_grayT_Shirt(), new hand_sword(), new leg_redSkirt());

	}

}