
public class Person {

	private String name;
	private int age;
	private String birthday;
	
	public Person(String name, int age,  String birthday) {
		this.name = name;
		this.age = age;
		this.birthday = birthday;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", birthday=" + birthday + "]";
	}
	@Override
	public boolean equals(Object obj) {
		Person temp = (Person)obj;
		
		boolean equals_condition = ( this.age == temp.age ) && 
											( this.name == temp.name ) && 
											( this.birthday == temp.birthday );
		
		return equals_condition;
	}
	
}
