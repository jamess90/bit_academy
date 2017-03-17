package example.generic.main;

import java.util.HashSet;

public class main07 {

	public static void main(String[] args) {
		
		// set
		// -> 자료가 중복되지 않고, 순서가 없다.
		// hash 알고리즘에 의한 데이터들의 배치(HashSet)
		// tree 정렬 기준에 의한 데이터들의 배치(TreeSet)
		
		HashSet<String> hashSet = new HashSet<>();
		hashSet.add("Banana");
		hashSet.add("Apple");
		hashSet.add("Grape");
		hashSet.add("Orange");
		hashSet.add("Melon");
		
		System.out.println(hashSet);
		
	}
	
	
}
