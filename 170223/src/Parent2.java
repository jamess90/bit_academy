
public class Parent2 {
	
	// 상속을 위한 protected 키워드
	// -> 다른 패키지						사용 불가능
	// -> 다른 패키지의 자식	 		사용 가능
	// -> 같은 패키지						사용 가은
	protected int num1;
	protected int num2;
	
	public Parent2(int num1, int num2){
		this.num1 = num1;
		this.num2 = num2;
	
		System.out.println("Parent2 생성자 호출");
	}
	
	public void ShowParent2Info(){
		System.out.println("num1 : "+ this.num1);
		System.out.println("num2 : "+ this.num2);
		
	}
}
