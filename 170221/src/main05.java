
public class main05 {
	public static void main(String[] args) {
		int num = 2;
		int vertical = 4;
		int dan = 20;
		for (int k = 0; k < dan/vertical; k++) {
			for (int i = 1; i < 10; i++) {
				for (int j = num; j < num + vertical; j++) {
					if (j < dan + 1)
						System.out.print(j + " x " + i + " = " + i * j + "	");
				}
				System.out.println();
			}
			num += vertical;
			System.out.println();
		}
	}
}