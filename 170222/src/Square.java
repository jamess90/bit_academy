
public class Square {

	private int width; //가로
	private int height; //세로
	private int area;	//넓이
	
	private void makeArea(){
		area = width*height;
	}
	
	public void showInfo(){
		makeArea();
		System.out.println("가로 : " + width);
		System.out.println("세로 : " + height);
		System.out.println("넓이 : " + area);
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	
}
