package day07;

import java.util.Scanner;

/*
	Grade 클래스를 작성해보세요.
	3과목의 점수를 입력받아 Grade 객체를 생성하고, 
	성적 평균을 출력하는 main()메서드와 실행예시는 아래와 같습니다. 
	콘솔 출력예 >> 
		수학, 과학, 영어 점수를 입력하세요. 
		수학 >>  90 (<-사용자가 입력) 
		과학 >>  88
		영어 >>  96 
		평균은 91
*/
class Grade{
	// 변수 - 생성자에게 던져줄 값을 받을 변수가 필요함. 보존할 변수가 존재해야 함. 초기화시 단발성으로 쓰려고 만드는 게 아니라면 
	int math;
	int sci;
	int eng;
	// 생성자 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ 초기화
	Grade(int math, int sci, int eng){
		this.math = math; this.sci = sci; this.eng = eng; 	// 인스턴스변수가 갖는 자기 공간에 전달받은 값을 보존.
	}
	//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ매개변수가 있는 생성자를 만들었다면 기본생성자도 작성해줘야 함.습관.
	// 메서드
	
	public double getAvg(){ 						// ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ호출할 메서드를 클래스 안에 만들어줘야. 결과를 돌려줘야. 
		return ((math+sci+eng)/3.0); 	//더블로 바꾸자
				
	}
	
	
}
public class Test86 {
	public static void main(String[] args) {
		// main 작성 완료 상태
		Scanner sc = new Scanner(System.in);
		System.out.println("수학, 과학, 영어 점수를 입력하세요.");
		System.out.println("수학 >> ");
		int math = Integer.parseInt(sc.nextLine());
		System.out.println("과학 >> ");
		int sci = Integer.parseInt(sc.nextLine());
		System.out.println("영어 >> ");
		int eng = Integer.parseInt(sc.nextLine());
		Grade me = new Grade(math, sci, eng);		//입력받은 값을 저장한 변수를 던져줌
		System.out.println("평균은 " + me.getAvg());
		
		sc.close();
		
	}
}
