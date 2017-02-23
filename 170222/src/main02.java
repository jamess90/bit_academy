
public class main02 {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.setNum1(10);	//사용자가 첫 번째 숫자 입력
		calc.setNum2(20);	//사용자가 두 번째 숫자 입력
		
		//특수 알고리즘 실행
		//calc.specialAlgorithm();
		calc.runAdd();
		
		int addResult = calc.getResult();
		System.out.println("덧셈 결과 : " + addResult);
		
		
	}
	
}
