package example.generic.main;

import java.util.HashSet;

public class main07 {

	public static void main(String[] args) {
		
		// set
		// -> �ڷᰡ �ߺ����� �ʰ�, ������ ����.
		// hash �˰��� ���� �����͵��� ��ġ(HashSet)
		// tree ���� ���ؿ� ���� �����͵��� ��ġ(TreeSet)
		
		HashSet<String> hashSet = new HashSet<>();
		hashSet.add("Banana");
		hashSet.add("Apple");
		hashSet.add("Grape");
		hashSet.add("Orange");
		hashSet.add("Melon");
		
		System.out.println(hashSet);
		
	}
	
	
}
