package day10;

class SingleT {
	
	static int a = 10;	// 공용변수
	int b = 20;			// 한군데
	
	private static SingleT instance = new SingleT();	//#1. static빼면 무한로딩빠짐
													// private 외부에서 덮어쓰기 못하게
	private SingleT() {}; 						//#2. 생성자도 앞에 private을 붙여 객체생성못하게 막아놓는다
	public static SingleT getInstance() {// #3. 가져다쓰려면 static붙여야한다
		System.out.println("getInstance: " +instance); // 주소값 동일
		return instance; // 
	}
	
	void func() {
		System.out.println("싱글턴!!");
	}
	
}
public class Single01_싱글턴 {

	public static void main(String[] args) {

		//SingleT.instance = new Second(); //이렇게 하면 더이상 싱클t로 객체생성 못하니까 이건안된다
		//SingleT s = new SingleT() // 외부에서 객체생성 불가능
		SingleT s = SingleT.getInstance(); //이렇게 가져다써야
		SingleT ss = SingleT.getInstance();
		System.out.println(s);
		System.out.println(ss); // 주소값 동일
		s.func();
		System.out.println(SingleT.a);
		SingleT.a = 1004;
		
		System.out.println(SingleT.a +"변경됐다");
		System.out.println(s.b); // b는 이렇게 출력해야
		System.out.println(ss.b); // 
		s.b = 1000; // 싱글턴으로 하면 인스턴스라도 공용변수처럼 쓰는것
		System.out.println(s.b); // 값이 변함 값을 못변하게 하는건 아님
		System.out.println(ss.b); // 
		
		
	}

}
