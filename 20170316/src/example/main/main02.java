package example.main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class main02 {
	
	public static final boolean isDebug = false;

	public static void main(String[] args) {

		//사용자의 키보드로부터 입력 받게 해주는 Scanner
		Scanner scan = new Scanner(System.in);
		
		int num1 = 10;
		int num2 = 0;

//		if (num2 == 0) {
//			System.out.println("num2에 0은 못들어간다.");
//		} else {
//			int result = num1 / num2;
//			System.out.println("result : " + result);
//		}
		
		//예외처리 try ~ catch ~ finally
		//try : 예외 발생 가능 문장(구문)
		//catch : try에서 발생한 예외를 처리하는 구간. 여러개가 올 수 있다. -> else if와 비슷
		//finally : try에서 모든 코드가 제대로 실행되던, catch에서 오류가 처리되던 무조건 실행 되어야 할 문장
		// 보통 try가 끝날 때 실행할 문장과 catch가 끝날 때 실행할 문장이 중복 될 경우 많이 사용된다.
//		try{
//			num2 = scan.nextInt();
//			
//			int result = num1 / num2;			//예외를 던지면
//			System.out.println("result : " + result);
//			
//			//	catch에서 받는다.
//		}catch(ArithmeticException e){
//			System.out.println(e.getMessage());
//			if(isDebug){
//				e.printStackTrace();
//			}
//			System.out.println("어떤 수를 0으로 나눌 수 없다.");
//		}catch(InputMismatchException e){
//			System.out.println(e.getMessage());
//			if(isDebug){
//				e.printStackTrace();
//			}
//			System.out.println("입력이 잘못 됐습니다.");
//		}
		
		
		try{
			num2 = scan.nextInt();
			
			int result = num1 / num2;			//예외를 던지면
			System.out.println("result : " + result);
			
			//	catch에서 받는다.
		}catch(ArithmeticException e){
			
		}catch(Exception e){
			//1) Exception e = new ArithmeticException();  upcasting
			//2) Exception e = new InputMispatchException(); upcasting
			e.printStackTrace();
		}
		
		//예외객체 활용
		// getMessage()        => 어떤 에러가 났는지만 알려준다.
		// printStackTrace() => 에러 위치 및 에러 내용을 상세하게 보여준다.

	}

}
