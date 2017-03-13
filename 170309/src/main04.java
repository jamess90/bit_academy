
public class main04 {

	public static void main(String[] args) {
		
		
		B.goo();
		
		B b1 = new B();
		b1.m_num++;
		B.s_num++;
		
		b1.foo();
		b1.goo();
		
		
		System.out.println(b1.m_num);
		System.out.println(B.s_num);
		
		B b2 = new B();
		b2.m_num++;
		B.s_num++;
		
		System.out.println(b2.m_num);
		System.out.println(B.s_num);
		
		b1.foo();		// 일반 멤버 메소드는 참조 변수를 이용하여 호출
						// 객체가 만들어져야만 사용 가능한 상태가 되기 때문에
		
		B.goo();		// 정적 메소드는 프로그램 시작할 때 이미 사용가능한 상태이다.
						// 따라서 참조 변수가 필요 없다. ( 정적 정수도 마찬가지)
	
	}

}
