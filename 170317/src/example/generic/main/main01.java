package example.generic.main;

import example.generic.classes.Apple;
import example.generic.classes.FruitBox;
import example.generic.classes.Orange;

public class main01 {

	public static void main(String[] args) {

		FruitBox fruitBox = new FruitBox();

		fruitBox.putFruit(new Apple());
		Apple apple = (Apple) fruitBox.getFruit();

		apple.foo();

		System.out.println("get : " + apple);

		fruitBox.putFruit(new Orange());
		Orange orenge = (Orange) fruitBox.getFruit();

		orenge.goo();

		System.out.println("get : " + orenge);

	}

}
