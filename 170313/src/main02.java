public class main02 {

	public static void main(String[] args) {
		// 1) toString
		// 2) equals
		
		A a1 = new A(10);
		A a2 = new A(10);
		String str = a1.toString();
		
		System.out.println(a1);
		System.out.println(str);
		
		System.out.println("Ŭ���� �̸� : " + a1.getClass().getName());
		
		if(a1 == a2){
			System.out.println("a1�� a2�� ����.");
		}else{
			System.out.println("a1�� a2�� �ٸ���.");
		}

		Person p1 = new Person("������", 28, "5�� 2��");
		Person p2 = new Person("������", 28, "5�� 2��");
		
		System.out.println(p1.toString());
		if(p1 == p2){
			System.out.println("p1�� p2�� ����.");
		}else{
			System.out.println("p1�� p2�� �ٸ���.");
		}
		
		// p2�� �������� p1�� ��
		// Object Ŭ���������� �⺻������ equals �޼ҵ带 ���� �����ڿ� 
		// �����ϰ� ����Ѵ�. -> �޸� �ּҰ� ��
		if(p1.equals(p2)){
			System.out.println("p1�� p2�� ����.");
		}else{
			System.out.println("p1�� p2�� �ٸ���.");
		}
	}
}
