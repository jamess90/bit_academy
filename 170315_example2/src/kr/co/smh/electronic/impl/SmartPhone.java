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
		System.out.println("����Ʈ������ ��ȭ�ϱ�");
	}

	@Override
	public void doMessage() {
		System.out.println("����Ʈ������ ���� ������");
	}

	@Override
	public void doInternet() {
		System.out.println("����Ʈ������ ���ͳ� �ϱ�");
	}

	@Override
	public void doSendMail() {
		System.out.println("����Ʈ������ ���� ������");
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
