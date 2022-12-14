package day14;

class UseThis{
	
	int outterVar = 10;
	
	class Inner {
		int innerVar = 20;
		
		void method() {
			MyFunctionalInterface2 my = () -> {
				System.out.println("outter var : " + outterVar);
				System.out.println("outter var : " + UseThis.this.outterVar); // 내부클래스 안에서 이렇게 this 쓸수도 있다.
				
				System.out.println("inner var : "+ innerVar); // 이건 문제가 안되지만
				System.out.println("inner var : "+ this.innerVar);
			};
			
			my.method();
		}//method
	}//Inner
}//UseThis

public class RamdaEx02 {

	public static void main(String[] args) {
		
		UseThis useThis = new UseThis();// 외부클래스 객체생성
		UseThis.Inner inner = useThis.new Inner(); //외부참조변수로 내부객체 생성
		inner.method();
		
	}

}
