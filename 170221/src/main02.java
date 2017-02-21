
public class main02 {
	public static void main(String[] args) {
		// while문은 한번도 실행이 안 될 수도 있다.
		// do~while문은 무조건 한번은 실행된다.

		int a = 10;
		int b = 10;

		if (a > b) {
			System.out.println("a는 b보다 크다.");
		} else {
			System.out.println("a는 b보다 작거나 같다.");
		}

		if (a == b) {
			System.out.println("a는 b와 같다.");
		} else {
			System.out.println("a는 b와 다르다.");
		}

		if (a == b) 
		{
			System.out.println("a는 b와 같다.");
		} else if (a > b) {
			System.out.println("a는 b보다 크다.");
		} else {
			System.out.println("a는 b보다 작다.");
		}

	}
}
