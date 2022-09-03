package day06;
//계산기 클래스 : 정수 두개를 입력받아 결과를 리턴 + - * / sum, sub, mul, div 메서드 가지고 있는 클래스 만들기. (인스턴스메서드로)
class Cal {
	int sum (int a, int b) {
		int sum = a + b;
		return sum;
	}
	int sub (int a, int b) {
		return a-b;
	}
	int mul (int a, int b) {
		return a*b;
	}
	double div(int a, int b) { // 실수로 나올 수 있게 double로  ★
		if (b==0) {
			System.out.println("0으로 나눌 수 없습니다."); // 0으로 나눴을 경우 예외처리 해야!   ★
			return 0;
		}else {	// 안묶어도 밑에 문장 타니까 상관없음.
			return (double)a/b;	// 둘 중 하나 더블로 형변환
		}
	}
	
}



public class Test62_계산기와예외처리 {

	public static void main(String[] args) {
		
		// 사칙연산 실행
		Cal c = new Cal(); // 객체생성
		System.out.println( c.sum(2,3));
		System.out.println( c.sub(6,2));
		System.out.println( c.mul(6,2));
		System.out.println( c.div(2, 0));
		
		
	}

}
