
public class main08 {
	 public static void main(String[] args) {
		Person p1 = new Person();
		
		p1.age = 28;
		p1.name = "������";
		p1.job = "���";
		
		p1.printPersonInfo();
		
		p1.changeJob("������");
		
		p1.printPersonInfo();
		
		int p_age = p1.getAge();
		System.out.println("���̴� " +p_age + "�� �Դϴ�.");
		
		String p_name = p1.changeName("������");
		System.out.println("�̸��� " +p_name + "�Դϴ�.");
	}
}

