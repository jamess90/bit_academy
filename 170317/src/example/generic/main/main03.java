package example.generic.main;

import example.generic.classes.Apple;
import example.generic.classes.Orange;
import example.generic.classes.generic.myGeneric;

public class main03 {
	public static void main(String[] args) {
		
		myGeneric<Apple, Orange> mygeneric = new myGeneric<Apple, Orange>(new Apple(), new Orange());
		
	}
}
