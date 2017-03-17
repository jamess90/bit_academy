package example.generic.classes.generic;

public class Orange extends Fruit {

	public Orange() {
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
