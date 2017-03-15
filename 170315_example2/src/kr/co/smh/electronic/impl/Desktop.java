package kr.co.smh.electronic.impl;

import kr.co.smh.electronic.ElectronicMachine;
import kr.co.smh.electronic.IComputer;
import kr.co.smh.electronic.able.IInput;
import kr.co.smh.electronic.able.IOutput;
import kr.co.smh.electronic.able.impl.OnlyHomeImpl;

public class Desktop extends ElectronicMachine implements IComputer, IInput, IOutput{

	public Desktop() {
		super(ElectronicMachine.POWER_CON, new OnlyHomeImpl());
	}

	@Override
	public void doInternet() {
		System.out.println("����ũž���� ���ͳ� �ϱ�");
	}

	@Override
	public void doSendMail() {
		System.out.println("����ũž���� ���� ������");
	}

	@Override
	public void showCanDo() {
		doInternet();
		doSendMail();
	}

	@Override
	public void doSomething() {
		// TODO Auto-generated method stub
		
	}


}
