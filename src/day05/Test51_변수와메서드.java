package day05;
//#1. 클래스 만들기.
class Person {
	// 속성=변수 넣을 수 있다.
	String name = "hello"; // ""아무것도 없는 문자열. null과 다름.
	int age = 10;
	// 기능=메서드 넣을 수 있다.
	void work(){// 결과 내줄게 없음
		System.out.println("열심히 일한다~~");
	}
	
	void eat() {
		System.out.println("밥먹기~~");
	}
	
}
public class Test51_변수와메서드 { //클래스
	// 변수 작성 가능.
	// 메서드 : 메인메서드 : 프로그램 시작시 가장 먼저 실행되는 메서드. 
	
	public static void main(String[] args) { 
		// 프로그램 시작 지점.
		
		// #2. 객체 생성 new 
		//Person p 선언만 하고 new안하면 출력시 에러가 나옴. 
		Person p = new Person();
		Person p1 = new Person();
		//Person p = null; // 출력값 없음으로 넣어놓으면 에러는 안남.
		System.out.println(p); // 객체의타입+주소값을 출력함
		
		// #3. 사용 - 변수
		System.out.println(p.name); // 변수에 접근.
		System.out.println(p.age);
		
		System.out.println(p1.name); // 변수에 접근.
		System.out.println(p1.age);
		
		System.out.println("-----------------------");
		p.name = "피카츄";
		p.age =100;
		
		System.out.println(p.name); // 변수에 접근.
		System.out.println(p.age);
		
		System.out.println(p1.name); // 변수에 접근.
		System.out.println(p1.age);

		// 사용 - 기능 실행시키기
		p.work(); //p가 객체생성하고 뒤에메서드를 실행
		p.eat();
		
		
		
		
	}

}
