package day13;

// 2. Runnable 인터페이스 구현하는 방식
class TimeRunnable implements Runnable{ //스레드를 상속할땐 빨간줄이 없었는데.. 이건 생기네.
	int n=0;
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());// 현재 도는 스레드 이름
		while(true) {
			n++;
			System.out.println(n);
			try {
				Thread.sleep(1000); //상속이라 바로 못쓰고.
			}catch(Exception e) {
				e.printStackTrace();
				break;
			}
		}
	}
	
}
public class ThEx03 {

	public static void main(String[] args) {

		Thread th = new Thread(new TimeRunnable());
		th.start();
		Thread th2 = new Thread(new TimeRunnable());
		th2.start();
	}

}
