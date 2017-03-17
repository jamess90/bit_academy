package example.generic.main;

import java.util.TreeSet;

public class main09 {

	public static void main(String[] args) {
		
		TreeSet<Person> treeSet = new TreeSet<>();
		treeSet.add(new Person("A", 10));
		treeSet.add(new Person("D", 13));
		treeSet.add(new Person("B", 12));
		treeSet.add(new Person("C", 11));
		
		System.out.println(treeSet);
	
	}
	
}

class Person implements Comparable<Person>{

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
	
	@Override
	public int compareTo(Person o) {
		
		return this.age - o.age;
	}
}

