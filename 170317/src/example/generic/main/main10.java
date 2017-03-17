package example.generic.main;

import java.util.HashMap;

public class main10 {

	public static void main(String[] args) {
		// HashMap -> ���� ������, �ȵ���̵� �� ��� ������ ���� ���� ����
		// ������ �뵵�� �ƴ� ���� �����͸� ���� �Ǵ� ������ �� ���� ���ȴ�.
		// (JSON, BSON)
		// Key => Value ���

		// ����ÿ��� : Ű-�� ������ ����
		// �����ÿ��� : Ű�� �־ ���� �����Ѵ�.
		HashMap<String, String> hashMap = new HashMap<>();
		hashMap.put("ID", "userid01");
		hashMap.put("PW", "userpw01");

		String id = hashMap.get("ID");
		String pw = hashMap.get("PW");

		System.out.println(id);
		System.out.println(pw);

		// Key�� Set ������� ����
		// Value�� ArrayList ������� ����

		hashMap.put("ID", "����");
		id = hashMap.get("ID");

		System.out.println(id);
		System.out.println(pw);

		hashMap.put("PW", "����");
		pw = hashMap.get("PW");

		System.out.println(id);
		System.out.println(pw);

	}

}
