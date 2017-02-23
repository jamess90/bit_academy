
public class main03 {
	public static void main(String[] args) {
		
		// 1) 부모의 생성자부터 호출한다. ( 부모 객체를 제일 먼저 생성)
		// 2) 자식의 생성자를 호출한다. ( 부모 객체가 만들어진 다음
		//    그 객체를 포함하는 형태로 자식 객체가 만들어 진다.)
		
		Child child = new Child();				// new Child() 시 발생하는 메모리 주소값은 
														//	Child 객체의 주소값이다.
		child.foo();									// 부모에 정의된 foo();
		child.goo();									// 자식에 정의된 goo();
			
		Parent parent = new Parent();		// 부모의 생성자만 호출됨
		parent.foo();								// 부모가 가지고 있는 foo();
//		parent.goo();								// 자식이 가지고 있는 goo();
		
	}
}
