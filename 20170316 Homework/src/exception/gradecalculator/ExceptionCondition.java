package exception.gradecalculator;

public class ExceptionCondition {

	public ExceptionCondition(int score) throws ScoreException {

		if (score < 0 || score > 100) {

			throw new ScoreException();
		} else {
			System.out.println("�Է��Ͻ� ������ : " + score + " �� �Դϴ�.");
		}

	}

}
