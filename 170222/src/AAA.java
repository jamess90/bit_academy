
//Ŭ���� AAA�� ��𿡼��� ��� �� �� �ִ�.
public class AAA {

	//���� ���� ������
	//private : Ŭ���� ���ο����� ��� ����
	//public  : Ŭ���� �ܺ�, ���ο��� ��� ��� ����	
	
	//1)�������� : ��� Ŭ������ ��������� �׻� private���� �����.
	//          getter/setter�� �̿��Ͽ� �ܺο����� ������ �����Ѵ�.
	
	//num1�� private �����̱� ������ ���ο����� ��� ������ ��� ����
	private int num1 = 0;
	//str1�� public �����̱� ������ �ܺ�, ���ο��� ���� ��� ������ ��� ����
	public String str1 = "AAA_STR1";
	
	//showInfo() �޼ҵ�� ���ο� �ܺο��� ��� ��� ������ �޼ҵ�
	public void showInfo(){
		System.out.println("num1 : " + this.num1);
		System.out.println("str1 : " + this.str1);
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	//this Ű����
	//�ڱ� �ڽ��� ����
	//���� Ŭ���� ������ ��� ������ ��� �� �� �� �ش�.
	public void setDatas(int num1, String str1){
//		this.num1 = num1;
//		this.str1 = str1;
		this.num1 = num1;
		this.str1 = str1;
		
	}
	
	//������ ������
	//���� �ڵ����(�߰�ȣ{}) �ȿ����� ������ �̸��� ������ ����� ����.
	
	// ��������, �Ű������� ������ �߰�ȣ�� ����� �������.
	// ��������� ��ü�� ����� �� �������.
	public void foo()
	{
		int a;	//��������� ����? foo() �޼ҵ尡 ȣ�� �Ǿ��� �� ����� ����.
				//������� ����? foo() �޼ҵ尡 ���� �Ǿ��� �� �������.
				//���� ���� foo()�޼ҵ� ���������� ��� �� �� �ֱ� ������...
		
		{
			//int a;	//error ���� �̹� int a�� ���� �Ǿ��� ������.... �ߺ��� �����̴�.
			a = 10;		//ok    ���� ����� int a�� ��� �� �� �ִ�.
			
			int b = 20;
		}
		
		//System.out.println(b);
	}
	
	//�Ű������� ���������� �������� ó�� �ȴ�.
	public void goo(int g){
		//int g = 10;	//error �Ű������� ���� �̸����� ���� ������ ���� �� ����.
	}

	
	
	//getter / setter
	// getter : ��������� �ܺο� �������ִ� �޼ҵ�
	// setter : ��������� �ܺο��� �����ϰ� ���ִ� �޼ҵ�
	// �ʿ��� ���� : ��� ��������� private ���·� ���ο����� ������ �����ϰ� �Ǿ� �ֱ� ������
	// ��Ȳ�� ���� �ܺο� �����͸� �����ϰų� �ܺο��� �����͸� ���� �� �ֱ� ���� ����� ���´�.
	// ��������� �ܺο����� �������(����)�� ���� ������ �����ϰ� ó�� �� �� �ִ�.
	
	// ������ getter / setter�� public ���·� �����.
	
	//getter

	
	//setter
	
	
	
	
	
	
	
	
	
	
	
}