package example.generic.classes;

public class FruitBox {

	private Fruit fruit;

	public void putFruit(Fruit fruit) {
		System.out.println(fruit + " À» ´ã½À´Ï´Ù.");
		this.fruit = fruit;
	}

	public Fruit getFruit() {
		System.out.println(fruit + " À» ²¨³À´Ï´Ù.");
		return fruit;
	}

}
