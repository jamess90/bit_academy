package example.generic.main;

import java.util.ArrayList;

public class main04 {

	public static void main(String[] args) {
		// List �迭�� �÷��� �����ӿ�ũ
		// 1) �ڷ��� ���� ������ �ִ�.(�ε����� ����� �� �ִ�.)
		// 2) �ߺ��� �ڷ��� ������ �����ϴ�.
		//
		//	=> ArrayList,Linked List
		//	ArrayList : �迭 ���
		//	 �����Ͱ� �߰��� ������ �迭�� ���� ����� ���� �ִ� �����͸� ����
		//	LinkedList : ���Ḯ��Ʈ ���
		//	 �����͸� �߰��ϸ� ��尡 �ϳ� �þ��.(��峢�� ����)
	
		ArrayList<String> arrList = new ArrayList<>();
		// 1) add : ���(����) �߰�
		// 2) remove : ����
		// 3) get : �����ϱ�(��������)
		// 4) set : �ٲٱ�(����)
		
		arrList.add("B");
		arrList.add("C");
		arrList.add("A");
		
		// List�� ���̸� ��� �޼ҵ� -> arrList.size();
		for (int i = 0; i < arrList.size(); i++) {
			System.out.println(arrList.get(i));
		}
		
		// ����
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
