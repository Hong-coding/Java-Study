package day08;

class Super1{
	void func() {
		System.out.println("super");
	}
	void f2() {
		System.out.println("ahahha");
	}
}
class Sub1 extends Super1{// func(), 11개의 매서드 (Object로부터 상속받은)
	
	@Override //어노티이션
	void func() { // 오버라이딩
		super.func(); // 부모의 func도 실행하고 아래실행으로 이어짐. 
		System.out.println("subsub");
	}
	@Override
	void f2() {
		System.out.println("lalala");
	}
}
public class Test106 {

	public static void main(String[] args) {
		
		Sub1 sub = new Sub1(); // 객체생성을 자식으로 함 
		sub.func();	// 자식func()가 기본으로 실행되지만 그래도 부모걸 쓰고싶다면 메서드 super.func()
		Super1 sup = new Super1(); // 객체 생성을 부모로 함
		sup.func(); 
		
	}

}
