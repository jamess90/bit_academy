package computer.ram.impl;

import computer.ram.IRam;

public class SamsungRam implements IRam{


	@Override
	public void wakeUp() {
		System.out.println("SamsungRAM���κ��� �ڿ� �Ҵ�");
	}

	@Override
	public void sleepIn() {
		System.out.println("SamsungRAM���κ��� �ڿ� ���Ҵ�");
	}

}
