package example.generic.classes;

public class Person {

	private int age;
	private String name;
	
	public Person(String name, int age){
		this.name = name;
		this.age = age;
		
	}
	
	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]\n";
	}

	public String getName() {
		return name;
	}
	
}
