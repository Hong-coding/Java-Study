package day03;

public class Test31 {

	public static void main(String[] args) {
		
		// 레퍼런스 치환(배열 공유= 주소공유)
		// : 다수의 레퍼런스변수(주소변수/참조변수)가 하나의 배열공간을 동시에 가르키는 형태
		
//		int[] arr = {1,2,3,4,5};
//		int[] myArr = arr; //좌우 모두 int[]타입 동일하니까 공유가능. 
//		
//		//System.out.println(myArr[0]);
//		
//		for (int i = 0; i < myArr.length; i++) {
//			System.out.println(myArr[i]);
//		}
//		
		
		
		// 문제: 최대값과 최소값 구하기 (알고리즘 문제 시작됨)
		int [] arr = {79,85, 12, 120, 4, 94, 200};
		
		int max = arr[0];	// 최대값을 임의로 들고 있을 변수 생성, 초기값은 첫번째 값으로 초기화. 0으로 하면 최소값 구할 때 오류나니까.
		int min = arr[0];
		
		for (int i = 0; i < arr.length ; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}// 크지 않으면 덮어쓰지 않고 그냥 넘어감
			
			//최소값 구하기
			if(min > arr[i]) {
				min = arr[i];
			}			
			
		}
		
		System.out.println("최대값 : "+max);	
		System.out.println("최소값은 :" +min);
		
		
		
		
		
		
	}

}
