
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
		System.out.println("goo(num) 호출" + num);
	}
	// 매개변수의 이름은 (변수명) 오버로딩 가능 조건에 해당되지 않는다.
	
	public void goo(int num){
		System.out.println("goo(num) 호출" + num);
	}
	
	
	

}