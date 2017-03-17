package example.generic.classes.generic;

public class Fruit {

	private int suger;
	private String color;

	public Fruit(int suger, String color) {
		this.suger = suger;
		this.color = color;
	}

	public void showFruitInfo() {
		System.out.println("sweetness : " + suger);
		System.out.println("color : " + color);
	}

}
