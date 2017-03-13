public class main02 {

	public static void main(String[] args) {
		// 1) toString
		// 2) equals
		
		A a1 = new A(10);
		A a2 = new A(10);
		String str = a1.toString();
		
		System.out.println(a1);
		System.out.println(str);
		
		System.out.println("클래스 이름 : " + a1.getClass().getName());
		
		if(a1 == a2){
			System.out.println("a1과 a2가 같다.");
		}else{
			System.out.println("a1과 a2가 다르다.");
		}

		Person p1 = new Person("시형준", 28, "5월 2일");
		Person p2 = new Person("시형준", 28, "5월 2일");
		
		System.out.println(p1.toString());
		if(p1 == p2){
			System.out.println("p1은 p2와 같다.");
		}else{
			System.out.println("p1은 p2와 다르다.");
		}
		
		// p2를 기준으로 p1을 비교
		// Object 클래스에서는 기본적으로 equals 메소드를 동등 연산자와 
		// 동일하게 사용한다. -> 메모리 주소값 비교
		if(p1.equals(p2)){
			System.out.println("p1은 p2와 같다.");
		}else{
			System.out.println("p1은 p2와 다르다.");
		}
	}
}
