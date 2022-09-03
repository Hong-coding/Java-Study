package day05;

class Tv2{
	//static int x=y; // x가 반들어진 시점에는 y가 아직 존재하지 않는다.
	//int y = 20; //이게 위로 가도 마찬가지다
	
	int y = x;
	static int x = 100; // 위아래 순서가 바뀌었어도 static이 먼저 메모리에 고정된거라 가능하다.  
					// static을 위에 코딩 짜는 게 보기가 편하다.
					// 클래스 안에서는 실행순서가 상관 없다
	
	//클래스 내부에는 변수와 메서드가 들어가는데
	//변수는 맨위에 (짧으니까)
	//메서드는 아래에 (기능이니까 기니까) // 메서드 내부에서만 실행순서가 중요하다.
	
	
	
}
public class Test55 {
	
	static int a = 100;
	int i = 20;
	

	public static void main(String[] args) {
	
		System.out.println(Test55.a); // 클래스변수니까 바로
		
		Test55 tt = new Test55(); // i쓰려면 인스턴스변수니까 객체생성부터
		System.out.println(tt.i);
		//i를 한번만 쓸래~~ 줄여서 쓸 수 있다. 1회성으로 객체생성 해서 매개변수로 넣어★★★. 변수 참조형에 담지 않고 바로 씀. 잘 사용하진 않지만 알아두기
		System.out.println(new Test55().i);
		
		
		
		// 
		System.out.println(Tv2.x);  // 클래스변수니까 바로
		
		Tv2 t = new Tv2();			// 인스턴스변수니까 객체생성부터
		System.out.println(t.y); 

	}

}
