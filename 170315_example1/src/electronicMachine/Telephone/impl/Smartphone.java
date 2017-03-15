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
		System.out.println("����Ʈ������ ��ȭ�ϱ�");

	}

	@Override
	public void message() {
		// TODO Auto-generated method stub
		System.out.println("����Ʈ������ �����ϱ�");
	}

	@Override
	public void doInternet() {
		System.out.println("����Ʈ������ ���ͳ� �ϱ�");

	}

	@Override
	public void mailing() {
		System.out.println("����Ʈ������ ���� ������");
	}

	@Override
	public void watchingTV() {
		System.out.println("����Ʈ������ TV��û�ϱ�");
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
