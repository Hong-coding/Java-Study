package day13;

class TimerThread extends Thread { // 상속받아놓기. 제대로 실행위해서는 런메서드 오러바이딩해야함
	int n=0;
	@Override
	public void run() {
		System.out.println("런실행");
		while(true) {
			n++;
			System.out.println(n);
			try {
				sleep(1000); //1초 대기. 상속받았으니 그냥 부르면 되는데 트라이캐치해야함
		
			}catch(Exception e) {
				e.printStackTrace();
				return; // 에러발생하면 그냥 메서드 종료시켜. 그럼 스레드도 없어짐 
			}
		}
	}
}
public class ThEx01 {

	public static void main(String[] args) { // main 스레드 기본적으로 존재함 1개 존재. 중괄호 끝날 때 끝남.

		System.out.println("메인메서드 실행");
		TimerThread th = new TimerThread(); // 새로운 스레드가 추가됨 . 총 2개. 메인이 끝나도 스레드가 종료되지 않음.
		th.start();
		System.out.println("메인메서드 종료");
	}

}
