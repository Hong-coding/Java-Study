package day02;

public class Test14 {

	public static void main(String[] args) {
		
		// 비교연산자 : < <= > >= == != 
		// 결과값은 true, false 둘 중 하나
		int a = 10;
		int b = 0;
		
//		System.out.println(a>b); // print명령은 개발자확인용임
		boolean result = a > b + 10 ; // true false 타입을 담을 수 있는 게 불리안이라 변수를 불리안 타입으로 만들어야 함// 연산의 순서는 산술이 먼저인데 보기 좋게 괄호를 넣는게 바람직함
		//boolean result = a >= b + 10 ; 
		//boolean result = a != b + 10 ; 
		System.out.println(result);
		
		// 논리연산자 : && || 
		// 동시에 있는 경우 &&연산자부터 
		// A && B : A와 B 둘다 참이어야 참.

		result = a > b && a > 5; // 10>0 && 10>5 true
		result = a > b && a < 5; // false
		result = a > b || a < 5; // true
		
		result = a > 20 && a > b || a > 5; //false && true || true  ===> true
		result = a > 20 || a > b && a < 5; //false || true && flase ===> false
		
		
		// 삼항연산자 : 조건식 ? 참일 때 값 : 거짓일 때 값; 
		// if 문으로 가능해서 별로 안씀
		int res = a > b ? a : b ;
		System.out.println("res: " +res);
		char resch = a > b ? 'O' : 'X'; //홑따옴표니까 캐릭터 변수로 담아줘보자
		System.out.println(resch);
		
		
		
		
	}

}
