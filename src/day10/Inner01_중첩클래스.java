package day10;

import day10.A.B;

// 외부 클래스
class A {
	A(){System.out.println("A객체 생성");}

	//인스턴스 멤버 클래스 - 외부 클래스를 생성해야만 사용할 수 있음
	class B {
		B(){System.out.println("B객체 생성");}
		int x;
		void func1() {
			System.out.println("B클래스 메서드 실행");
		}
		//static int y; 불가능
		
	}
	// static 멤버 클래스 - A클래스를 통해 바로 접근 가능한 내부 클래스 A.C
	static class C {
		C() {System.out.println("C 객체 생성");}
		int c;
		void func2() {
			System.out.println("C클래스 메서드 실행");
		}
		static int d;
		static void func3() { 
			System.out.println("C클래스 static메서드 실행");		
		}
	}
	void methodA() {
		System.out.println("------메서드 실행--------");
		// 로컬 클래스 메서드 안에서 모든게 이루어짐 - 외부클래스의 메서드 내에 만든 클래스~~, 메서드가 실행될 때만 사용가능하고, 종료되면 없어짐
		class D {
			D(){System.out.println("D객체 생성");}
			int x;
			void func() {System.out.println("D클래스 메서드 실행");}
		}
		
		D d = new D();
		d.x = 200;
		System.out.println("d.x :"+d.x);
		d.func();
	}
}
	
public class Inner01_중첩클래스 {

	public static void main(String[] args) {

		// static 멤버 클래스 C 생성 - A객체 생성 없이 A외부에서 B생성 가능
		A.C.d = 20;
		A.C.func3();
		A.C c = new A.C();
		c.c = 10;
		c.func2(); // A.C.func2(); 이건 불가능 static 아니라서. 객체생성 안하면 못씀. 
		//인스턴스 B 사용
		A a = new A(); // A를 객체 생성한 다음에야 B 객체생성해서 쓸 수 있다.
		A.B b = a.new B();
		b.x = 10;
		b.func1();
	}

}
