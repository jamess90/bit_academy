
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
		System.out.println("�̸� : " + getName() 
								+ "\n�ֹι�ȣ : " + getJuminNumber());
	}
}

// �ֹε�Ϲ�ȣ, �̸��� �Է¤��޾Ƽ� Person ��ü�� �����.
// �ֹι�ȣ�� �� �ٲ�� �̸��� �ٲ��
// 

// �ֹε�Ϲ�ȣ : String JUMIN_NUMBER
// �̸� : String name