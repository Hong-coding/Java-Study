package day10;

public class TestEx03 {

	public static void main(String[] args) {

		
		int num = 100;
		int result = 0;
		// for 문 밖에서 에러 잡으면 for문을 다 돌지 않고 종료
//		try {
//			for(int i = 0; i < 10; i++) {
//				//ArithmeticException : 랜덤이 0이 나오면 터지는 예외
//				result = num / (int)(Math.random()*10);
//				System.out.println(result);
//			}
//			
//		}catch(ArithmeticException e) {
//			System.out.println("0 발생");
//		}
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		//for 문 안으로 넣으면 에러 발생해도 실행을 다 시킨다음 종료
			for(int i = 0; i < 10; i++) {
				try {
					//ArithmeticException : 랜덤이 0이 나오면 터지는 예외
					result = num / (int)(Math.random()*10);
					System.out.println(result);
				}catch(ArithmeticException e) {
					System.out.println("0 발생");
				}
			}
			
			
		System.out.println("프로그램 종료");
	}

}
