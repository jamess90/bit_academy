
public class rectangle {

	private int width;
	private int height;
	private int area;	
	private static int rec_count = 0;
	
	public rectangle(int width, int height) {
		this.width = width;
		this.height = height;
		System.out.println("�簢���� " + ++rec_count + "�� ��������ϴ�.\n");
		makearea();
	}
	private int makearea(){
		area = width * height;
		return area;
	}
	public void printInfo(){
		System.out.println("<information>");
		System.out.println("��   �� : " + width);
		System.out.println("��   �� : " + height);
		System.out.println("��   �� : " + area);
		System.out.println();
	}
}
