package example.main;

public class main05 {

	public static void main(String[] args) {
		A a1 = new B();
		A a2 = new C();
		
		B b1 = new B();
		
		//객체가 무엇으로 이루어져 있는지 판단하는 instanceof 연산자
		// A instanceof B    => A객체가 B 클래스로 이루어져 있는가?( = 부를 수 있는가?)
		
		if(a1 instanceof B){
			System.out.println("a1 객체는 B 클래스라고 부를 수 있다.");
		}
		
		if(a2 instanceof C){
			System.out.println("a2 객체는 C 클래스라고 부를 수 있다.");
		}
		
		if(b1 instanceof A){
			System.out.println("b1 객체는 A 클래스라고 부를 수 있다.");
		}
		
	}
	
}

class A{}
class B extends A{}

class C extends B{}
class D extends B{}










