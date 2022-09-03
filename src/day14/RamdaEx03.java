package day14;

class UseLocal {
	void func(int x) {
		int localVar = 50;
		
		MyFunctionalInterface2 my = () -> {
			System.out.println("x : "+ x); //가져다 쓰는건 괜찮다.
			System.out.println("localVar :"+ localVar);
			//x = 100; //매개변수는 원래 가져다 쓰는애고.
			//localVar = 200;  //람다 안에서는 상수처럼 인식하니까 이런거 불가능
		};
		
		my.method();
	}
}

public class RamdaEx03 {

	public static void main(String[] args) {

		//가져다 쓰는것만 람다식에 쓰면돼. 
		UseLocal ulocal = new UseLocal();
		ulocal.func(20);
		
		
		//Runnable 객체 람다로 (스레드가 할일을 run()메서드에 오버라이딩)
		Runnable runnable = () -> {
			for(int i = 0; i < 10; i++) {
				System.out.println(i);
			}
		};
		
		/*
		Thread thread = new Thread(runnable); //오버라이딩하면서 객체생성까지 해주니까 이렇게만 던져주면 됨
		thread.start();
		*/
		
		//더줄여부면
		Thread thread = new Thread(() -> {
			for(int i = 0; i < 10; i++) {
				System.out.println(i);
			}
				
		});
		
		
		
	}

}
