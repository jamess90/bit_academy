
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
		System.out.println("������ : " + r);
		System.out.println("��   �� : " + area);
	}

	public void setR(int r) {
		this.r = r;
	}
	
	
	
}
