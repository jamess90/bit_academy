package example.person;

import example.person.arm.impl.*;
import example.person.body.impl.*;
import example.person.head.impl.*;
import example.person.leg.impl.*;

public class personMain {

	public static void main(String[] args) {

		person p1 = new person(new head_HairBand("�����", "����Ű"), new body_Y_Shirt("���", "��ũ����"), new hand_gun("��Ȳ��","�۷�"), new leg_shortPants("������","���"));
		System.out.println();
	
	}

}