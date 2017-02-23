
public class main01 {

	public static void main(String[] args) {
		//main에서는 AAA클래스의 객체를 만들고 사용하는 AAA클래스 입장에서의 '외부'이다.
		
		// 외부에서 AAA클래스를 기반으로 한 객체를 만들어 사용
		// new 키워드를 활용하여 AAA클래스의 객체(인스턴스)를 만든다.
		
		// new 키워드를 활용하여 객체를 생성하면 Heap 메모리 공간에 AAA클래스의 객체가 할당이 되고,
		// 메모리 주소값을 발생 시킨다.
		// 이 때 발생된 메모리 주소값이 참조 변수(aaa)에 대입된다.
		// * 할당 : 실제 물리적인 메모리 영역을 차지
		
		AAA aaa = new AAA();
		System.out.println(aaa);
		
		// 접근연산자(.) -> 참조변수 aaa가 가지고 있는 메모리주소에 
		// 대응되는 인스턴스의 내부 아이템(멤버변수, 메소드)를 사용 할 수 있게 해주는 연산자
		
		aaa.str1 = "ㅁㅁㅁ";
		aaa.showInfo();
		aaa.setNum1(10);
		aaa.showInfo();
		
	}

}
