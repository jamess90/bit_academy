
//클래스 AAA는 어디에서든 사용 할 수 있다.
public class AAA {

	//접근 지시 제어자
	//private : 클래스 내부에서만 사용 가능
	//public  : 클래스 외부, 내부에서 모두 사용 가능	
	
	//1)정보은닉 : 모든 클래스의 멤버변수는 항상 private으로 만든다.
	//          getter/setter를 이용하여 외부에서의 접근을 조절한다.
	
	//num1은 private 형태이기 때문에 내부에서만 사용 가능한 멤버 변수
	private int num1 = 0;
	//str1은 public 형태이기 때문에 외부, 내부에서 전부 사용 가능한 멤버 변수
	public String str1 = "AAA_STR1";
	
	//showInfo() 메소드는 내부와 외부에서 모두 사용 가능한 메소드
	public void showInfo(){
		System.out.println("num1 : " + this.num1);
		System.out.println("str1 : " + this.str1);
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	//this 키워드
	//자기 자신을 참조
	//보통 클래스 내부의 멤버 변수를 사용 할 때 써 준다.
	public void setDatas(int num1, String str1){
//		this.num1 = num1;
//		this.str1 = str1;
		this.num1 = num1;
		this.str1 = str1;
		
	}
	
	//변수의 지역성
	//같은 코드블럭(중괄호{}) 안에서는 동일한 이름의 변수를 만들수 없고.
	
	// 지역변수, 매개변수는 변수는 중괄호를 벗어나면 사라진다.
	// 멤버변수는 객체가 사라질 때 사라진다.
	public void foo()
	{
		int a;	//만들어지는 시점? foo() 메소드가 호출 되었을 때 만들어 진다.
				//사라지는 시점? foo() 메소드가 종료 되엇을 때 사라진다.
				//지역 변수 foo()메소드 지역에서만 사용 할 수 있기 때문에...
		
		{
			//int a;	//error 위에 이미 int a가 선언 되었기 때문에.... 중복된 변수이다.
			a = 10;		//ok    위에 선언된 int a를 사용 할 수 있다.
			
			int b = 20;
		}
		
		//System.out.println(b);
	}
	
	//매개변수도 지역변수와 동급으로 처리 된다.
	public void goo(int g){
		//int g = 10;	//error 매개변수와 같은 이름으로 지역 변수를 만들 수 없다.
	}

	
	
	//getter / setter
	// getter : 멤버변수를 외부에 가져다주는 메소드
	// setter : 멤버변수를 외부에서 대입하게 해주는 메소드
	// 필요한 이유 : 모든 멤버변수는 private 형태로 내부에서만 접근이 가능하게 되어 있기 때문에
	// 상황에 따라 외부에 데이터를 공개하거나 외부에서 데이터를 대입 해 주기 위해 만들어 놓는다.
	// 결과적으로 외부에서의 멤버변수(정보)에 대한 접근을 안전하게 처리 할 수 있다.
	
	// 무조건 getter / setter는 public 형태로 만든다.
	
	//getter

	
	//setter
	
	
	
	
	
	
	
	
	
	
	
}
