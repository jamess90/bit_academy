package exception.gradecalculator;

import java.util.Scanner;

public class GradeCalculatorMain {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int score = 0;

		int grade;

		System.out.println("성적계산기");
		System.out.println("점수를 입력하세요.");
		score = scan.nextInt();

		if (score >= 90 && score <= 100) {
			System.out.println("A");
		} else if (score >= 80 && score <= 89) {
			System.out.println("B");
		} else if (score >= 70 && score <= 79) {
			System.out.println("C");
		} else if (score >= 60 && score <= 69) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}

		try {
			ExceptionCondition exceptionCondition = new ExceptionCondition(score);

		} catch (ScoreException e1) {

			e1.printStackTrace();
		}

	}

}
