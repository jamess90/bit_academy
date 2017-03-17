package exception.gradecalculator;

public class ScoreException extends Exception {

	@Override
	public String getMessage() {
		return "입력하신 점수를 확인해주세요.";
	}

}
