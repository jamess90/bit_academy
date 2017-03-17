package example.generic.main;

import example.generic.classes.generic.*;

public class main02 {

	public static void main(String[] args) {

		FruitBox<Apple> applebox = new FruitBox<>();
		FruitBox<Orange> orengebox = new FruitBox<>();

		applebox.putFruit(new Apple());
		orengebox.putFruit(new Orange());

		Orange orenge = (Orange) orengebox.getFruit();

	}

}
