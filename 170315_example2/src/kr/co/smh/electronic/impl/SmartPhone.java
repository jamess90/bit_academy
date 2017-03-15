package kr.co.smh.electronic.impl;

import kr.co.smh.electronic.ElectronicMachine;
import kr.co.smh.electronic.ICamera;
import kr.co.smh.electronic.IComputer;
import kr.co.smh.electronic.ITelephone;
import kr.co.smh.electronic.able.IAble;
import kr.co.smh.electronic.able.impl.PortableImpl;

public class SmartPhone extends ElectronicMachine implements IComputer, ITelephone, ICamera {

	public SmartPhone() {
		super(ElectronicMachine.POWER_BATTERY, new PortableImpl());
	}

	@Override
	public void doCall() {
		System.out.println("스마트폰으로 전화하기");
	}

	@Override
	public void doMessage() {
		System.out.println("스마트폰으로 문자 보내기");
	}

	@Override
	public void doInternet() {
		System.out.println("스마트폰으로 인터넷 하기");
	}

	@Override
	public void doSendMail() {
		System.out.println("스마트폰으로 메일 보내기");
	}

	@Override
	public void showCanDo() {
		doInternet();
		doSendMail();
		doCall();
		doMessage();
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
