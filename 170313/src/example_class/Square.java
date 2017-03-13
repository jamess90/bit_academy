package example_class;

public class Square extends Shape {

	private int width;
	private int height;
	
	public Square(int width, int height) {
		this.width = width;
		this.height = height;
	}
	@Override
	public void makeArea() {
		this.area = this.width * this.height;
	}

	@Override
	public String toString() {
		return "< Square >\nwidth = " + width 
				+ "\nheight = " + height 
				+ "\narea = " + area + "\n";
	}
	
}
