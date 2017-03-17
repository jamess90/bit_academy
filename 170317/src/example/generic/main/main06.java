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
		
		//iterator ���
		Iterator<Person> personit = personList.iterator();
		
		// ���� ������(���)�� ������ �ݺ��ض�
		while(personit.hasNext()){
			Person temp = personit.next();	// ���� ���� ���� �� �ݺ��� �̵�
		
			if(temp.getName().equals("A") || 
					temp.getName().equals("B") || 
					temp.getName().equals("C")){
				personit.remove();				// ���� ���� ����Ű�� �ִ� ��Ҹ� �����Ѵ�.
			}
		}
		System.out.println(personList);
	
		for (int i = 0; i < personList.size(); i++) {
			System.out.println(personList.get(i));			
		}
	
		//	��ü Ž���� �� ���� �ε������� for each���� Ȱ���ϴ� ���� ����.
		// * Ư�� LinkedList������ ��ü Ž���� �ε����� �ƴ� for each �Ǵ�
		// iterator�� �̿�����.
		
		// for each���� ������ iterator�� �����δ�.
		for(Person p : personList){
			System.out.println(p);
		}
	}
}
