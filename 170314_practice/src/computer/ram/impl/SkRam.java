package computer.ram.impl;

import computer.ram.IRam;

public class SkRam implements IRam{

	@Override
	public void wakeUp() {
		System.out.println("SkRam���κ��� �ڿ� �Ҵ�");
	}

	@Override
	public void sleepIn() {
		System.out.println("SkRam���κ��� �ڿ� ���Ҵ�");
	}
	
}
