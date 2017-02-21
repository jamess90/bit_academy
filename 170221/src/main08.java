
public class main08 {
	 public static void main(String[] args) {
		Person p1 = new Person();
		
		p1.age = 28;
		p1.name = "시형준";
		p1.job = "백수";
		
		p1.printPersonInfo();
		
		p1.changeJob("수강생");
		
		p1.printPersonInfo();
		
		int p_age = p1.getAge();
		System.out.println("나이는 " +p_age + "살 입니다.");
		
		String p_name = p1.changeName("정영진");
		System.out.println("이름은 " +p_name + "입니다.");
	}
}

