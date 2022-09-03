package day03;

public class Test29 {

	public static void main(String[] args) {
		// 배열 만들어보기 int 이외의 형태로 
		
		double [] dArr = new double[5];
		dArr[0] = 1.1223;
		dArr[1] = 3; // 정수로 넣어도 자동으로 더블로 들어감
		System.out.println(dArr[1]);
		
		float[] fArr = new float[3];
		fArr[0] = 3.14F; // float은 4바이트 / 3.14는 double 8바이트니까 접미사f써줘야
		System.out.println(fArr[0]);
		
		char[] chArr = new char[5];
		chArr[0] = 'a'; // 쌍따옴표로 하면 안되고 글자 여러개도 안됨
		
		String[] strArr = new String[3];//C언어는 스트링이 없어서 캐릭터 배열로 저장함. 
		strArr[0] = "피카츄";
		System.out.println(strArr[0]);
		
		
//		값을 모를땐 이렇게 지정할 수 있지만 
//		이미 값을 알 때 초기값을 지정한 후 방 만들수도. 
		int[] math = {100, 90, 80, 70, 60}; //축약형/ 선언과 초기화 동시에
		
//		이걸 나눠서는 불가능. 하나의 명령으로 끝내야 함
//		int[] math;
//		math = {100, 90, 80, 70, 60}; 
		
		int [] score = {10, 20, 30, 40, 50}; // 축약형
		
		System.out.println(score[0]);


//		문제 최대값과 최소값 구하기
		int [] arr = {58, 2100, 3, 250, 92, 120};
		int max = arr[0];
		int min = arr[0];
		for(int i = 0 ; i < arr.length; i++) {
			if (max < arr[i])max=arr[i]; 
		}
		for(int i = 0; i < arr.length; i++) {
			if (min > arr[i])min=arr[i];
		}
		System.out.println("최대값 : "+max +"\n최소값 : " +min);
		
		
		
		
		
		
		
	}
	
	

}
