package computer.drive.impl;

import computer.drive.IDrive;

public class HDD implements IDrive {

	@Override
	public void swapIn() {
		System.out.println("HDD���� �� �����ġ�� ����");
	}

	@Override
	public void swapout() {
		System.out.println("HDD���� �� �����ġ�� ������");
	}


}
