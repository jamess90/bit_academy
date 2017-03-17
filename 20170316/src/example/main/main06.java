package example.main;

public class main06 {

	public static void main(String[] args) {
		
//		int score1 = 90;
//		int score2 = 90;
//		int score3 = 90;
//		int score4 = 90;
//		int score5 = 90;
//		
//		int score6 = 90;
//		int score7 = 90;
//		int score8 = 90;
//		int score9 = 90;
//		int score10 = 90;
//		
//		int score11 = 90;
//		int score12 = 90;
//		int score13 = 90;
//		int score14 = 90;
//		int score15 = 90;
//		
//		int score16 = 90;
//		int score17 = 90;
//		int score18 = 90;
//		int score19 = 90;
//		int score20 = 90;
//		
//		int total_score = score1+score2+score3+score4+
//				score5+score6+score7+score8+score9+score10+score11+score12+score13+score14+
//				score15+score16+score17+score18+score19+score20;
//	
//		
//		
//		int avg_score = total_score / 20;
//		
//		System.out.println("점수 평균 : " + avg_score);
		
	
		//배열 만들기
		int [] score_arr = new int[10];
		
//		score_arr[0] = 10;
//		score_arr[1] = 20;
//		score_arr[2] = 30;
//		score_arr[3] = 40;
//		score_arr[4] = 50;
//		
//		score_arr[5] = 60;
//		score_arr[6] = 70;
//		score_arr[7] = 80;
//		score_arr[8] = 90;
//		score_arr[9] = 100;
		
//		for(int i = 0;  i < 10; i++){
//			score_arr[ i ] = (i+1) * 10;
//		}

		//score_arr도 객체이기 때문에 멤버변수나 메소드를 사용 할 수 있다.
		// * length : 배열의 길이
		
		for(int i = 0;  i < score_arr.length; i++){
			score_arr[ i ] = (i+1) * 10;
		}
		
		
		
		for(int i = 0; i < score_arr.length; i++){
			System.out.println(score_arr[i]);
		}
		
		//for-each
		// 자료구조에서 원하는 데이터를 뽑아낼 때 많이 사용된다.
		// 매우중요함
		// 종료 시기 : 더이상 꺼낼 데이터가 없을 때 종료된다.
		
		//for(변수 : 자료구조){
		//    자료구조에있는 아이템을 순서대로 하나씩 꺼내서 변수에 대입시킨다.
		//}
		//모든 데이터를 꺼내서 검사 할때 많이 사용된다.
		System.out.println();
		System.out.println("for each문장");
		
		for(int i : score_arr){
			System.out.println(i);
		}
		
		
		
		
		//System.out.println( score_arr[0] );
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
