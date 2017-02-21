
public class main03 {

	public static void main(String[] args) {
		int a = 10;
		a++;			//후위 증가(세미콜론을 지나가면 1 증가)    10
		System.out.println(a);		//a => 11
		
		int b = 10;
		++b;			//전위 증가 (세미콜론을 만나기 전에 1 증가)
		System.out.println(b);
		
		int c = 10;
		int d = 10;
		
		System.out.println(c++);
		System.out.println(++d);
		
		
		int e = 0;
		System.out.println(e++);//0
		System.out.println(++e);//2
		System.out.println(e--);//2
		System.out.println(e--);//1
		System.out.println(++e);//1
		System.out.println(--e);//0
		
		System.out.println(2+2);	// 4
		System.out.println(2+2*2);	// 곱셈이 우선 순위가 높기 때문에 2*2부터 실행..
									// 6
		
		System.out.println(2+2/2*3+2/1-3+1/4*2);
		System.out.println(2+((2/2)*3)+(2/1)-3+((1/4)*2));
		
		//메모리 크기에 따른 나눗셈
		System.out.println(5/2);	//몫 구하기
		System.out.println(5%2);	//나머지 구하기
		System.out.println((double)5/2);
		System.out.println(5/(double)2);
		System.out.println((double)(5/2));
		
		
		
	}
	
}