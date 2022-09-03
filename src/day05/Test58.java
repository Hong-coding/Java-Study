package day05;




public class Test58 {
	static int a = 10; // class area
	
	public static void main(String[] args) {	// class area
		// 
		int a = 200; //stack 
		
		System.out.println(a); // stack의 a가 출력됨. (main메모리는 맨 아래깔림)
		System.out.println(Test58.a);// class area 
		
		//변수의 우선순위
		//지역변수 > 인스턴스변수 > 클래스변수
	}

}

	//1. 메모리는 OS 운영체제가 관리한다
	//자바 프로그램을 시작하면 JVM 이 메모리를 일정구역 할당받음. JVM이 그 할당받은 메모리를 정리함
	//자바에서는 JVM이 5개 영역으로 나눠서 사용,관리한다.
	//Class Area(Method Area) : static이 붙은 아이들이 저장되는 곳
	//Stack : 지역변수가 생성되는 영역 (메인이 스택 맨 아래에 먼저 깔림.)
	//Heap : new ~~에서 생긴 애들 , 배열, 객체, 지역변수와 힙 사이 링크가 끊기면 GC에서 줍줍
	//Native Method Stack Area : C 관련 데이터 저장될 때
	//PCregister




