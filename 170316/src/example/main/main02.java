package example.main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class main02 {
	
	public static final boolean isDebug = false;

	public static void main(String[] args) {

		//������� Ű����κ��� �Է� �ް� ���ִ� Scanner
		Scanner scan = new Scanner(System.in);
		
		int num1 = 10;
		int num2 = 0;

//		if (num2 == 0) {
//			System.out.println("num2�� 0�� ������.");
//		} else {
//			int result = num1 / num2;
//			System.out.println("result : " + result);
//		}
		
		//����ó�� try ~ catch ~ finally
		//try : ���� �߻� ���� ����(����)
		//catch : try���� �߻��� ���ܸ� ó���ϴ� ����. �������� �� �� �ִ�. -> else if�� ���
		//finally : try���� ��� �ڵ尡 ����� ����Ǵ�, catch���� ������ ó���Ǵ� ������ ���� �Ǿ�� �� ����
		// ���� try�� ���� �� ������ ����� catch�� ���� �� ������ ������ �ߺ� �� ��� ���� ���ȴ�.
//		try{
//			num2 = scan.nextInt();
//			
//			int result = num1 / num2;			//���ܸ� ������
//			System.out.println("result : " + result);
//			
//			//	catch���� �޴´�.
//		}catch(ArithmeticException e){
//			System.out.println(e.getMessage());
//			if(isDebug){
//				e.printStackTrace();
//			}
//			System.out.println("� ���� 0���� ���� �� ����.");
//		}catch(InputMismatchException e){
//			System.out.println(e.getMessage());
//			if(isDebug){
//				e.printStackTrace();
//			}
//			System.out.println("�Է��� �߸� �ƽ��ϴ�.");
//		}
		
		
		try{
			num2 = scan.nextInt();
			
			int result = num1 / num2;			//���ܸ� ������
			System.out.println("result : " + result);
			
			//	catch���� �޴´�.
		}catch(ArithmeticException e){
			
		}catch(Exception e){
			//1) Exception e = new ArithmeticException();  upcasting
			//2) Exception e = new InputMispatchException(); upcasting
			e.printStackTrace();
		}
		
		//���ܰ�ü Ȱ��
		// getMessage()        => � ������ �������� �˷��ش�.
		// printStackTrace() => ���� ��ġ �� ���� ������ ���ϰ� �����ش�.

	}

}
