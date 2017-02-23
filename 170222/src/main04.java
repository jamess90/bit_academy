
public class main04 {

	public static void main(String[] args) {
		
		AAA a1 = new AAA();
		AAA a2 = new AAA();
		
		a1.setNum1(10);
		a2.setNum1(10);
		
		a1.showInfo();
		a2.showInfo();
		
		if(a1 == a2){
			System.out.println("같다");
		}else{
			System.out.println(a1);
			System.out.println(a2);
			System.out.println("다르다");
		}
		
		AAA a3 = a1;
		
		if(a1 == a3){
			System.out.println(a1);
			System.out.println(a3);
			System.out.println("같다");
		}else{
			System.out.println("다르다");
		}
		
		a3.setNum1(30);
		a1.showInfo();
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
