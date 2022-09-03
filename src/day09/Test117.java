package day09;

abstract class Super{
	abstract void func();
	//일반 변수들과 메서드들도 작성 가능.
	int a = 10;
	void aaa() {
		//...
	}
}
// 추상클래스는 초기화를 못한다 = 객체를 생성하지 못한다.
// 위에 있는 추상클래스 내부거를 쓰고싶으면 상속을 시킨다음에 실현부를 완성해서  써야한다.
//상속받은 클래스의 객체를 생성해서 써야한다.
class Sub extends Super{

	@Override
	void func() { 
		
	}	
	
}




public class Test117 {

	
	
	
	public static void main(String[] args) {

			Sub sub = new Sub();
			sub.func();
			sub.aaa();
	}

}
