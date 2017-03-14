package example1.classes;

import example1.interfaces.IExampleA;

public class main01 {

	public static void main(String[] args) {

		ExampleA ea = new ExampleA();
		ExampleA2 ea2 = new ExampleA2();
		
		IExampleA.goo();
		
		ea.foo();
		ea.koo();

		ea2.foo();
		ea2.koo();
		ea2.moo();
	}
}
