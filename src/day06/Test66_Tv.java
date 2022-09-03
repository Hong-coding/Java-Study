package day06;

/* TvEx 기능 구현
0. on/off, vol조정, ch조정
1. 채널 = 배열[10] 생성 후 랜던값 10개 생성 후, 오름차준으로 정렬
2. 체날(up, down)
3. 채널값 입력받아 변경 (없는 채널번호 입력 처리)
4. 볼륨(up, down) 0 ~ 10 사이 증감
5. 볼륨 음소거 기능
6. Tv정보출력 기능. 전원상태, 볼륨, 채널 값들 출력
7. 전원이 꺼져있는 경우 모든 기능 동작 안되게

*/

class TvEx { // 클래스 설계도
boolean power = false;
int vol = 0; 
int channel[] = new int[10]; // 채널 목록을 담을 배열
int chIdx = 0; //현재 채널의 배열항 idx번호
	
//전원
void onOff() {
	power = !power;
}
// 채널 세팅
void setChannel() {
	if(power) {
		// 랜덤 10개 채워주기 (중복 체크)
		

		for(int i=0; i<channel.length; i++) {
			channel[i] = (int)(Math.random()*50) +1;
			for(int j = 0; j < i; j++) {// 중복체크
				if(channel[i] == channel[j]) {
					i--;
					break;
				}
			}
		}
		
		// 정렬
		for(int i=0; i < channel.length-1; i++) {
			for(int j = i+1; j < channel.length; j++) {
				if(channel[i] > channel[i]) {
					int tmp = channel[i];
					channel[i] = channel[j];
					channel[j] =tmp;
				}
			}
		}
		// 출력해 확인
		for(int c : channel) {
			System.out.print(c + "  ");
		}
		System.out.println();
	}else {
		System.out.println("전원을 켜고 실행해주세요.");			
	}

}

// 채널
void chUp() {
	if(power) {
		chIdx++; //0~9
		if(chIdx == 10) {chIdx = 0;}
	}else {
		System.out.println("전원을 켜고 실행해주세요.");
	}
}
void chDown() {
	chIdx--; // 0~9
	if(chIdx == -1) {chIdx = 9;}
}
void channelChange(int c) {
	for(int i = 0; i < channel.length; i++) {
		if(channel[i]==c) {
			chIdx = i;
			break;
		}
	}
}
		
// 볼륨
void volUp() {
	if (vol<10) vol++; //명령이 하나면 중관로 생략 가능 // 값을 올리기 전에 체크 먼저
}
void volDown() {
	if (vol>0) vol--;
}
void mute() { 
	vol = 0;
} // 음소거
	
// Tv 정보 출력 void 말고 리턴값으로 받아보자
String tvStatus() { // void 너무많이 했으니까 이번엔 return있는 
	return "전원 :" +(power?"ON":"OFF") +"채널 :" + channel[chIdx] + "볼륨 :" +vol;
}// (power?"ON":"OFF")  삼항연산자로
}

	



public class Test66_Tv { 

public static void main(String[] args) {

	//사용하기 위한 객체 생성
	//		여기에 랜덤 하지 말고 
	//여기는 프로그램 실행시 시작 지점
	TvEx tv = new TvEx();
	System.out.println(tv.tvStatus());
	tv.volUp();
	tv.volUp();
	tv.volUp();
	tv.volUp();
	System.out.println(tv.tvStatus());
	
}

}
