
public class circle {

	private int radius;
	private double area;	
	private static int cir_count = 0;
	
	public circle(int radius) {
		this.radius = radius;
		System.out.println("���� " + ++cir_count + "�� ��������ϴ�.\n");
		makearea();
	}
	private double makearea(){
		area = radius * radius * Math.PI;
		return area;
	}
	public void printInfo(){
		System.out.println("<information>");
		System.out.println("������ : " + radius);
		System.out.println("��   �� : " + area);
		System.out.println();
	}
}
