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
//		System.out.println("���� ��� : " + avg_score);
		
	
		//�迭 �����
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

		//score_arr�� ��ü�̱� ������ ��������� �޼ҵ带 ��� �� �� �ִ�.
		// * length : �迭�� ����
		
		for(int i = 0;  i < score_arr.length; i++){
			score_arr[ i ] = (i+1) * 10;
		}
		
		
		
		for(int i = 0; i < score_arr.length; i++){
			System.out.println(score_arr[i]);
		}
		
		//for-each
		// �ڷᱸ������ ���ϴ� �����͸� �̾Ƴ� �� ���� ���ȴ�.
		// �ſ��߿���
		// ���� �ñ� : ���̻� ���� �����Ͱ� ���� �� ����ȴ�.
		
		//for(���� : �ڷᱸ��){
		//    �ڷᱸ�����ִ� �������� ������� �ϳ��� ������ ������ ���Խ�Ų��.
		//}
		//��� �����͸� ������ �˻� �Ҷ� ���� ���ȴ�.
		System.out.println();
		System.out.println("for each����");
		
		for(int i : score_arr){
			System.out.println(i);
		}
		
		
		
		
		//System.out.println( score_arr[0] );
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
