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
class Day {
	private String work; // 하루의 할일을 저장할 변수 
	public void set(String work) { this.work = work; }
	public String get() { return work; }
	public void show() {
		if(work == null) System.out.println(" 없습니다.");
		else System.out.println(work + "입니다.");
	}
	public String getWork() {
		return work;
	}
	public void setWork(String work) {
		this.work = work;
	}
	
}
class MonthSchedule {
	int nDays ; //매개변수인 지역변수는 별개지만,  변수 선언 해줘야 함★
	Scanner sc = new Scanner(System.in);
	Day[] month;
	
	MonthSchedule(int nDays) {//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ초기화까지만 여기 넣고 바로 실행되는 뒷부분은 run()에
		this.nDays = nDays;//인자로 들어온거를 nDays변수에 넣어놔야 함
		month = new Day[nDays]; // 입력받은 숫자만큼의 배열 만들기
		for(int i = 0; i< nDays; i++){// 만든 방에 개별 객체 넣어두기
			month[i] = new Day(); 
		}
		
		

	}
	void input() {
		System.out.println("날짜(1~28)? >> ");
		int nDays = Integer.parseInt(sc.nextLine());
		System.out.println("할일? >> "); //work변수에 저장. 새로 변수선언 해줘야함 ★
		String work = sc.nextLine();

		month[nDays-1].set(work); // ★★값 저장. 여기서 인식할 수 있게 선언을 클래스 바로 아래! 다른 메서드 아래X
		
	};
	void view() {
		System.out.println("날짜? >> ");
		int nDays = Integer.parseInt(sc.nextLine());
		if(nDays <= 0 || nDays > 28) {
			System.out.println("날짜를 잘못 입력했습니다. 다시 ");
			input();
			return;
		}
		int day = Integer.parseInt(sc.nextLine());
		System.out.print(day +"일의 할 일은 ");
		month[day-1].show();
	};
	void finish() {System.out.println("프로그램 종료");sc.close();}; //여기서 sc닫아줌
	void run() {
		//Day todo = new Day();// 객체생성은 초기화에. 날짜 받아서 개별 방에 만들어야 함
		System.out.print("이번달 스케쥴 관리 프로그램\r\n"+ ""); //초기화보다는 run()으로
		while(true){//반복할 부분은 while로 넣는다
			System.out.println("할일(입력:1, 보기:2, 끝내기:3) >> ");
			int selec = Integer.parseInt(sc.nextLine());
			switch(selec){
			case 1: input(); break;
			case 2: view(); break;
			case 3: finish(); return;//break;로 입력하면 에러남. ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ?
			default: System.out.println("잘못 입력했습니다. 다시 입력하세요");
			//input(); break;// while문 안에 들어왔으니까 여긴 필요없음
		}
		
		}
	};
	
}
public class Test92_scheduler {
	public static void main(String[] args) {

		// main 작성 완료.
		MonthSchedule fab = new MonthSchedule(28); // 2월은 28일  
		fab.run(); 
		
		
	}
}