import java.util.ArrayList;
import java.util.Iterator;

public class ÆÀÂ¥±â {

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
		students.add("Â÷Àººñ");
		students.add("Á¶¿ëÁø");
		students.add("±èÅÂ¿¬");
		students.add("ÀÌ¿ëÇö");
		students.add("ÇÑÃ»È­");
		
		students.add("ÀÌ»óÈÖ");
		students.add("±è±â¹ü");
		students.add("ÇÑ¼öÁ¤");
		students.add("±è¿ëÇö");
		students.add("Àå¿¹Âù");
		
		students.add("Àüº´Àç");
		students.add("À±ÁöÈ£");
		students.add("½ÃÇüÁØ");
		students.add("±èÁöÀ±");
		students.add("±èÅÂÈÆ");
		
		students.add("±è¹Î°æ");
		students.add("¹ÚÁØº´");
		
		
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
