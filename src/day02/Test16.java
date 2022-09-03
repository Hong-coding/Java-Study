package day02;

public class Test16 {

	public static void main(String[] args) {
		//
		
		int a = 20;
		boolean b = true;
		if(false) {
			System.out.println("a는 10보다 크다");
		}
		System.out.println("실행 끝");
		
		if(a-10 > 10) {
			System.out.println("hello");
		}
		
		int score = 50;
		// 점수가 60점 이상이면 "합격", 아니면 "불합격" 출력
		if (score>=60) {
			System.out.println("합격");
		}
		if (score<60) {
			System.out.println("불합격");
		}
//		else { // 두 상황중 반드시 하나에만 해당하는 모순인 경우니까 더 간단한 else로 가능
//			System.out.println("불합격");
//		}
	}

}
