
public class rectangle {

	private int width;
	private int height;
	private int area;	
	private static int rec_count = 0;
	
	public rectangle(int width, int height) {
		this.width = width;
		this.height = height;
		System.out.println("사각형을 " + ++rec_count + "개 만들었습니다.\n");
		makearea();
	}
	private int makearea(){
		area = width * height;
		return area;
	}
	public void printInfo(){
		System.out.println("<information>");
		System.out.println("가   로 : " + width);
		System.out.println("세   로 : " + height);
		System.out.println("넓   이 : " + area);
		System.out.println();
	}
}
