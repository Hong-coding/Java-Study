package day03;

public class Test28_배열 {

	public static void main(String[] args) {
		// 배열 선언, 생성
		int a;
		a = 10;
		
		int [] arr;  /////// null상태의 배열 arr이 stack에 만들어짐
		arr = new int[3]; //3개짜리 방 만들겠다
		// 방 하나에 int4바이트
		// 변수 3번을 써서 작성하는 것보다 유지보수가 쉽다. // stack에 공간 점유
		//int a1;
		//int a2;
		//int a3;
		
		int [] arr2 = new int[5];	//한줄에 할 수 있음 
				


		// 값 저장
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		
		//한번에 저장 가능 반복문으로. 원하는 부분들에만도 저장 가능 
		for(int i = 0; i <3 ; i++) {
			if(i%2==1) {
				arr[i]= (i+1)*10;
			}
			
		}
		//방이 몇개인지 모를 때
		for(int i = 0; i <arr.length ; i++) {
			if(i%2==1) {
				arr[i]= (i+1)*10;
			}
			
		}
		
		
		
		// 출력 확인
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		//배열을 쓰는 이유 : for문과 함께 써서 효율적으로 유지보수하려고
		for(int i = 0; i <3 ; i++) {
			if(i%2==1) {
				System.out.println(arr[i]);
			}
			
		}
		
		System.out.println(arr); // [배열 I정수형 @주소값 / 주소를 들고있는 변수 arr
		
		//String str = arr; 이것도 안됨 스트링 태입과 인트[]타입은 다른것
		//int num = arr; 주소값인 arr을 int로 저장 불가능
		int num = arr[0]; // 이렇게 주소 안의 값을 저장하는 건 가능
		
		System.out.println(arr.length);
		
		
		
	}

}
