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

		System.out.println("Person ���� ����ϱ�");
		System.out.println("1)���\t\t2)��������\t\t3)�����ϱ�\t\t4)����");

		int numScan = scan.nextInt();

		switch (numScan) {
		case 1:
			for (int i = 0; i < p_arr.length; i++) {

				System.out.println("���");

				System.out.println("�̸��� �Է��ϼ���.");
				personName = scan.nextLine();
				

				System.out.println("���̸� �Է��ϼ���.");
				personAge = scan.nextLine();
				
				p_arr[i] = new Person(personName, personAge);

			}

			break;
		case 2:

			break;
		case 3:

			break;
		case 4:
			System.out.println("����");

			break;

		}

	}

}
