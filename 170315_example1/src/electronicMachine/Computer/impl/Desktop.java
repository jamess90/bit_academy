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
		System.out.println("데스크탑으로 인터넷 하기");
	}

	@Override
	public void mailing() {
		System.out.println("데스크탑으로 메일 보내기");
	}
	
	
	@Override
	public void printInfo() {
		super.printInfo();
		doInternet();
		mailing();
	}
}
