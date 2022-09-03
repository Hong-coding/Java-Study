package day07;

class Sample {
	public int a;
	private int b; // Sample클래스 내에서만 접근가능 / 이 클래스의 메서드에서만 접근가능
	int c; // day07 같은 패키지 안에서 접근 가능/ 
	protected int d; // 동일 패키지와 자식클래스(다른 패키지에 있어도)에서 접근 가능
}
public class Test82_캡슐화 {

	public static void main(String[] args) {
		
		Sample s = new Sample();
		s.a = 100; // 
		//s.b = 200; // 접근 불가능 
		s.c = 300;
		s.d = 400; 
		// private말고는 패키지 내에서 다 된다
	}

}
