package day04;

import java.util.Scanner;

public class Test40 {

	public static void main(String[] args) {
		
		// 배열 연습
	  //문제1-1. int형 방5개의 배열을 만들고, 10,20,30,40,50을 저장하고, 출력. 
      //문제1-2. 위 배열을 이용하여, 인덱스번호 1번과 3번안에 있는 데이터를 더한값을 출력. 
      //문제1-3. 인덱스번호를 사용자로부터 입력받고, 해당 인덱스의 데이터를 출력. 
      //문제1-4. 배열안의 모든 요소를 다 더한 값을 출력. 
      //문제1-5. 배열안에 있는 값중 하나를 입력하면, 그 값이 위치한 인덱스번호 출력. 
      //문제1-6. 인덱스번호 2번과 4번방의 값을 교환해보세요. 
      //문제1-7. (심화) 내림차순으로 정렬하세요.
		
		Scanner sc = new Scanner(System.in);

		// 1-1
		//int[] arr = new int[] {10,20,30,40,50}; 
		System.out.println("1번 문제--------------");
		int[] arr = new int[5];
		for (int i = 0; i<arr.length ; i++) {
			arr[i] = (i+1)*10;
			System.out.print(arr[i] +" ");
		}
		System.out.print("\n");
		System.out.println("arr :"+ arr);
		
//		// 1-2
		System.out.println("arr[1]+arr[3] : " +arr[1]+arr[3]);
//		
//		
//		// 1-3
//		System.out.println("인덱스 번호 입력 :");
//		int idx = Integer.parseInt(sc.nextLine());
//		System.out.println(arr[idx]);
//		// 1-4
//		int sum = 0;
//		for(int i = 0; i < arr.length ; i++) {
//			sum += arr[i]; // sum = sum + arr[i];
//		}
//		System.out.println("sum :"+sum);
//		// 1-5 +++++++++++++++++++++++++ boolean break 내부값이 아닌경우 예외처리 해보기. 강의 다시듣기
//		
//		System.out.println("값 입력 :");
//		int num2 = Integer.parseInt(sc.nextLine());
//		
//		boolean checked = false;
//		
//		for(int i = 0; i < arr.length ; i++) {
//			if(arr[i]==num2) {
//				System.out.println("인덱스번호 :" +i);
//				break; //이미 찾았으면 멈추고 처음 나오는 값만 나오게 하는 것. 이게 없으면 뒤에 계속 비교가 이어짐.
//			}
//		}
		// 1-6 +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ 정렬
//		int cup = arr[2];
//		arr[2]= arr[4];
//		arr[4] = cup;
//		for (int i = 0; i<arr.length; i++) {
//			System.out.println(arr[i]);
//		}
//		if(!checked) {
//			System.out.println("입력 값은 배열에 존재하지 않습니다. ");
//		}
		
		// 1-7 정렬 - 버블정렬
//		for(int i = 0; i < arr.length-1; i++) {
//			for(int j = i+1; j < arr.length; j++) {
//				if(arr[i] < arr[j]) { //내림차순은 < 크면 교환  j기준으로
//									  //오름차순은 > 작으면 교환   j기준으로
//					int tmp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = tmp;
//				}
//			}
//		}
		
		// 선택정렬
		for(int i = 0; i < arr.length-1; i++) {
			int max = i; //가장 큰 값의 인덱스번호를 들고다닐 변수
			for (int j=i+1; j < arr.length; j++) { // 먼저 처리한 애는 보존하기 위해 j = i
				if(arr[max] < arr[j]) {
					max = j;
					
				}
			} // 가장 큰 인덱스 번호가 저장됨
			// 찾아놓은 큰 값이랑 i번째 앞부분 값이랑 자리교환
			int tmp = arr[i];
			arr[i] = arr[max];
			arr[max] = tmp;
		}
		

		for (int i = 0; i<arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
		

		sc.close();
		
		
	}

}
