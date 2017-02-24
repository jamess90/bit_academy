
public final  class Triangle extends Shape {
	private double width;
	private double height;

	public Triangle(double width, double height) {
		this.width = width;
		this.height = height;
		this.name = "삼각형";
	}

	// 오버라이딩의 조건
	// 1) 반환명, 메소드명, 매개변수가 부모의 메소드와 완벽히 일치해야 한다.
	// 2) 접근지시 제어자는 부모의 것보다 넓거나 같아야 한다.

	@Override
	protected final void makeArea() {
		super.makeArea(); // 부모의 메소드 호출 (super.메소드명)
		super.area = this.width * this.height * 0.5;
	}

	@Override
	public final void showShapeInfo() {
		// 넓이 구하기
		this.makeArea();
		System.out.println("도   형 : " + this.name);
		System.out.println("밑   변 : " + this.width);
		System.out.println("높   이 : " + this.height);
		System.out.println("넓   이 : " + super.area);
		System.out.print("특   징 : ");
	}
	
	public void pointed(){
		System.out.println("뾰족하다.");
	}
	
}
