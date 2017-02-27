
public class FingerprintDoor2 implements IDoor {

	@Override
	public void openDoor() {
		System.out.println("지문 인식으로 문을 연다.");
	}

	@Override
	public void closeDoor() {
		System.out.println("지운 인식으로 문을 닫는다.");
	}

}
