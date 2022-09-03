package codingTest;

import java.util.Scanner;

//1~45범위에 있는 6개의 랜덤숫자 나열
//중복숫자는 나올 수 없음
class Lotto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//6개의 숫자 담을 배열
		int[] lotto = new int[6];	
		System.out.println("로또 구매 고고? (1:Yes, 2:No)>>");
		int ans = sc.nextInt();
		int cnt = lotto.length;							//개수
//		void getLottoNum (){
//			
//		};
		while(true) {//게임을 반복할경우를 대비해서 반복문안에 넣어둔다
			
			if(ans==1) {
				for(int i=0; i<lotto.length ; i++) {
					int randNum = (int)(Math.random()*45)+1;//특정범위
					lotto[i] = randNum;
					for(int j=0; j<i ; j++) {
						if(lotto[i]==lotto[j]) {
							i--;
						}
					}
				}
				System.out.print("랜덤숫자 : ");
				for(int i = 0; i < cnt ; i++) {
					System.out.print(lotto[i]+ " ");
				}
				System.out.println();

				System.out.println("추가구매 고고? (1:Yes, 2:No)>>");
				int ans2 = sc.nextInt();
				if(ans2 == 1) {
					continue;
				}else if(ans2==2){
					System.out.println("감사합니다. 다음에 또봐요!");
					break;
				}else {
					System.out.println("잘못입력. 다시입력 랜덤구매?(1:Yes, 2:No)>>");
					ans = sc.nextInt();
					
				}
			}else if(ans==2) { //첫구매도 안하는 경우 ans==2
				System.out.println("구매취소");
				break;
			}else {
				System.out.println("잘못입력. 다시입력 랜덤구매?(1:Yes, 2:No)>>");
				ans = sc.nextInt();
			}
			
			
		}
		
	};
};

