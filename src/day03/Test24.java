package day03;

public class Test24 {

	public static void main(String[] args) {
		// for문
		
		for(int i = 0; i<5 ; i++) { //증감식이 빠지면 무한반복됨
			System.out.println("hello");
		}
		for(int i =0 ; i<=10 ; i++) { //for 문 내의 변수는 그 외부에서는 쓸 수 없어서 for문마다 써도 오류가 나지 않는다.
			// 변수의 scope 유효범위 (class에서 배울 내용)
			System.out.println(i);
		}

	}

}
