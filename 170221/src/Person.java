// Ŭ�������� �ձ��ڴ� �빮�ڷ� �Ѵ�. (Person)
public class Person {
	// 1) Person class���� ����� �����͸� ����
	int age; // �̸�
	String name; // ����
	String job; // ����

	// 2) Person���� ����� ��� ����
	void printPersonInfo() {
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
		System.out.println("���� : " + job);
		System.out.println();
	}
	
	void changeJob(String changeJob){
		job = changeJob;
		System.out.println("������ �ٲ�����ϴ�.");
		System.out.println();
	}
	
	int getAge(){
//		System.out.println("���̴� " +age + "�� �Դϴ�.");
		return age;
	}
	
	String changeName(String changename){
		name = changename;
		return name;
	}
}