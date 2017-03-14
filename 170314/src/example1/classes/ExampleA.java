package example1.classes;

import example1.interfaces.IExampleA;
import example1.interfaces.IExampleA2;

public class ExampleA implements IExampleA, IExampleA2{

	@Override
	public void foo() {
		System.out.println("ExampleA.foo()");
	}
	
	@Override
	public void koo() {
		System.out.println("ExampleA.koo()");
		
	}
	
}
