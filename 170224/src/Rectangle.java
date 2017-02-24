
public class Rectangle extends Shape {
	private double width;
	private double height;
	private String name;
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
		this.name = "직사각형";
	}

	// 오버라이딩의 조건
	// 1) 반환명, 메소드명, 매개변수가 부모의 메소드와 완벽히 일치해야 한다.
	// 2) 접근지시 제어자는 부모의 것보다 넓거나 같아야 한다.

	@Override
	protected final void makeArea() {
		super.makeArea(); // 부모의 메소드 호출 (super.메소드명)
		super.area = this.width * this.height;
	}

	@Override
	public final void showShapeInfo() {
		// 넓이 구하기
		this.makeArea();
		System.out.println("도   형 : " + this.name);
		System.out.println("가   로 : " + this.width);
		System.out.println("세   로 : " + this.height);
		System.out.println("넓   이 : " + super.area);
		System.out.print("특   징 : ");
	}
	
	public void stack(){
		System.out.println("쌓을 수 있다.");
	}
}
