package example.generic.classes.generic;

public class FruitBox<T> { // 'T' �ݵ�� �빮��

	private T fruit;

	public void putFruit(T fruit) {
		System.out.println(fruit + " �� ����ϴ�.");
		this.fruit = fruit;
	}

	public T getFruit() {
		System.out.println(fruit + " �� �����ϴ�.");
		return fruit;
	}

}
