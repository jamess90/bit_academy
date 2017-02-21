
public class main05 {
	public static void main(String[] args) {
		
		int start = 2;
		int dan = 20;
		int horizon = 4;
		int vertical = dan/horizon;
		
		
		for (int k = 0; k < vertical; k++) {
			for (int i = 1; i < 10; i++) {
				for (int j = start; j < start + horizon; j++) {
					if (j < dan + 1)
						System.out.print(j + " x " + i + " = " + i * j + "	");
				}
				System.out.println();
			}
			start += horizon;
			System.out.println();
		}
	}
}