
public class main01 {
	public static void main(String[] args) {
		B b1 = new B(100);
		
		String str = b1.toString();
		// B에는 toString()이 재정의 되어있지 않기 때문에
		// 바로 위의 부모인 A클래스의 toString()을 호출한다.
		// 만역 A에도 toString()이 재정의 되어 있지 않으면
		// Object의 toString()을 호출한다.
		System.out.println(str);
	}
}
