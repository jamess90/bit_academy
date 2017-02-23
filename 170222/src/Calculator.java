
public class Calculator {

	private int num1;
	private int num2;
	private int result;
		
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public int getResult() {
		return result;
	}
	
	//사용자가 알 필요는 없지만 반드시 실행 해야 할 메소드
	private void specialAlgorithm(){
		System.out.println("특수 알고리즘 실행~~~~");
	}
	
	public void runAdd(){
		specialAlgorithm();
		result = num1+num2;
	}

	
	
}
