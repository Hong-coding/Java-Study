package day09;

interface Test{
	public static final int NUM = 1; //상수 (원형)
	public abstract void add(); 	//추상 메서드(원형)
	
	int x = 100; // 이것도 상수가 된다. 앞에 생략된것
//	public int func() {} // 중괄호 여는순간 에러가 됨
	int func(); // 앞 생략된 추상 메서드
	
}
interface Test2{ //첫글자 대문자
	void func22();
}
class AAA { 
	int xxx;
}

class Inter extends AAA implements Test, Test2 { // 인터페이스 쓰려면 구현클래스 만들어야, 동시에 구현도 가능 
// 상속과 인터페이스 동시에 가능. 순서는 지켜야. 
	@Override
	public void add() {
		System.out.println("imple~~");
	}

	@Override
	public int func() {
		return 0;
	} //갖다쓰려면 class로. 구현시키는 키워드

	@Override
	public void func22() {
		
	}
	
	
}
public class Test119 {

	public static void main(String[] args) {

		//Test t = new Test();//인터페이스로 객체생성불가능
		Inter i = new Inter(); // 구현한 클래스로 객체생성해야
		
		//인터페이스 타입의 변수에, 구현 클래스로 생성한 객체를 담을 수 있다. (부모역할)
		Test t = new Inter();
		Test2 tt = new Inter(); 
		
		//ArrayList arr = new ArrayList();
		
		
		
		
		
	}

}
