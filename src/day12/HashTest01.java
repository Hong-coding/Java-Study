package day12;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashTest01 {

	public static void main(String[] args) {

		//객체 생성
		HashMap<String, String> h = new HashMap<String, String>();
		
		//요소 저장 add 아님
		h.put("apple", "사과");
		h.put("strawberry", "딸기");
		h.put("watermelon", "수박");
		h.put("peach", "복숭아");

		// 요소 꺼내기
		String v = h.get("apple");
		System.out.println(v);
		v = h.get("peach"); //재사용
		System.out.println(v);
		
		// 요소지우기
		h.remove("strawberry"); // 지우는 거 출력 한번 해줌
		System.out.println(h);
		
		// 저장된 요소 개수
		System.out.println(h.size());
		
		// 전체 요소에 접근해서 Key와 Value를 모두 출력
		Set<String> keys = h.keySet(); //인덱스 없으니까 키들만 다 모아서 
		Iterator<String> it = keys.iterator(); // 반복자얻기
		while(it.hasNext()) {
			String key  = it.next(); // 키하나 꺼내기
			String value = h.get(key); // 키로 value 꺼내기
			System.out.println("{" +key + ":"+ value +"}");
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
