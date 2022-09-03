package codingTest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

//참가자 다수
//참가자 - 완주자 비교해서 없는 한명 찾아내기
//이름은 중복될 수 있다
//Sorting과 Loop를 이용한 솔루션 1
//Hash를 이용한 솔루션2
//class Solution {
//	public String solution(String[] participant, String[] completion) {
//		String answer="";
//		return answer;
//	}; 
//	  
//	public static void main(String[] args) {
//		String[] part = {"leo", "kiki", "eden"};
//		String[] comp = {"eden", "kiki"};
//		Solution sol = new Solution();
//		System.out.println(sol.solution(part,comp));
//	}
//}


//해설
// 1. 알파벳순서로 sorting(정렬)한 후 
// 2. 두 리스트 비교하여 달라지는 지점의 선수를 반환 (이름이 중복되어도 적용됨)
// 3. 예외처리 : 루프를 다 돌았는데 발견하지 못한 경우 맨 마지막 사람을 반환
class Solution {
	public String solution(String[] participant, String[] completion) {
		/* 직관적으로	
		String answer="";
		
		// 1. 두배열을 sort ★★★★★★★★★★★★
		Arrays.sort(participant); 
		Arrays.sort(completion); 
		// 2. 배열 비교
 		for(int i = 0; i < completion.length ; i++) {
//			if(participant[i]!=completion[i]) { //string은 기호로 비교 불가함 ★★★★★★★★★★★★★★★★★★★★★★★★ 근데 결과는 나오네?
			if(!participant[i].equals(completion[i])) {
				answer = participant[i]; //이렇게 해도 되고 return participant[i]; 이렇게 해도됨, 그럼 마지막에 return answer이 약간 애매해지긴함
			}else {
				answer = participant[i+1];
			}
		}
 		return answer;
		 */
//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		/* 좀더 간결하게
		String answer="";

		int i=0;
		for(; i < completion.length ; i++) {
			if(!participant[i].equals(completion[i])) {
				break; // 다르면 그 때 반복문을 빠져나가고 i가 반복문 밖으로 선언되어 있으니까 i는 어디까지 갔는지 저장이 되어있음
			}
		}
		//여기까지 왔다면 , 배열을 다 돌고 나왔다면 i = completion.length 마지막 인덱스가 됨!!!★★★★★★★★★★★★★★★★★★★★★★★★ 
		return participant[i];
		 */
//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		/*해시를 활용해서 문제 풀기*/
		
		String answer="";
		//1. 해시만들기(key:선수이름, value의 카운트1(있다)를 갖는다) -> 2. 해시빼기(completion에 존재하는 선수의 hash를 뺀다) ->3. value가 남은 선수가 완주하지 못한 선수가 된다.
		//찾을 때 매번 정렬을 하는 게 아니라 효율적으로 특정 키값을 불러서 해당 밸류를 바로 뽑아낼 수 있는 것
		//1. 해시만든다 (participation배열기반) 
		HashMap<String, Integer> map = new HashMap<>();//키와 밸류의 타입을 <>안에 명시한다!
		for(String p : participant){//participant에 있는 모든 선수들을 그 안에 더해준다!!
			map.put(p, map.getOrDefault(p, 0)+1);//key: value를 맵에 넣어달라/ 동명이인이 있을 수 있어서 값을 1씩 증가시킬 때 유용한 getOrDefault
			//			맵에서, p키를 가진 값을 가져와라, 만약 없으면0을달라, +1해라
		}
		//System.out.println(map); //맵에 어떤게 들어갔나 확인쓰
		
		//2. 해시뺀다 (completion배열내용을)
		for(String p : completion) {
			map.remove(p); //요소를 삭제할수도 있고
//			map.put(p, map.get(p)-1); // 이렇게 하면 덮어쓰기처럼 껍데기는 남아있게 됨
			//		맵에서, p의 값을 가져와라
		}
		System.out.println(map);
		
		//3. value가 0이 아닌 선수명을 구한다 (keySet()함수의 사용방법)
//		answer = map.keySet();
//		for(String key : map.keySet()){ //맵에서 꺼낸 키들로 만든 배열 . 해시맵이 인덱스없어서 배열을 만드는것
//			if(map.get(key)==1) answer = key; //map.key아님 map.get(key)
//			//	맵에서, key의 값을 가져와라
//			break; // 이 동작이 없으면 중간에 찾아도 끝까지 돌고나서 빠져나가게 됨.
//		}
		/* 엔트리셋이 좀더 빠르니까 그거 써보자
		 */
		Iterator<Map.Entry<String, Integer>> iter = map.entrySet().iterator();
		while(iter.hasNext()) {
			Map.Entry<String, Integer> entry = iter.next();
			if(entry.getValue() != 0) {
				answer = entry.getKey();
				break;
			}
		}
		return answer;
		
//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

		/*코드 복기
		 
		String answer = "";
		HashMap<String, Integer> map = new HashMap<>();
		for(String p:participant) {
			map.put(p, map.getOrDefault(p, 0)+1);
		}
		for(String p:completion) {
			map.put(p, map.get(p)-1);
		}
		System.out.println(map);
		for(String key:map.keySet()) {
			if(map.get(key)==1) {
				answer = key;
				break;
			}
		}
		return answer;
		 */
		//정리
		//HashMap<키타입,밸류타입> map = new HashMap<>();
		// map.put(실제키,실제밸류);
		// map.get(실제키); 밸류값 가져오기
		// map.getOrDefault(실제키); 맵의 오리지널 밸류 가져오기
		// map.KeySet(); 키값들로 구성된 배열만들기
		// 키를 뽑아내려면 키로 구성된 배열을 만들어서 키 자체를 반환하면 됨. 
//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		
	}; 
		
	
	public static void main(String[] args) {
		String[] part = {"leo", "kiki", "eden"};
		String[] comp = {"eden", "kiki"};
		Solution sol = new Solution();
		System.out.println(sol.solution(part,comp));
		
		
	}
	
}
