
public class RevolvingDoor2 implements IDoor {

	@Override
	public void openDoor() {
		System.out.println("회전문을 돌려서 들어간다.");
	}

	@Override
	public void closeDoor() {
		System.out.println("회전문을 돌려서 나간다.");
	}

}
