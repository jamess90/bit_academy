
public class main01 {
	public static void main(String[] args) {

		A a = new A();
		a.printNum();
		
	}
}

class A{
	private int num;
	public void setNum(int num){
		this.num = num;
	}
	public void printNum(){
		System.out.println("num : " + num);
	}
	
	public void foo(int a){

		int b = 20;
	}

	public void goo(){
		System.out.println("goo(num) ȣ��" + num);
	}
	// �Ű������� �̸��� (������) �����ε� ���� ���ǿ� �ش���� �ʴ´�.
	
	public void goo(int num){
		System.out.println("goo(num) ȣ��" + num);
	}
	
	
	

}