package day13;

class ThreadEx extends Thread{
	@Override
	public void run() {
		for(int i=0; i < 1000 ; i++) {
			System.out.println("run");
		}
	}
}
public class ThEx02 {

	public static void main(String[] args) { // 스레드는 총 4개. 가비지 컬렉션까지. 
		ThreadEx th = new ThreadEx();
		ThreadEx th2 = new ThreadEx();
		th.start(); //이거로 스레드 등록.
		th2.start();
//		th.run();// 안섞임 run출력이 먼저. 그다음 main시작// 일꾼이 두명이 아님. 스레드 등록이 안되서 main스레드로만 실행하는 것. 
		
		for(int i=0; i < 1000 ; i++) {
			System.out.println("main");
		}
		
		
	}

}
