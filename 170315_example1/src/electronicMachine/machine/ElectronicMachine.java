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
			System.out.println("���͸��� ����մϴ�.");
		else
			System.out.println("�ܼ�Ʈ ������ ����մϴ�.");
	}

	public void portability(Boolean b_portability) {
		if (b_portability)
			System.out.println("�޴��� �� �ֽ��ϴ�.");
		else
			System.out.println("�޴��� �� �����ϴ�.");
	}

	public void printInfo() {
		useelectricity(b_usebattery);
		portability(b_portability);
	}
}
