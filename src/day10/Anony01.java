package day10;

interface MyInter{
	void func();
}

class Test{
	void method(MyInter t) {
		
	}
}
public class Anony01 {

	public static void main(String[] args) {

		//바로 정의하며 객체생성해서 실행까지 한번에
		new MyInter() {
			@Override
			public void func() {
				System.out.println("오버라이드");	
			}
		}.func();
		
		// 객체생성 정의해서 인터한테 토스
		Test t = new Test();
		t.method(new MyInter() {
			@Override
			public void func() {
				System.out.println("오버라이드");
			}
		});
	}

}
