
public class Parent2 {
	
	// ����� ���� protected Ű����
	// -> �ٸ� ��Ű��						��� �Ұ���
	// -> �ٸ� ��Ű���� �ڽ�	 		��� ����
	// -> ���� ��Ű��						��� ����
	protected int num1;
	protected int num2;
	
	public Parent2(int num1, int num2){
		this.num1 = num1;
		this.num2 = num2;
	
		System.out.println("Parent2 ������ ȣ��");
	}
	
	public void ShowParent2Info(){
		System.out.println("num1 : "+ this.num1);
		System.out.println("num2 : "+ this.num2);
		
	}
}
