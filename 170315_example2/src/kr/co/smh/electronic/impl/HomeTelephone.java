package kr.co.smh.electronic.impl;

import kr.co.smh.electronic.ElectronicMachine;
import kr.co.smh.electronic.ITelephone;
import kr.co.smh.electronic.able.IAble;
import kr.co.smh.electronic.able.impl.OnlyHomeImpl;

public class HomeTelephone extends ElectronicMachine implements ITelephone{

	public HomeTelephone() {
		super(ElectronicMachine.POWER_CON, new OnlyHomeImpl());
	}

	@Override
	public void doCall() {
		System.out.println("집전화로 전화하기");
	}

	@Override
	public void doMessage() {
		System.out.println("집전화로 문자보내기");
	}

	@Override
	public void showCanDo() {
		doCall();
		doMessage();
	}

}