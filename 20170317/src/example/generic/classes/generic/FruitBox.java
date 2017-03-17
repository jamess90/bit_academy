package example.generic.classes.generic;

public class FruitBox<T> { // 'T' 반드시 대문자

	private T fruit;

	public void putFruit(T fruit) {
		System.out.println(fruit + " 을 담습니다.");
		this.fruit = fruit;
	}

	public T getFruit() {
		System.out.println(fruit + " 을 꺼냅니다.");
		return fruit;
	}

}
