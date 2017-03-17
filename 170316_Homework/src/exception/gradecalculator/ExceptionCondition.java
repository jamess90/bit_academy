package exception.gradecalculator;

public class ExceptionCondition {

	public ExceptionCondition(int score) throws ScoreException {

		if (score < 0 || score > 100) {

			throw new ScoreException();
		} else {
			System.out.println("입력하신 점수는 : " + score + " 점 입니다.");
		}

	}

}
