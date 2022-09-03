package day06;

// Tv클래스
// 값저장 : 채널, 볼륨, 전원
// 기능 : 전원 on/off, 볼륨 조정, 채널조정...

class Tv{
	int ch = 0, vol = 0; // 인스턴스 변수
	boolean power = false;
	void onOff() { //메서드
		power = !power; // 토글스위치 ★
	}
	void chUp() {
		ch++;
	}
	void chDown() {
		ch--;
	}
	void volUp() {
		vol++;
	}
	void volDown() {
		vol--;
	}
	void changeCh(int newch) {
		ch = newch;
		
	}
}
public class Test63 {

	public static void main(String[] args) {
		// 
		Tv tv = new Tv();
		System.out.println(tv.power);
		tv.chUp();
		tv.volUp();
		tv.changeCh(10);

	}

}
