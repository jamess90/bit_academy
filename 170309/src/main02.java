
public class main02 {

	public static void main(String[] args) {
		
// 생성자
// -> 클래스를 이용해 객체를 만들 때 벌어지는 일들을 적어 놓은것.
// 생성자는 객체 하나당 한번만 호출이 된다. 두번이상 호출이 된다는 이야기는 
// 새로운 객체를 계속 만든다는 끗
// new 키워드와 함께 사용 된다.
// 항상 public 키워드가 와야 하며, 리턴형태가 없고 클래스의 이름을 사용한다.
// *생성자명 == 클래스명
// 매개변수를 지정 할 수 있다.
// 오버로딩이 가능하다.

		
// 개발자가 직접 생성자를 작성하게 되면, 컴파일러는 디폴트 생성자를 만들지 않는다.
// *디폴트 생성자 : 아무 일도 하지 않는 기본적인 생성자. 오로지 객체를 만드는 일만 한다.

//		AAA aaa1 = new AAA(); 	// AAA() -> 생성자
		AAA aaa2 = new AAA(3);
//		AAA aaa3 = new AAA(324.0004);
		
		
	}
}

class AAA{
	
	// 개발자가 직접 생성자를 만들지 않으면
	// public AAA(){} 형태의 생성자를 자동으로 만들어 낸다.
	
	double i = 2;
	
	// 생성자 정의
	public AAA(){
		System.out.println(i);
		i = 3;
		System.out.println(i);
		System.out.println("AAA 객체 생성");
	}
	
	public AAA(int i){
		System.out.println(i);
		this.i = i;
		System.out.println(i);
		System.out.println("AAA(int) 객체 생성\ni = " + i);
	}

	public AAA(double i){
		System.out.println("AAA(double) 객체 생성\ni = " + i);

		this.i = i;
	}
	
}
