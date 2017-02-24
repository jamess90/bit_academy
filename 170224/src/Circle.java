
public final class Circle extends Shape {

	private int r;

	public Circle(int r) {
		// super();
		this.r = r;
		this.name = "원";
	}

	// 오버라이딩의 조건
	// 1) 반환명, 메소드명, 매개변수가 ㅏ부모의 메소드와 완벽히 일치해야 한다.
	// 2) 접근지시 제어자는 부모의 것보다 넓거나 같아야 한다.

	@Override
	protected final void makeArea() {
		super.makeArea(); // 부모의 메소드 호출 (super.메소드명)
		// super.area = this.r * this.r * 3.14;
		super.area = Math.pow(this.r, 2) * Math.PI;
	}

	// 추상 메소드를 상속받은 클래스에서는 무조건 구현을 해야한다.
	@Override
	public final void showShapeInfo() {
		// 넓이 구하기
		this.makeArea();
		System.out.println("도   형 : " + this.name);
		System.out.println("반지름 : " + this.r);
		System.out.println("넓   이 : " + super.area);
		System.out.print("특   징 : ");

	}

	// Object 클래스에 정의된 toString() 오버라이딩
	// -> Object 클래스에서 객체를 표현하는 방식(패키지명.클래스@메모리 지소값)이 아닌ㄴ
	//    해당 클래스의 정보를 마음대로 기입할 수 있게 해준다.
	//    보통은 멤버 변수의 값을 확인하는 용도로 사용함.
	
	@Override
	public String toString() {
		
//		return super.toString();			// 부모의 toString()을 실행 후 리턴
												// 클래스@메모리 주소값
		makeArea();
		return "[반지름 : " + this.r + "]\n" + "[넓   이 : " + super.area + "]";
	}
	
	
	public void rolling(){
		System.out.println("굴러간다.");
	}
}
