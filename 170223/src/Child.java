
public class Child extends Parent{
	
	public Child(){
		System.out.println("Child ������ ȣ��");
	}
	public void goo()
	{
		foo();
		System.out.println("Child.goo()");
	}
}
