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
		System.out.println("����ȭ�� ��ȭ�ϱ�");
	}

	@Override
	public void message() {
		// TODO Auto-generated method stub
		System.out.println("����ȭ�� �����ϱ�");
	}

	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		super.printInfo();
		this.calling();
		this.message();
	}

}
