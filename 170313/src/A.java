
public class A {

	private int num1;
	private int num2;
	private int num3;
	// public A(){
	// System.out.println("A()持失");
	// }

	public A(int num) {
		this.num1 = num;
		this.num2 = num;
		this.num3 = num;
		System.out.println("A(int num) 持失");
		
	}

	@Override
	public String toString() {
		return "A [num1=" + num1 + ", num2=" + num2 + ", num3=" + num3 + "]";
	}

}
