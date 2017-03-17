package example.main;

public class main05 {

	public static void main(String[] args) {
		A a1 = new B();
		A a2 = new C();
		
		B b1 = new B();
		
		//��ü�� �������� �̷���� �ִ��� �Ǵ��ϴ� instanceof ������
		// A instanceof B    => A��ü�� B Ŭ������ �̷���� �ִ°�?( = �θ� �� �ִ°�?)
		
		if(a1 instanceof B){
			System.out.println("a1 ��ü�� B Ŭ������� �θ� �� �ִ�.");
		}
		
		if(a2 instanceof C){
			System.out.println("a2 ��ü�� C Ŭ������� �θ� �� �ִ�.");
		}
		
		if(b1 instanceof A){
			System.out.println("b1 ��ü�� A Ŭ������� �θ� �� �ִ�.");
		}
		
	}
	
}

class A{}
class B extends A{}

class C extends B{}
class D extends B{}










