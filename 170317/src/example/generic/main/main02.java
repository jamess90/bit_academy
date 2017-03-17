package example.generic.main;

import example.generic.classes.generic.*;

public class main02 {

	public static void main(String[] args) {

		FruitBox<Apple> applebox = new FruitBox<>();
		FruitBox<Orenge> orengebox = new FruitBox<>();

		applebox.putFruit(new Apple());
		orengebox.putFruit(new Orenge());

		Orenge orenge = (Orenge) orengebox.getFruit();

	}

}
