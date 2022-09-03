package day07;

public class Test71 {

	// 클래스 변수
	static int x = 10;
	//int y = 20; //인스턴스변수
	// 클래스 블럭
	static {	// 두개가 생성시점 동일해서 덮어쓸 수 있음
		System.out.println("클래스 초기화 블럭"); // 메인메서드에 작성문이 없어도★ 프로그램 시작하자마자 출력이 됨. static로딩
		x = 200;
		//y = 300; // 인스턴스변수는 아직 생성되지 않아서 덮어쓸 수 없음.
		//int xxx = 100; // 지역변수 한번 실행되고 사라짐
	}
	
	// 인스턴스 변수
	int y = 20;
	// 인스턴스 블럭
	{
		System.out.println("인스턴스 초기화 블럭"); // 객체 생성해야만 실행됨. 객체 생성 ㅎ아면 자동으로 한번 실행됨(재호출 절대 불가능)
		x = 300; 
		y = 500; // 인스턴스끼리는 서로 생성시점 같으니까 가능
	}
	
	public static void main(String[] args) {
		
		
		Test71 test = new Test71(); // 
		Test71 test1 = new Test71(); // 인스턴스블럭은 객체를 만들때마다 한번씩 초기화됨. 클래스 블럭은 실행시만 한번실행
		

	}

}
