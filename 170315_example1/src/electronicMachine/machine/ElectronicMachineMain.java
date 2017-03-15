package electronicMachine.machine;

import electronicMachine.Computer.impl.Desktop;
import electronicMachine.Computer.impl.Laptop;
import electronicMachine.TV.impl.NormalTv;
import electronicMachine.TV.impl.SmartTv;
import electronicMachine.Telephone.impl.Homephone;
import electronicMachine.Telephone.impl.Smartphone;

public class ElectronicMachineMain {
	public static void main(String[] args) {

		
		
		System.out.println("\n============����Ʈ��=============");
		ElectronicMachinePrint print1 = new ElectronicMachinePrint(new Smartphone());
		System.out.println("\n============����ȭ��=============");
		ElectronicMachinePrint print2 = new ElectronicMachinePrint(new Homephone());
		System.out.println("\n============����ũž=============");		
		ElectronicMachinePrint print3 = new ElectronicMachinePrint(new Desktop());
		System.out.println("\n============��ž=============");		
		ElectronicMachinePrint print4 = new ElectronicMachinePrint(new Laptop());
		System.out.println("\n============����ƮTV=============");		
		ElectronicMachinePrint print5 = new ElectronicMachinePrint(new SmartTv());
		System.out.println("\n============�Ϲ�TV=============");		
		ElectronicMachinePrint print6 = new ElectronicMachinePrint(new NormalTv());

		
	}
}
