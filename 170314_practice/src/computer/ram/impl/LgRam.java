package computer.ram.impl;

import computer.ram.IRam;

public class LgRam implements IRam{


	@Override
	public void wakeUp() {
		System.out.println("LGRAM���κ��� �ڿ� �Ҵ�");		
	}

	@Override
	public void sleepIn() {
		System.out.println("LGRam���κ��� �ڿ� ���Ҵ�");
	}

}
