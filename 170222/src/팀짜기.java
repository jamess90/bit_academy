import java.util.ArrayList;
import java.util.Iterator;

public class ��¥�� {

	public static void main(String[] args) {
		
		String []team1 = new String[4];
		String []team2 = new String[4];
		String []team3 = new String[4];
		String []team4 = new String[5];
		
		ArrayList<String[]> teamList = new ArrayList<>();
		teamList.add(team1);
		teamList.add(team2);
		teamList.add(team3);
		teamList.add(team4);
		
		
		ArrayList<String> students = new ArrayList<>();
		students.add("������");
		students.add("������");
		students.add("���¿�");
		students.add("�̿���");
		students.add("��ûȭ");
		
		students.add("�̻���");
		students.add("����");
		students.add("�Ѽ���");
		students.add("�����");
		students.add("�忹��");
		
		students.add("������");
		students.add("����ȣ");
		students.add("������");
		students.add("������");
		students.add("������");
		
		students.add("��ΰ�");
		students.add("���غ�");
		
		
		while(students.size() != 0 ){
			int teamNumber = (int)(Math.random() * teamList.size());
			String [] teamTmp = teamList.get(teamNumber);
			if(teamTmp[teamTmp.length-1] == null){
				int studentNumber = (int)(Math.random() * students.size());
				String stuname = students.get(studentNumber);
				
				for(int i = 0; i < teamTmp.length; i++){
					if(teamTmp[i] == null){
						teamTmp[i] = stuname;
						break;
					}
				}
				students.remove(stuname);
				
				
			}else{
				continue;
				
			}
		}
		
		for(int i = 0; i < teamList.size(); i++){
			for(int j = 0; j < teamList.get(i).length; j++){
				System.out.print(teamList.get(i)[j] + "  ");
			}
			System.out.println();
		}
		
		
	}
	
}
