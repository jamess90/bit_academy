
public class main07 {
	public static void main(String[] args) {
		// break
		// 반복문과 switch ~ case문에서 사용된다.
		// 코드의 진행을 멈추고 해당하는 중괄호 (코드 블럭)을 나간다.

		// continue
		// 반복문에서만 사용 가능하다.
		// 코드의 진행을 멈추고 조건검사를 수행한다. (for문의 경우에는 증감 수행)

		int a = 0;

		while (true) {
			a++;
			System.out.println(a);

			if (a == 5) {
				break; // a의 값이 5가 되면 반복문을 종료한다.
						// 조건검사를 다시 하지 않는다.
			}
		}

		System.out.println();

		for (int i = 0; i < 10; i++) {

			if (i % 2 == 0) {
				continue;
			}
			System.out.println(i);
		}
		//break : 반복문 또는 switch~case문의 진행을 완전히 멈춘다. (조건검사를 다시 수행하지 않는다.)
		//continue : 해당하는 반복은 중지되고 다음 반복을 위한 조건검사를 수행한다.
		//				(for문의 경우에는 증감연산 수행부터 한다.)
	}
}
