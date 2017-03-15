package electronicMachine.Telephone.impl;

import electronicMachine.Telephone.ITelephone;
import electronicMachine.machine.ElectronicMachine;

public class Homephone extends ElectronicMachine implements ITelephone {

	public Homephone() {
		super(false, false);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void calling() {
		// TODO Auto-generated method stub
		System.out.println("집전화로 전화하기");
	}

	@Override
	public void message() {
		// TODO Auto-generated method stub
		System.out.println("집전화로 문자하기");
	}

	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		super.printInfo();
		this.calling();
		this.message();
	}

}
