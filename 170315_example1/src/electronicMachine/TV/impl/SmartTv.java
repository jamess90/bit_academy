package electronicMachine.TV.impl;

import electronicMachine.TV.ITv;
import electronicMachine.machine.ElectronicMachine;

public class SmartTv extends ElectronicMachine implements ITv {

	public SmartTv() {
		super(false, false);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void watchingTV() {
		System.out.println("스마트TV로 시청하기");
	}
	
	@Override
	public void printInfo() {
		super.printInfo();
		watchingTV();
	}

}
