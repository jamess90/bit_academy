package electronicMachine.Computer.impl;

import electronicMachine.Computer.IComputer;
import electronicMachine.machine.ElectronicMachine;

public class Desktop extends ElectronicMachine implements IComputer {

	public Desktop() {
		super(false, false);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doInternet() {
		System.out.println("����ũž���� ���ͳ� �ϱ�");
	}

	@Override
	public void mailing() {
		System.out.println("����ũž���� ���� ������");
	}
	
	
	@Override
	public void printInfo() {
		super.printInfo();
		doInternet();
		mailing();
	}
}
