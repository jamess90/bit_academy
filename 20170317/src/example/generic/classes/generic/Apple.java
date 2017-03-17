package example.generic.classes.generic;

public class Apple extends Fruit {

	public Apple() {
		super(10, "red");
	}

	@Override
	public String toString() {
		return "apple";
	}

	public void foo() {
		System.out.println("apple.foo()");
	}
}
