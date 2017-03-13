
public class circle {

	private int radius;
	private double area;	
	private static int cir_count = 0;
	
	public circle(int radius) {
		this.radius = radius;
		System.out.println("원을 " + ++cir_count + "개 만들었습니다.\n");
		makearea();
	}
	private double makearea(){
		area = radius * radius * Math.PI;
		return area;
	}
	public void printInfo(){
		System.out.println("<information>");
		System.out.println("반지름 : " + radius);
		System.out.println("넓   이 : " + area);
		System.out.println();
	}
}
