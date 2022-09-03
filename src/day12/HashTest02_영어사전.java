package day12;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class HashTest02_영어사전 {
	
	String eng;
	HashMap<String, String> h;
	Scanner sc;
	// 생성자
	HashTest02_영어사전(){
		sc = new Scanner(System.in);
		h = new HashMap<String, String>();
		
//		for(int i = 0; i <3; i++) {
//			System.out.println("영어 입력>>");
//			String eng = sc.nextLine();
//			System.out.println("뜻 입력>>");
//			String kor = sc.nextLine();
//			h.put(eng, kor);// 1.요소 넣기
//		}
		h.put("apple", "사과");
		h.put("strawberry", "딸기");
		h.put("watermelon", "수박");
		h.put("peach", "복숭아");

		System.out.println(h.entrySet()); // 전체 출력
	
	
	}
	// 메서드
	void find(String eng){
		if(h.containsKey(eng)) {
			System.out.println(h.get(eng));
//		}else {
		}else if(h.get(eng)==null) {
			System.out.println("단어 목록에 없습니다~");			
		}
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashTest02_영어사전 h = new HashTest02_영어사전();

//		boolean stop = true;
		while(true) {
			System.out.print("찾을 영어단어를 입력하세요~ >>");
			String que =sc.nextLine(); 
//			if (que == "exit") {
			if(que.equals("exit")) { //★문자열비교는 ==으로 안합니다.
//				stop = false;
				break;
			}else {
				h.find(que);
				
			}
			
		}
		System.out.println("프로그램 종료되었습니다");
		
		
		
		
		
		
		
	}

}
