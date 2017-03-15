package electronicMachine.TV.impl;

import electronicMachine.TV.ITv;
import electronicMachine.machine.ElectronicMachine;

public class NormalTv extends ElectronicMachine implements ITv{

	public NormalTv() {
		super(false,false);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void watchingTV() {
		System.out.println("�Ϲ�TV�� ��û�ϱ�");		
	}
	
	@Override
	public void printInfo() {
		super.printInfo();
		watchingTV();
	}

	
}
