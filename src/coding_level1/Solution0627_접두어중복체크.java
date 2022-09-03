package coding_level1;

import java.util.Arrays;
import java.util.HashMap;

public class Solution0627_접두어중복체크 {
	// 정렬을 이용한 풀이 - 2번 부분이 너무 개인적으로 지저분해부임.... 
		public boolean Solution0627_접두어중복체크(String[] phone_book) {
			//1. phone_book을 정렬한다
			Arrays.sort(phone_book);
			for(String a : phone_book) {
				System.out.println(a);
			}
			//2. 1중루프로 일련번호가 뒷번호의 접두어인지 확인 . 
			for(int i = 0; i<phone_book.length -1; i++) {
				if(phone_book[i].length()<phone_book[i+1].length()) {
					if(phone_book[i]
							.equals(phone_book[i+1]
									.substring(0,phone_book[i].length())
									.toString())) {
						return false;
					}			
					
				}
			}
		
			
			return true;
		}
	/*
	// 정렬을 이용한 풀이 - 간단쓰
	public boolean Solution0627_접두어중복체크(String[] phone_book) {
		//1. phone_book을 정렬한다
		Arrays.sort(phone_book);
		//2. 1중루프로 일련번호가 뒷번호의 접두어인지 확인
		for(int i = 0; i<phone_book.length -1; i++) {
			// String 을 몇번째 자리까지 잘라서 동일한지 비교 - splice?? 배열?? substring
			// string의 메서드 startwith
			if(phone_book[i+1].startsWith(phone_book[i])) {
				return false;
			}			
		}
	
		
		return true;
	}
	
	
	// 해시를 이용한 풀이
	public boolean Solution0627_접두어중복체크(String[] phone_book) {
		// 1. 해시맵, 해시맵 전화번호부를 만든다. 
		HashMap<String, Integer> map = new HashMap<>();
		for(String number: phone_book) {
			map.put(number, 1);
		}
		
		// 2. 각 접두어가 해시맵에 있는지 체크
		for(int i = 0; i< phone_book.length; i++) {
			for(int j = 1; j<phone_book[i].length()-1; j++) {
				if(map.containsKey(phone_book[i].substring(0,j))) {
					return false;
				}
			}
		}
		
		return true;
	}
	*/
	
	public static void main(String[] args) {
		String[] phone_book = {"12", "6", "6789"};
		Solution0627_접두어중복체크 sol = new Solution0627_접두어중복체크();
		System.out.println(sol.Solution0627_접두어중복체크(phone_book));
		
	}
	
}
