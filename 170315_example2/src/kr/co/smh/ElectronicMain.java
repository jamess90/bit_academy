package kr.co.smh;

import kr.co.smh.electronic.ElectronicMachine;
import kr.co.smh.electronic.impl.Desktop;
import kr.co.smh.electronic.impl.HomeTelephone;
import kr.co.smh.electronic.impl.Notebook;
import kr.co.smh.electronic.impl.SmartPhone;

public class ElectronicMain {

	public static void main(String[] args) {
		System.out.println("---����ũž---");
		showMachineAble(new Desktop());
		
		System.out.println("---��Ʈ��---");
		showMachineAble(new Notebook());
		
		System.out.println("---����ȭ---");
		showMachineAble(new HomeTelephone());
		
		System.out.println("---����Ʈ��---");
		showMachineAble(new SmartPhone());
		
	}
	
	public static void showMachineAble(ElectronicMachine machine){
		machine.showDoAble();
		machine.showPowerKind();
		machine.showCanDo();
		System.out.println();
	}
	
}