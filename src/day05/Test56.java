package day05;
/*
 	클래스 기본형 변수 : static키워드. 접근은(클래스명.변수명)
 	클래스 참조형 변수
 	
 	인스턴스 기본형 변수 : 매서드밖 클래스 안. new객체생성해서 (참조변수명.변수명)
 	인스턴스 참조형 변수
 	
 	지역 기본형 변수 : 메서드 안. 메서드가 끝나면 없어진다.
 	지역 참조형 변수
 	
 */
class Tv3 {
	boolean power = false;
	int ch = 1, vol =0;
	
}
public class Test56 {
	//클래스 영역
	static int a;	// Test56.a; 
	static Test56 test;	// Test56.test;
	//static Tv3 tv; // Test56.tv;
	//static Tv3 tv = null;	// Test56.tv; 변수만 선언한 상태 동일/ 널인데 static이면 오류 나니까 객체 생성을 바로 하자
	static Tv3 tv = new Tv3();	// Test56.tv; 변수만 선언한 상태 동일/ 널인데 static이면 오류 나니까 객체 생성을 바로 하자★
	
	
	int x; 
	Tv3 tv3; //인스턴스 참조형 변수 static여부로만 판단.
	// 메모리 무한로딩 : 자신의 클래스로 인스턴스 객체 생성(new)할 때 발생.
	//Test56 test56 = new Test56(); //객체생성도 함께 하면 에러가 나옴 StackOfFlowError  
				//static Test56 test = new Test56();// 내부안에 내부안에 내부안에 내부안에 무한반복. 자신타입으로 인스턴스 객체 생성 불가!!!! 그렇게 할거면 static을 붙여(한번만만드니까)
				
	//Test56 test56 = null; // (null생략해도 참조형은 기본값 null채워짐) // 아니면 선언까지만 하는건 괜찮다. new객체생성처럼 메모리 차지하는게 아니니까
	Test56 z = null;
	
	public static void main(String[] args) {
		//System.out.println(new Test56().test56);//단발성 객체생성 위에가 널로 되어있으면(33줄) 이건 에러가 생기지 않음
	
		Test56 testtt = new Test56(); //인스턴스변수 z를 사용하기 위해 객체생성
		testtt.z = new Test56(); // z가 객체생성이 되지 않아 안에있는 x를 꺼낼 수 없어서 객체생성을 해준것. /객체내부에 또 같은타입 객체생성
		// 두줄 합치는거 불가능 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		// Test56 testtt = new Test56(); 인스턴스 변수에 자기자신타입으로 객체생성하는꼴... 
		System.out.println(testtt.z.x);
		

	}

//	다시 설명 
//	int x;
//	Test57 test;
//	
//	public static void main(String[] args) {
//		//1. test에 접근 (인스턴스 변수 )
//		
//		Test57 a = new Test57(); //객체생성으로 접근이 가능하게 만든다
//		System.out.println(a.test); // null 6번줄에서 값을 안넣었으니까
//		
//		//a.test 객체생성
//		a.test = new Test57(); //a.test에 Test57변수내용을 넣어줌. 이제 null이 아니라 그 안에는 a와 test가 들어감.
//		//두번 객체생성을 한 이유는 test에서 객체생성을 안해놨기 때문?
//		
//		//이제 그 안에 있는 x를 접근한다면
//		a.test.x 
//		
//		
//		
//		
//		
//		
//	}


}
