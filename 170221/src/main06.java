
public class main06 {
	public static void main(String[] args) {
		int a = 10;
		int b = 10;

		System.out.println("----------while문 실행-----------");
		while (a != b) {
			System.out.println("while~~");
		}

		System.out.println("---------do~while문 실행---------");
		
		do {
			System.out.println("do ~ while");
		} while (a != b);

		// while문 활용
		System.out.println("----------while문 활용-----------");
		while (a < 20) {
			System.out.println("while문 입니다.");
			a++;
		}
	}
}
