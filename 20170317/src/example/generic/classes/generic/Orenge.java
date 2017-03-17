package example.generic.classes.generic;

public class Orenge extends Fruit {

	public Orenge() {
		super(15, "orenge");
	}

	@Override
	public String toString() {
		return "Orenge";
	}

	public void goo() {
		System.out.println("Orenge.goo()");
	}
}
