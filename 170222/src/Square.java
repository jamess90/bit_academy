
public class Square {

	private int width; //����
	private int height; //����
	private int area;	//����
	
	private void makeArea(){
		area = width*height;
	}
	
	public void showInfo(){
		makeArea();
		System.out.println("���� : " + width);
		System.out.println("���� : " + height);
		System.out.println("���� : " + area);
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	
}
