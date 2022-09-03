package day04;

public class Test41 {

	public static void main(String[] args) {
		// 다차원 정방배열
		int [][] arr = new int[2][3];
		
		//접근
		arr[0][0] = 100;
		arr[0][1] = 200;
		arr[0][2] = 300;
		arr[1][0] = 400;
		arr[1][1] = 500;
		arr[1][2] = 600;
		
		// 모든 방에 접근하려면 2중 for문
		// new없이 바로 초기화 
		// 선언+ 초기화
		int [][] arr2 = {{10,20,30},{40,50,60}};
		// 데이터 가져오기
		System.out.println(arr2[0][0]);
		System.out.println(arr2.length); // 내부 배열의 갯수, 배열의 행의 개수
		System.out.println(arr2[0].length); // 첫번째 방의 갯수
		System.out.println(arr2.length * arr2[0].length); // 전체 방의 갯수
		
		System.out.println("----------------------------------");

		// 다차원 가변(비정방) 배열
		int[][] arr3 = new int[2][]; // 선언 = 공간 할당 (생성) 일단 2줄을 만들겠다~~ 각 줄은 배열 따로 생성
									// 내부 각 줄을 따로 할당하지 않으면 에러가 발생함
		arr3[0] = new int[2]; // 첫번째 줄을 새로 할당 (1차원 배열)
		arr3[1] = new int[3]; // 두번 째 줄엘 방3개 할당
		
		arr3[0][0] = 1;
		arr3[0][1] = 2;
		arr3[1][0] = 3;
		arr3[1][1] = 4;
		arr3[1][2] = 5;
		
		int[][] arr4 = {{10,20}, {30,40,50}};
		System.out.println(arr4.length);
		System.out.println(arr4[1].length);
		
		System.out.println("----------------------------------");
		
		// 전체 배열을 출력
		
		for(int i = 0; i < arr4.length; i++) {
			for(int j= 0; j <arr4[i].length; j++) {
				System.out.println(arr4[i][j]);
			}
		}
		
		System.out.println("----------------------------------");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
