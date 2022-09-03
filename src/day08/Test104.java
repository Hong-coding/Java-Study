package day08;

class A{ //상속받지 않은 클래스 : 단위클래스
	A(){
		System.out.println("생성자 A");	
	}
}
class B extends A{
	B(){
		System.out.println("생성자 B");
	}
}
class C extends B{
	C(){
		System.out.println("생성자 C");
	}
}
public class Test104 {

	public static void main(String[] args) {


		C c;
		c = new C(); //객체생성하면 부모까지 다 올라가서 생성자를 실행 다 하고 순차로 내려오게됨

	}

}
