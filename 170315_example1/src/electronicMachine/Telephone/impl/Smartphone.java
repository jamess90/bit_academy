package electronicMachine.Telephone.impl;

import electronicMachine.Computer.IComputer;
import electronicMachine.TV.ITv;
import electronicMachine.Telephone.ITelephone;
import electronicMachine.machine.ElectronicMachine;

public class Smartphone extends ElectronicMachine implements ITelephone, IComputer, ITv {

	public Smartphone() {
		super(true, true);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void calling() {
		// TODO Auto-generated method stub
		System.out.println("스마트폰으로 전화하기");

	}

	@Override
	public void message() {
		// TODO Auto-generated method stub
		System.out.println("스마트폰으로 문자하기");
	}

	@Override
	public void doInternet() {
		System.out.println("스마트폰으로 인터넷 하기");

	}

	@Override
	public void mailing() {
		System.out.println("스마트폰으로 메일 보내기");
	}

	@Override
	public void watchingTV() {
		System.out.println("스마트폰으로 TV시청하기");
	}

	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		super.printInfo();
		message();
		doInternet();
		mailing();
		calling();
		watchingTV();

	}

}
