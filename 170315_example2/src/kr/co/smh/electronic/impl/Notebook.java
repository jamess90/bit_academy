package kr.co.smh.electronic.impl;

import kr.co.smh.electronic.ElectronicMachine;
import kr.co.smh.electronic.ICamera;
import kr.co.smh.electronic.IComputer;
import kr.co.smh.electronic.able.IAble;
import kr.co.smh.electronic.able.impl.PortableImpl;

public class Notebook extends ElectronicMachine implements IComputer, ICamera{

	public Notebook() {
		super(ElectronicMachine.POWER_BATTERY, new PortableImpl());
	}

	@Override
	public void doInternet() {
		System.out.println("노트북으로 인터넷 하기");
	}

	@Override
	public void doSendMail() {
		System.out.println("노트북으로 메일 보내기");
	}

	@Override
	public void showCanDo() {
		doInternet();
		doSendMail();
	}

	@Override
	public void takePicture() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showPicture() {
		// TODO Auto-generated method stub
		
	}

}