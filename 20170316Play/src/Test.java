
public class Test {
	public int sum(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		int a = 3;
		int b = 4;

		Test test = new Test();
		int c = test.sum(a, b);

		System.out.println(c);

	}

}
