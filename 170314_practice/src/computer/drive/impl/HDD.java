package computer.drive.impl;

import computer.drive.IDrive;

public class HDD implements IDrive {

	@Override
	public void swapIn() {
		System.out.println("HDD에서 주 기억장치로 적재");
	}

	@Override
	public void swapout() {
		System.out.println("HDD에서 주 기억장치로 미적재");
	}


}
