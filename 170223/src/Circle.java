
public class Circle {
	private int r;
	private double area;
	
	
	public Circle(int r){
		this.r = r;
	}
	
	
	private void makeArea(){
		area = r * r * 3.14;
	}
	
	public void showInfo(){
		makeArea();
		System.out.println("반지름 : " + r);
		System.out.println("넓   이 : " + area);
	}

	public void setR(int r) {
		this.r = r;
	}
	
	
	
}
