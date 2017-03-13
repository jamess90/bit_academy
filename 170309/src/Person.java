
public class Person {

	private final String JUMIN_NUMBER;
	private String name;
	
	public Person(String JUMIN_NUMBER, String name){
		this.JUMIN_NUMBER = JUMIN_NUMBER;
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJuminNumber() {
		return JUMIN_NUMBER;
	}
	
	public void print_person(){
		System.out.println("이름 : " + getName() 
								+ "\n주민번호 : " + getJuminNumber());
	}
}

// 주민등록번호, 이름을 입력ㄷ받아서 Person 객체를 만든다.
// 주민번호는 못 바뀌고 이름을 바뀌게
// 

// 주민등록번호 : String JUMIN_NUMBER
// 이름 : String name