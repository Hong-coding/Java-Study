package day04;

public class Test47_random {

	public static void main(String[] args) {
		// 랜덤 : 난수 : 임의의 수
		// 수학연산 관련 클래스, 기본 패키지 안에 들어있어서 임포트가 필요없음(내장클래스).
			//java.lang.Math  클래스 내부의 .random()메서드
			//.random() 0<= , <1 실수값을 반환함. 정수의 랜덤값이 필요하다면 응용해야 *10^n , -> int로 형변환

//		// 0~9 사이 값
//		for(int i = 0; i < 10; i++) {
////			System.out.println((int)(Math.random()*10)); 
//			
//		}
//
//		// 1~10 사이 값
//		for(int i = 0; i < 10; i++) {
//			System.out.println((int)(Math.random()*10)+1); 
//			
//		}
		// 1~8 사이 값
//		for(int i = 0; i < 10; i++) {
//			System.out.println((int)((Math.random()*8)+1)); 
		
			//System.out.println((int)(Math.random()*9)); //이건 0~8사이 값
//			
//		}
//		
		// 13~29 사이 값
		for(int i = 0; i < 10; i++) {
//			System.out.println((int)(Math.random()*(29-13+1)+13)); 	
			//System.out.println((int)(Math.random()*(29-13)+13)); 	// 이건 28까지밖에 안나옴
		}
		
	}

}
