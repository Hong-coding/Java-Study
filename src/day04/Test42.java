package day04;

public class Test42 {

	public static void main(String[] args) {
		
		int [] arr = {1,2,3,4,5};
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("-------------------------");
		
		// 업그레이드 포문 ( for each문) 자바에는 하나 더있음
		// for( 반복마다 방요소 값을 넣을 변수: 반복할 배열) : 배열 방 크기만큼 자동으로 for문 반복해서 - 반복할때마다 앞 변수에 담아줌.
		// 1차원 배열 반복 빨리 쓸 때 사용. 인덱스 번호가 중요하지 않고 값만 뺄 때 씀. 위치 바꾸거나 할때는 인덱스 번호가 필요함. 
		
		for(int a : arr) {
			System.out.println(a);
		}
		
		System.out.println("-------------------------");
		//string배열
		String[] strs = {"Abc", "def", "ghi"};
		
		for(String s : strs){
			System.out.println(s);
				
		}
		System.out.println("-------------------------");
		
		double[] dArr = {1.11, 2.22, 3.33, 4.44};
		for(double d:dArr) {
			System.out.println(d);
		}
	}

}
