
public class main02 {

	public static void main(String[] args) {
		
// ������
// -> Ŭ������ �̿��� ��ü�� ���� �� �������� �ϵ��� ���� ������.
// �����ڴ� ��ü �ϳ��� �ѹ��� ȣ���� �ȴ�. �ι��̻� ȣ���� �ȴٴ� �̾߱�� 
// ���ο� ��ü�� ��� ����ٴ� ��
// new Ű����� �Բ� ��� �ȴ�.
// �׻� public Ű���尡 �;� �ϸ�, �������°� ���� Ŭ������ �̸��� ����Ѵ�.
// *�����ڸ� == Ŭ������
// �Ű������� ���� �� �� �ִ�.
// �����ε��� �����ϴ�.

		
// �����ڰ� ���� �����ڸ� �ۼ��ϰ� �Ǹ�, �����Ϸ��� ����Ʈ �����ڸ� ������ �ʴ´�.
// *����Ʈ ������ : �ƹ� �ϵ� ���� �ʴ� �⺻���� ������. ������ ��ü�� ����� �ϸ� �Ѵ�.

//		AAA aaa1 = new AAA(); 	// AAA() -> ������
		AAA aaa2 = new AAA(3);
//		AAA aaa3 = new AAA(324.0004);
		
		
	}
}

class AAA{
	
	// �����ڰ� ���� �����ڸ� ������ ������
	// public AAA(){} ������ �����ڸ� �ڵ����� ����� ����.
	
	double i = 2;
	
	// ������ ����
	public AAA(){
		System.out.println(i);
		i = 3;
		System.out.println(i);
		System.out.println("AAA ��ü ����");
	}
	
	public AAA(int i){
		System.out.println(i);
		this.i = i;
		System.out.println(i);
		System.out.println("AAA(int) ��ü ����\ni = " + i);
	}

	public AAA(double i){
		System.out.println("AAA(double) ��ü ����\ni = " + i);

		this.i = i;
	}
	
}
