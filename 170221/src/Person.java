// 클래스명의 앞글자는 대문자로 한다. (Person)
public class Person {
	// 1) Person class에서 사용할 데이터를 정의
	int age; // 이름
	String name; // 나이
	String job; // 직업

	// 2) Person에서 사용할 기능 정의
	void printPersonInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("직업 : " + job);
		System.out.println();
	}
	
	void changeJob(String changeJob){
		job = changeJob;
		System.out.println("직업이 바뀌었습니다.");
		System.out.println();
	}
	
	int getAge(){
//		System.out.println("나이는 " +age + "살 입니다.");
		return age;
	}
	
	String changeName(String changename){
		name = changename;
		return name;
	}
}