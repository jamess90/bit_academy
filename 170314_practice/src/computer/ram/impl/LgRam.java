package computer.ram.impl;

import computer.ram.IRam;

public class LgRam implements IRam{


	@Override
	public void wakeUp() {
		System.out.println("LGRAM으로부터 자원 할당");		
	}

	@Override
	public void sleepIn() {
		System.out.println("LGRam으로부터 자원 미할당");
	}

}
