package day08;

//final
/* #1.
final class Super {  // final이 붙으면 부모가 될 수 없다
	
}
class Sub extends Super {
	
}*/

//
/* #2.
class Super{
	final void add() { System.out.println("hahaha");} // 마지막버전의 메서드라고했으니까
}
class Sub extends Super {
	void add() {System.out.println("hohoho");} //물려 받는건 되는데 그걸 고칠 수는 없음
}*/

public class Test100_final {

	final static int x = 10; //클래스 병수에 final 붙이면 클래스 상수 // 공유해서 씀. 프로그램시작부터.
	final int y = 20; // 인스턴스 변수에 final 붙이면 인스턴스 상수 // 객체생성해서 씀
	
	public static void main(String[] args) {
	
		final int z = 30; // 지역변수에 final 붙이면 지역상수 // 메서드동안만 씀 // static은 클래스 안에서만 쓸수 있고 메서드 안에는 못쓰니까.. 이건 안써놈
		//x = 100; //불가능 
		
		//y = 200; //객체생성 했다고 치고 안됨
		
		//z = 300; //불가능
		
	}

}

class Sup {
	/* 이미 명시적으로 초기화 된 상수 값변경 안됨 this
	final int x = 10;
	Sub(int x){
		this.x = x; 
	}*/ 
	
	final int x; 
	Sup(int x){
		this.x = x; //이건 가능. 객체생성 시 외부에서 던져주는 값을 받아 그 값을 상수로 사용하고 싶을 때
	}
}