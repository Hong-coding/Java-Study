package day12;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashTest05_엔트리셋 {

	public static void main(String[] args) {

		HashMap map = new HashMap();
		map.put("김피카츄", 100);
		map.put("이꼬북이", 100);
		map.put("박라이츄", 80);
		map.put("최아이언", 90);

		// 키셋말고 엔트리셋으로 해보자. 키셋은 키만 , 엔트리셋은 쌍으로
		Set set = map.entrySet();
//		System.out.println(set);
		Iterator it = set.iterator(); //반복자 얻기
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			System.out.println("이름 : "+ e.getKey() +", 점수 :" + e.getValue());
		}
		System.out.println("참가자 명단 : " +map.keySet());
		
		//총점
		int tot = 0;
		Collection values = map.values();
		it = values.iterator();
		while(it.hasNext()) {
			int i = (Integer)it.next();
			tot += i;
		}

		System.out.println("총점 : "+ tot);
		System.out.println("총점 : "+ tot/set.size());
		System.out.println("최고 점수 : "+ Collections.max(values)); //values로 찾아올 경우 중복값이 있을 경우 정확한 정보를 찾기 어려워진다.
		System.out.println("최고 점수 : "+ Collections.min(values));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
