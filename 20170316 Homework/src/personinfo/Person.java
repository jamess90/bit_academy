package personinfo;

import java.util.Scanner;

public class Person {
	
	

	public Person(String personName, String personAge) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		String personName;
		String personAge;

		Person[] p_arr = new Person[3];

		Scanner scan = new Scanner(System.in);

		System.out.println("Person 정보 등록하기");
		System.out.println("1)등록\t\t2)정보보기\t\t3)수정하기\t\t4)종료");

		int numScan = scan.nextInt();

		switch (numScan) {
		case 1:
			for (int i = 0; i < p_arr.length; i++) {

				System.out.println("등록");

				System.out.println("이름을 입력하세요.");
				personName = scan.nextLine();
				

				System.out.println("나이를 입력하세요.");
				personAge = scan.nextLine();
				
				p_arr[i] = new Person(personName, personAge);

			}

			break;
		case 2:

			break;
		case 3:

			break;
		case 4:
			System.out.println("종료");

			break;

		}

	}

}
