
public class House {

	// 문
	// 슬라이딩 도어
	// 1단계 관계
	// House 클래스가 SlidingDoor 클래스를 가지고 있다. ('House' Has - a 'SldingDoor')
	private SlidingDoor slide;
	private HingedDoor hinged;

	public House() {
		slide = new SlidingDoor();
		hinged = new HingedDoor();
	}

	public void in() {
		slide.openDoor();
		System.out.println("집에 들어옴");
	}


	public void out() {
		slide.closeDoor();
		System.out.println("집에서 나감");
	}
	public void in2() {
		hinged.openDoor();
		System.out.println("집에 들어옴");
	}

	public void out2() {
		hinged.closeDoor();
		System.out.println("집에서 나감");
	}

}
