package example.generic.main;

import java.util.ArrayList;
import java.util.Iterator;

import example.generic.classes.Person;

public class main06 {

	public static void main(String[] args) {
		
		ArrayList<Person> personList = new ArrayList<>();
		personList.add(new Person("A", 10));
		personList.add(new Person("B", 20));
		personList.add(new Person("C", 30));
		personList.add(new Person("D", 40));
		
		System.out.println(personList);
		
		for (int i = 0; i < personList.size(); i++) {
			personList.remove(i);
		}
		System.out.println(personList);
		
		//iterator 사용
		Iterator<Person> personit = personList.iterator();
		
		// 다음 아이템(요소)이 있으면 반복해라
		while(personit.hasNext()){
			Person temp = personit.next();	// 다음 값을 리턴 후 반복자 이동
		
			if(temp.getName().equals("A") || 
					temp.getName().equals("B") || 
					temp.getName().equals("C")){
				personit.remove();				// 현재 내가 가리키고 있는 요소를 삭제한다.
			}
		}
		System.out.println(personList);
	
		for (int i = 0; i < personList.size(); i++) {
			System.out.println(personList.get(i));			
		}
	
		//	전체 탐색을 할 때는 인덱스보다 for each문을 활용하는 것이 좋다.
		// * 특히 LinkedList에서의 전체 탐색은 인덱스가 아닌 for each 또는
		// iterator를 이용하자.
		
		// for each문은 실제로 iterator가 움직인다.
		for(Person p : personList){
			System.out.println(p);
		}
	}
}
