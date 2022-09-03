package day08;

class A1 {
	A1(){
		System.out.println("생성자A");
	}
	A1(int x) {
		System.out.println("생성자 A-param");
	}
}


class B1 extends A1{
	B1(){
		System.out.println("생성자B");
	}
	B1(int x){
//		super(x);			// 이걸 넣어주면 부모의 파라미터 값이 있는 생성자를 실행시켜줌
		System.out.println("생성자 B-param");
	}
}

public class Test105 {

	public static void main(String[] args) {


		B1 b = new B1();	// 기본생성자만 실행되고 부모도 역시 지정안되있어서 기본생성자
		B1 b2 = new B1(10);	// 자신은 파라미터있는 객체생성자 실행되고 부모만 지정 안되있어서 기본생성자
		
	}

}
