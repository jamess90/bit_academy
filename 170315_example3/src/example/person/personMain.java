package example.person;

import example.person.arm.impl.*;
import example.person.body.impl.*;
import example.person.head.impl.*;
import example.person.leg.impl.*;

public class personMain {

	public static void main(String[] args) {

		person p1 = new person(new head_HairBand("�����", "����Ű"), 
											new body_Y_Shirt("���", "��ũ����"), 
												new hand_gun("��Ȳ��","�۷�"), 
													new leg_shortPants("������","���"));
		System.out.println();

		person p2 = new person(new head_Hat("�Ķ���", "���̼�"), 
				new body_T_Shirt("���", "����"), 
				new hand("���","����ǥ"), 
				new leg_Skirt("������","���ϻ�"));
		System.out.println();
	}

}