package electronicMachine.machine;

public class ElectronicMachine {

	private Boolean b_usebattery;
	private Boolean b_portability;

	public ElectronicMachine(Boolean b_usebattery, Boolean b_portability) {
		this.b_portability = b_portability;
		this.b_usebattery = b_usebattery;
	}

	public void useelectricity(Boolean b_usebattery) {
		if (b_usebattery)
			System.out.println("배터리를 사용합니다.");
		else
			System.out.println("콘센트 전력을 사용합니다.");
	}

	public void portability(Boolean b_portability) {
		if (b_portability)
			System.out.println("휴대할 수 있습니다.");
		else
			System.out.println("휴대할 수 없습니다.");
	}

	public void printInfo() {
		useelectricity(b_usebattery);
		portability(b_portability);
	}
}
