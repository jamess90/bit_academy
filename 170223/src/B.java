
public class B {

	public static int s_num = 0;			//static 변수(정적변수) ->프로그램이 시작할 때 한번만 생성
	public int m_num = 0;					//멤버변수(인스턴스 변수) -> 객체가 생성될 때 마다 생성
	
	public B(){
		s_num++;
		this.m_num++;
		
		System.out.println("s_num : " + s_num);
		System.out.println("m_num : " + m_num);
	}
	
	
	// static 메소드에서는 static 변수만 사용할 수 있다.
	public static void s_showInfo(){
		
		System.out.println("s_num : " + s_num);
		//System.out.println("m_num : " + m_num);		// error!!
	}
	
	// 일반 멤버 메소드는 객체가 만들어져야만 사용 할 수 있다.
	public void m_showInfo(){
		
		//System.out.println("s_num : " + s_num);
		System.out.println("m_num : " + m_num);		// no error
	}
	
}
