
public class main06 {
	public static void main(String[] args) {
		int a = 10;
		int b = 10;

		System.out.println("----------while�� ����-----------");
		while (a != b) {
			System.out.println("while~~");
		}

		System.out.println("---------do~while�� ����---------");
		
		do {
			System.out.println("do ~ while");
		} while (a != b);

		// while�� Ȱ��
		System.out.println("----------while�� Ȱ��-----------");
		while (a < 20) {
			System.out.println("while�� �Դϴ�.");
			a++;
		}
	}
}
