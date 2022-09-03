package day12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.Vector;

/*
	HashMap을 이용하여 학생이름과 자바 점수를 기록하는 관리 프로그램을 만드세요. 
	아래 프로그램 메뉴에서 각 번호로 서비스를 선택하고, 6번을 입력받으면 프로그램 종료. 
	*** 자바 성적 관리 프로그램 ***
	1. 전체 조회
	2. 등록
	3. 수정
	4. 삭제
	5. 전체 평균
	6. 프로그램 종료 
	
*/
class ManageScore {
	Scanner sc;
	String name;
	int score;
	HashMap<String,	Integer> h;
	
	//생성자 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ 여기서는 생성자를 어떻게 쓸까...?
	ManageScore(){
		h = new HashMap<String, Integer>();//여기서 객체생성해보자
		sc = new Scanner(System.in);
	}
	
	public void run() {
		System.out.println("*** 자바 성적 관리 프로그램 ***\r\n"
				+ "	1. 전체 조회\r\n"
				+ "	2. 등록\r\n"
				+ "	3. 수정\r\n"
				+ "	4. 삭제\r\n"
				+ "	5. 전체 평균\r\n"
				+ "	6. 프로그램 종료 \r\n");		
		while(true) {
			System.out.println( "메뉴를 선택하세요. >>"	);	
			int num = Integer.parseInt(sc.nextLine());
			
			if(num==1)	view();
//				return;
			else if (num==2) enroll();
//				break; // 등록하고 반복문이 종료되니까 안됨
			else if (num==3) modify();
			else if(num==4) del();
			else if(num==5) avg();
			else if(num==6) {
				finish();
				break;
			}else { // 예외추가
				System.out.println("잘못된 번호 입력");
			}
		}
	};
	void view() {
		//System.out.println(h.get(1));//idx값으로 가져오려고 하면 null이 됨. key로 가져와야함.
		System.out.println(h.entrySet());
//		System.out.print("현재 명단에 있는 사람은 ");
//		if(h.isEmpty()) {
//			System.out.println("없습니다.");
//		}else {
//			for(int i = 0; i < h.size(); i++) {
//				System.out.print(h.get(i)+ " "); // 
//			}
//			System.out.println("입니다.");
//		}
		Iterator<String> it = h.keySet().iterator();  //set타입 순서도중복없는 keySet으로 뽑아서 set으로 받은 다음에/ 반복자얻어... 모두접근할 때 keySet이용
		/*ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		while(it.hasNext()) {
			name = it.next();
			score = h.get(name);
			System.out.println(name +" " +score);
		}*/
		
		//더 개선
		if(it.hasNext()) {
			while(it.hasNext()) {
				
			}
		}else {
			System.out.println("저장된 학생 정보가 없습니다.");
		}
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
	}

	private void enroll() {
		
		
		System.out.println("학생 이름 >> ");
		String name = sc.nextLine();
		System.out.println("자바 점수 >> ");
		int score = Integer.parseInt(sc.nextLine());
		h.put(name, score);//"name" 아님
		//중복검사
		Set<String> keys = h.keySet();
		if(keys.contains(name)) {
			System.out.println("이미 존재하는 학생입니다. 이름을 다시 입력해주세요");
			enroll();
			//return;
		}else {
			h.put(name, score);
			System.out.println("저장완료");
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		}
	
	}

	private void modify() { //모두 private으로 수정ㅡㅡㅡㅡㅡ

		System.out.println("학생 이름 >> ");
		String name = sc.nextLine();
		
		Set<String> keys = h.keySet();
		if(keys.contains(name)) {
			h.put(name, score);
			System.out.println("수정완료");
		}else {
			System.out.println("존재하지 않는 학생입니다.");
		}
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
	}

	private void del() {
		for(int i = 0; i < h.size(); i++) {
			System.out.print("명단 :" + h.get(i));
			
		}
		System.out.println("삭제할 사람 >> ");
		
	}

	private void avg() {
		double sum = 0;
		for(int i = 0; i < h.size(); i++) {
			sum += h.get(name);
		}
		System.out.println("전체 평균은 " + (sum/h.size())+"점 입니다.");
	}

	private void finish() {
		System.out.println("프로그램 종료합니다.");
		sc.close();
		
	}
	
}
public class CollEx04 {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
		ManageScore p = new ManageScore();  
		
		
		
		p.run();

		
		
	}
}
