package example.generic.main;

import java.util.HashMap;

public class main10 {

	public static void main(String[] args) {
		// HashMap -> 웨브 빅데이터, 안드로이드 등 모든 곳에서 제일 많이 사용됨
		// 컨텐츠 용도가 아닌 실제 데이터를 전송 또는 수신할 때 많이 사용된다.
		// (JSON, BSON)
		// Key => Value 방식

		// 저장시에는 : 키-값 쌍으로 저장
		// 참조시에는 : 키를 넣어서 값을 참조한다.
		HashMap<String, String> hashMap = new HashMap<>();
		hashMap.put("ID", "userid01");
		hashMap.put("PW", "userpw01");

		String id = hashMap.get("ID");
		String pw = hashMap.get("PW");

		System.out.println(id);
		System.out.println(pw);

		// Key는 Set 방식으로 저장
		// Value는 ArrayList 방식으로 저장

		hashMap.put("ID", "뭐야");
		id = hashMap.get("ID");

		System.out.println(id);
		System.out.println(pw);

		hashMap.put("PW", "뭐야");
		pw = hashMap.get("PW");

		System.out.println(id);
		System.out.println(pw);

	}

}
