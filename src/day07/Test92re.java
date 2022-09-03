package day07;

import java.util.Scanner;

/*
하루할일을 표현하는 클래스 Day는 아래와 같다. (수정할것 없음. 그대로 사용) 
한달의 할일을 표현하는 MonthSchedule 클래스를 작성하세요. 
MonthSchedule 클래스에는 Day 객체 배열과 적절한 변수, 메서드를 작성하고
실행예시처럼 입력, 보기, 끝내기 등의 기능을 작성하세요. 
-> 생성자, input(), view(), finish(), run() 메서드 만들기. 
#실행예시#
이번달 스케쥴 관리 프로그램
할일(입력:1, 보기:2, 끝내기:3) >>   1 (사용자가 입력) 
날짜(1~28)? >>  1 (<-사용자 입력) 
할일? >>  자바공부 (<-사용자 입력)

할일(입력:1, 보기:2, 끝내기:3) >>   2  
날짜(1~28)? >>  1  
1일의 할 일은 자바공부입니다.    (할일이 없을경우 : 1일의 할 일은 없습니다.) 

할일(입력:1, 보기:2, 끝내기:3) >> 3
프로그램 종료.
*/
class Day2 {
	private String work; // 하루의 할일을 저장할 변수 
	public void set(String work) { this.work = work; }
	public String get() { return work; }
	public void show() {
		if(work == null) System.out.println(" 없습니다.");
		else System.out.println(work + "입니다.");
	}
}
class MonthSchedule2 {
	//변수
	int date;
	Day2[] days;
	int num;
	Scanner sc = new Scanner(System.in);
	//생성자ㅡ 초기화
	MonthSchedule2(int num){
		this.num = num; //필수필수ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ★★★★★★★★★★★★★★★★★★★★★★★★★
		days = new Day2[num]; // 	[num]수의 방만들기
		for(int i = 0; i < num; i++) { //★★★★★★★★★★★★★★★★★★★★★★★★★객체를 만들지 않으면 값을 저장할 공간이 없게 됨
			days[i] = new Day2();
		}
		
	}
	//메서드
	void input() {
		
		System.out.println("날짜(1~28)? >> ");
		date = Integer.parseInt(sc.nextLine());
		if(date-1 < 0 || date > num) {			
			System.out.println("날짜를 잘못 입력했습니다. 다시 ");
			input();
			return;
		}
		System.out.println("할일? >> ");
		String work = sc.nextLine();
		days[date-1].set(work);
		
		

	}
	void view() {
		System.out.println("날짜(1~28)? >> ");
		date = Integer.parseInt(sc.nextLine());
		if(date < 0 || date > 28) {
			System.out.println("날짜를 잘못 입력했습니다. 다시 ");
			view();
			return;
		}
		System.out.print(date+"일의 할 일은 ");
		days[date-1].show();
	}
	void finish() {
		System.out.println("종료");
		return;
	}
	void run() {
		System.out.println("이번달 스케쥴 관리 프로그램");
		while(true) {
			System.out.println("할일(입력:1, 보기:2, 끝내기:3) >> ");
			int selec = Integer.parseInt(sc.nextLine());
			switch(selec) {
			case 1: input(); break;
			case 2: view(); break;
			case 3: finish(); return;
			default: System.out.println("잘못 입력했습니다. 다시 입력해주세요");
			}
		}
	}
}
public class Test92re {

	public static void main(String[] args) {
		

		// main 작성 완료.
		MonthSchedule2 fab = new MonthSchedule2(28); // 2월은 28일  
		fab.run(); 
			
			
		
	}

}
