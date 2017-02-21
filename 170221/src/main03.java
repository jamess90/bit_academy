import java.util.Scanner;

public class main03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int score = input.nextInt();
		char grade;

		if (score < 0 || score > 100) {
			System.out.println("점수 에러");
			
		} else {
			if (score >= 90 && score <= 100) {
				grade = 'A';
			} else if (score >= 80 && score < 90) {
				grade = 'B';
			} else if (score >= 70 && score < 80) {
				grade = 'C';
			} else {
				grade = 'F';
			}
			System.out.println(grade);
		}
		input = null;
	}
}
