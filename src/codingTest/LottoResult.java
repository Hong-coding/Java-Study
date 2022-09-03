package codingTest;

import java.util.Scanner;

public class LottoResult {

	public static void main(String[] args) {
		//로또 구매 - ①자동/ ②수동
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[6];
//		
//		System.out.println("로또 자동으로 구매 수동구매? (1:자동구매, 2:수동구매)");
//		int aswAuto = sc.nextInt();
//		if(aswAuto == 1) {
//			for(int i = 0; i < arr.length ; i++) {
//				arr[i] = (int)(Math.random()*45+1);
//				for(int j = 0 ; j < i ; j++) {
//					if(arr[j] == arr[i]) {
//						i--;
//					}
//				}
//			}
//			System.out.print("자동 번호 : ");
//			for(int i=0; i < arr.length ; i++) {
//				System.out.print(arr[i] + " ");
//			}
//			System.out.println();
//		}
//		
//		// ②수동으로
//		String[] arrSelf = new String[6];
//		if(aswAuto==2) {
//			System.out.println("띄어 쓰기로 구분하여 1~45까지의 숫자 6개 입력 >> ");
//			for(int i = 0; i < arr.length ; i++) {
//				String inputNum = sc.nextLine();
//				arrSelf = inputNum.split(" ");
//			}
//			for(int i = 0; i < arrSelf.length ; i++) {
//				System.out.println(arrSelf[i] + " ");
//				
//			}
//		}
		
//		String[] arrSelf = new String[6];
//			System.out.println("띄어 쓰기로 구분하여 1~45까지의 숫자 6개 입력 >> ");
//			String inputNum = sc.nextLine();
//			for(int i = 0; i < 6 ; i++) {
//				arrSelf = inputNum.split(" ");
//			}
//			for(int i = 0; i < arrSelf.length ; i++) {
//				System.out.print(arrSelf[i] + " ");
//				
//			}
//		//로또 랜덤값  ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
//		System.out.println("로또 당첨 확인? (1:Yes, 2:No)");
//		int commitNum = sc.nextInt();
//		int[] arr2 = new int[6];
//		for(int i = 0; i < arr2.length ; i++) {
//			arr[i] = (int)(Math.random()*45+1);
//			for(int j = 0 ; j < i ; j++) {
//				if(arr2[j] == arr2[i]) {
//					i--;
//				}
//			}
//		}
//		System.out.print("당첨번호 : ");
//		for(int i=0; i < arr2.length ; i++) {
//			System.out.print(arr2[i] + " ");
//		}
//		if(commitNum == 1) {
//		}
		
		int[] arr1 = {1,2,3,10,11,12};
		String[] arr2 = {"1","2","3","4","5","6"};
		System.out.println("************");
		System.out.println(arr2[1].getClass());
		int a = (Integer.parseInt(arr2[1]));
		System.out.println((Integer.parseInt(arr2[1])));
		System.out.println(a);
		//번호 맞힌 개수  ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		int cnt = 0;
		for(int i = 0; i < 6; i ++) {
			for(int j = 0; j < 6; j++) { //셀프 비교가 아니라 j<i를 쓰면 안되고 그냥 숫자들어감!!! 그럼 굳이 이중 포문을 써줄 필요가 / 1일때 나머지 숫자는 커져야 하니까 이중포문 맞음
				if(arr1[i]==Integer.parseInt(arr2[j])) {
					System.out.println(arr1[i]+"값 동일");
					cnt++;
				}
			}
		}
		System.out.println(cnt+"개 맞춤");
		
	}
}
