
public class C {

	private int num;
	private char ch;
	private String str;
	
	// 1) 세 가지 변수 모두 외부에서 어떠한 값이 들어올지 모르는 경우 (디폴트 값을 설정해야 하는 경우)
	
	public C(){
		this(0, 'A', "");
		
		System.out.println("C()");
//		this.num = 0;
//		this.ch = 'A';
//		this.str = "";
	}
	
	
	
	// 2) 세 가지 변수 중에 외부에서 두 가지 변수만 알고 있는 경우
	public C(int num, char ch){
		this(num, ch, "");
		System.out.println("C(int, char)");
//		this.num = num;
//		this.ch = ch;
//		this.str = "";
	}
	
	
	
	// 3) 세 가지 변수를 모두 알고 있는 경우
	public C(int num, char ch, String str){
		System.out.println("C(int, char, String)");
		this.num = num;
		this.ch = ch;
		this.str = str;
	}
	
}
