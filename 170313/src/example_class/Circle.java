package example_class;

public class Circle extends Shape{

	private int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
    public void finalize() {
        System.out.println("객체의 마지막 유언... ");
    }
    
	@Override
	public void makeArea() {
		this.area = Math.pow(this.radius, 2) * Math.PI;
	}
	
	@Override
	public String toString() {
		return "< Circle >\nradius = " + radius 
				+ "\narea = " + area + "\n";
	}
}
