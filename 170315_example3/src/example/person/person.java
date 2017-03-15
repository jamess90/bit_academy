package example.person;

import example.person.arm.IHand;
import example.person.arm.impl.hand_gun;
import example.person.body.IBody;
import example.person.body.impl.body_onePiece;
import example.person.head.IHead;
import example.person.head.impl.head_blackHair;
import example.person.leg.ILeg;
import example.person.leg.impl.leg_shortPants;

public class person {

	protected Object head;
	protected Object body;
	protected Object hand;
	protected Object leg;
	
	public person(IHead head, IBody body, IHand hand, ILeg leg) {
		
		this.head = head;
		this.hand = hand;
		this.body = body;
		this.leg = leg;
		System.out.println(this.toString());
		showInfo(head, body, hand, leg);
	}
	
	@Override
	public String toString() {
		return "���� ���� ����� [�Ӹ�=" + head +", ����=" + body + ", ��=" + hand +  ", �ٸ�=" + leg + "]�� �������Դϴ�.";
	}
	
	private void showInfo(IHead head, IBody body, IHand hand, ILeg leg) {
		System.out.println("<�Ӹ�>");
		head.showInfo();
		System.out.println("<����>");
		body.showInfo();
		System.out.println("<��>");
		hand.showInfo();
		System.out.println("<�ٸ�>");
		leg.showInfo();
	}
}
