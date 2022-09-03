package day02;

public class Test12 {

	public static void main(String[] args) {
		
		// 사칙연산 : + - * / %
		int a = 10 + 10 ; 
		System.out.println(a);
		
		int b = 10 % 4;
		System.out.println(b);
		
		int c = 10 / 3;
		System.out.println(c); // int 3만 나옴
		
		// overflow
//		int d = 100000 * 100000; // 100억이라 21억 넘음
		long d = 100000 * 100000L; //int로 받고싶으면 둘중 하나를 인트로 바꿔줘야함 (우리나라 수 단위 크니까 연산시 주의해야 함.)
		System.out.println(d);
		
		

	}

}
