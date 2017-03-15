package electronicMachine.Computer.impl;

import electronicMachine.Computer.IComputer;
import electronicMachine.machine.ElectronicMachine;

public class Laptop extends ElectronicMachine implements IComputer {

	public Laptop() {
		super(true, true);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doInternet() {
		System.out.println("노트북으로 인터넷 하기");

	}

	@Override
	public void mailing() {
		System.out.println("노트북으로 인터넷 하기");

	}

	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		super.printInfo();
		doInternet();
		mailing();
	}

}
