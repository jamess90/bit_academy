package example1.classes;

import example1.interfaces.IExampleA;
import example1.interfaces.IExampleA2;
import example1.interfaces.IExampleA3;

public class ExampleA2 implements IExampleA3 {

	@Override
	public void foo() {
		System.out.println("ExampleA2.foo()");
		
	}

	@Override
	public void koo() {
		System.out.println("ExampleA2.koo()");

	}

	@Override
	public void moo() {
		System.out.println("ExampleA2.moo()");

	}

}
