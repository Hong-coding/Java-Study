package day06;

class TestB {
	//입력x, 리턴x
	void hello() {
		System.out.println("hello~~~~");
		System.out.println("hello~~~~");
		System.out.println("hello~~~~");
	}
	
	// 입력X, 리턴O (void가 아닌 출력 타입을 적음)
	int getTen() {
		System.out.println("10을 돌려줄게~");
		return 10;
		
	}
	//입력O, 리턴X
	void printName(String name) { // 매개변수도 지역변수 (갈색)
		System.out.println(name + "님 안녕하세요..");
		
	}
	//입력O, 리턴O
	int sum(int a, int b) {
		int sum = a+b;
		return sum;
		//return a+b// 간단한 건 한줄로 가능
	}
	
}
public class Test61_메서드종류_매개변수와리턴 {

	public static void main(String[] args) {
		
		System.out.println("프로그램시작");
		//인스턴스 메서드 실행
		//입력X, 리턴X
		TestB b = new TestB();
		
		
		b.hello(); // 호출 (메서드야 실행해~~)
		System.out.println("메서드 실행됐니???");
		
		//입력X, 리턴O
		int result = b.getTen(); // 담는 변수도 동일 타입
		System.out.println("리턴값 :"+ result);
		
		//입력O, 리턴X
		b.printName("피카츄");

		//입력O, 리턴O
		int resultsum = b.sum(10,20);
		System.out.println(resultsum);
		System.out.println(b.sum(10,20));		// 일회성 출력만 할거라면 한줄로
		
//		return; //생략 가능 (void의 경우)
		
		
		
		
	}

}
