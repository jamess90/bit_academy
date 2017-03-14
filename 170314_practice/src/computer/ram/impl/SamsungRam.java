package computer.ram.impl;

import computer.ram.IRam;

public class SamsungRam implements IRam{


	@Override
	public void wakeUp() {
		System.out.println("SamsungRAM으로부터 자원 할당");
	}

	@Override
	public void sleepIn() {
		System.out.println("SamsungRAM으로부터 자원 미할당");
	}

}
