package computer.drive.impl;

import computer.drive.IDrive;

public class SSD implements IDrive{

	@Override
	public void swapIn() {
		System.out.println("SSD���� �� �����ġ�� ����");
	}

	@Override
	public void swapout() {
		System.out.println("SSD���� �� �����ġ�� ������");
	}

}
