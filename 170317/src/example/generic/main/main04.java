package example.generic.main;

import java.util.ArrayList;

public class main04 {

	public static void main(String[] args) {
		// List 계열의 컬렉션 프레임워크
		// 1) 자료의 저장 순서가 있다.(인덱스를 사용할 수 있다.)
		// 2) 중복된 자료의 저장이 가능하다.
		//
		//	=> ArrayList,Linked List
		//	ArrayList : 배열 기반
		//	 데이터가 추가될 때마다 배열을 새로 만들고 전에 있던 데이터를 복사
		//	LinkedList : 연결리스트 기반
		//	 데이터를 추가하면 노드가 하나 늘어난다.(노드끼리 연결)
	
		ArrayList<String> arrList = new ArrayList<>();
		// 1) add : 요소(원소) 추가
		// 2) remove : 삭제
		// 3) get : 참조하기(가져오기)
		// 4) set : 바꾸기(수정)
		
		arrList.add("B");
		arrList.add("C");
		arrList.add("A");
		
		// List의 길이를 얻는 메소드 -> arrList.size();
		for (int i = 0; i < arrList.size(); i++) {
			System.out.println(arrList.get(i));
		}
		
		// 수정
		arrList.set(2, "D");
		System.out.println(arrList);
		
		arrList.remove(1);
		System.out.println(arrList);
		
		arrList.remove("D");
		System.out.println(arrList);
	
		System.out.println("Hi".toUpperCase());
		
		
		arrList.add("B");
		arrList.add("B");
		arrList.add("F");

		System.out.println(arrList);
	
	}
}
