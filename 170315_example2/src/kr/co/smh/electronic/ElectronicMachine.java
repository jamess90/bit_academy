package kr.co.smh.electronic;

import kr.co.smh.electronic.able.IAble;

public abstract class ElectronicMachine {

	private String power_kind = "";
	private IAble able;
	
	public static final String POWER_BATTERY = "배터리";
	public static final String POWER_CON = "콘센트 연결";
	
	public ElectronicMachine(String power_kind, IAble able){
		this.power_kind = power_kind;
		this.able = able;
	}

	public void showPowerKind(){
		System.out.println("전력 종류 : " + this.power_kind);
	}
	
	public void showDoAble(){
		able.doSomething();
	}
	
	public abstract void showCanDo();
	
}
