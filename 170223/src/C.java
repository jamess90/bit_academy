
public class C {

	private int num;
	private char ch;
	private String str;
	
	// 1) �� ���� ���� ��� �ܺο��� ��� ���� ������ �𸣴� ��� (����Ʈ ���� �����ؾ� �ϴ� ���)
	
	public C(){
		this(0, 'A', "");
		
		System.out.println("C()");
//		this.num = 0;
//		this.ch = 'A';
//		this.str = "";
	}
	
	
	
	// 2) �� ���� ���� �߿� �ܺο��� �� ���� ������ �˰� �ִ� ���
	public C(int num, char ch){
		this(num, ch, "");
		System.out.println("C(int, char)");
//		this.num = num;
//		this.ch = ch;
//		this.str = "";
	}
	
	
	
	// 3) �� ���� ������ ��� �˰� �ִ� ���
	public C(int num, char ch, String str){
		System.out.println("C(int, char, String)");
		this.num = num;
		this.ch = ch;
		this.str = str;
	}
	
}
