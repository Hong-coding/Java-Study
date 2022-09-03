package day04;

import java.util.Scanner;

public class Test44_arrayAvg {
	public static void main(String[] args) {

		// * 2차원 배열 문제 * 
		//문제1. 아래와 같은 형태의 정방배열을 만들어 값을 저장하고 출력해보세요. 
		/*
			10	20	30
			40	50	60
			70	80	90
		*/
//		//int[][] arr = {{10,20,30},{40,50,60},{70,80,90}}; //이렇게 해도 되지만 반복문으로 넣을수도 있음 해보기 ==========
//		int[][] arr = new int[3][2];
//		for(int i = 0; i < arr.length ; i++) {
//			for(int j=0 ; j < arr[i].length ; i++) {
//				arr[i][j] = ((i*3)+j+1)*10; //***** 규칙 찾아서 식 세우는 게 중요하구나.
//			}
//		}
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = 0; j < arr[i].length; j++) {
//				System.out.print(arr[i][j]+" ");
//			};
//			System.out.println("\n");
//		}
//		
//		//문제2. int형 3행 2열의 정방배열을 만들고, 
//		//		각 방에 정수를 입력받아 저장하고 출력해보세요. 
//		Scanner sc = new Scanner(System.in);
//
//		int[][] arr2= new int[3][2];
//		System.out.println("3 * 2 배열에 넣을 정수를 입력하세요 >>");
//		
//		for(int i = 0; i < arr2.length; i++) {
//			for(int j = 0; j < arr2[i].length; j++) {
//				arr2[i][j] = Integer.parseInt(sc.nextLine());  //한줄로 
//			};
//			System.out.println("");
//		}
//		System.out.println(" 배열 완성 결과 ------------");
//		
//		
//		for(int i = 0; i < arr2.length; i++) {
//			for(int j = 0; j < arr2[i].length; j++) {
//				System.out.print(arr2[i][j]+" ");
//			};
//			System.out.println();
//		}
		
		
		
		//문제3. 아래와 같은 형태의 비정방배열을 만들어 아래와 같이 값을 저장하고 출력해보세요. 
		/*
			10	11	12
			20	21
			30	31	32
			40	41
		*/
		/* 
		// 방법1
		int[][] arr3 = new int[4][]; ////////3이아니고 4 
		arr3[0] = new int[3];
		arr3[1] = new int[2];
		arr3[2] = new int[3];
		arr3[4] = new int[2];
		
		arr[0][0] = 10;
	
		...
 		// 방법2
//		int[][] arr3 = {{10,11,12},{20,21},{30,31,322},{40,41}};
 		*/
		
		// 방법3
//		for(int i = 0; i < arr3.length; i++) {
//			for(int j = 0; j < arr3[i].length; j++) {
//				arr3[i][j] = (i+1)*10+j;
//			}
//		}
		//문제4. 한층에 5호씩 3층짜리 아파트가 있다. (101호 ~ 305호) 
		//	1) 배열로 만들어서 각각 호마다 관리비를 입력받고, 전체 출력해보세요. 
//		int[][] fee = new int[3][5];
//		for(int i = 0; i < fee.length ; i++) {
//			for(int j = 0; j < fee[i].length ; j++) {
//				System.out.println("관리비 >>");
//				fee[i][j] = Integer.parseInt(sc.nextLine());
//			}
//		}
		
		int[][] fee = {{1,2,3,4,5},{3,4,5,6,7},{4,5,6,7,8}};
		//	2) 층별 관리비 평균을 구해서 출력해보세요. 
		int tot1 = 0, tot2 = 0, tot3 = 0;
		for(int i = 0; i < fee[0].length ; i++) {
			tot1 += fee[0][i];
			tot2 += fee[1][i];
			tot3 += fee[2][i];
			
		}
		
		System.out.println(tot1/fee[0].length+ " " + tot2/fee[0].length + " " + tot3/fee[0].length);
		// 방법 2
		int[] floorFeeAvg = {0, 0, 0};
		for(int i= 0; i < fee.length ; i++) {
			for(int j = 0; j < fee[i].length; j++) {
				floorFeeAvg[i] += fee[i][j];
			}
		System.out.println((i+1)+"층 평균 관리비 : " +floorFeeAvg[i]/fee[i].length);
			
		}
		
		//	3) 전체 관리비 평균을 구해서 출력해보세요. 
//		int[][] fee = {{45, 89, 35, 68, 42},{78, 56, 88, 102, 12},{47, 3, 55, 7, 100}};
		int totFeeAvg = 0;	// 누적 관리비
		int room = 0; 	// 총 방의 개수
		for(int i= 0; i < fee.length ; i++) {
			for(int j = 0; j < fee[i].length; j++) {
				totFeeAvg += fee[i][j];
				System.out.println("누적"+totFeeAvg);
			}			
			room += fee[i].length;	//층별 누적은 반복문 하나 나와서 i에서만 해야함.
			System.out.println(room);
		}
		System.out.println("전층 관리비 평균: " +totFeeAvg + "/" +room);
		
		
		//	4) 103호와 203호의 관리비가 서로 바뀌었다고합니다. 교환해주세요. 
//		int tmp = fee[0][2];
//		fee[0][2] = fee[1][2];
//		fee[1][2] = tmp;
		
		//	5) 전체 관리비 평균보다 적게 사용한 호수들을 출력해보세요. ///// 이미 중복for문이기 때문에 버블정렬말고 선택정렬을 사용해보자
		int max= fee[0][0];
		int maxi = 0;
		int maxj = 0;
		int min = fee[0][0];
		int mini = 0;
		int minj = 0;
		for(int i= 0; i < fee.length ; i++) {
			for(int j = 0; j < fee[i].length; j++) {
				if(max<fee[i][j]) {
					max=fee[i][j];
					maxi= i;
					maxj = j;
				}
				if(min>fee[i][j]) {
					min = fee[i][j];
					mini = i;
					minj = j;
				}
			}			
		}
		System.out.println("최대 관리비: "+max +"("+(maxi+1)+"0"+(maxj+1)+"호)");
		System.out.println("최소 관리비: "+min +"("+(mini+1)+"0"+(minj+1)+"호)");
		
		//	6) 관리비가 가장 적은 호수와 가장 많이나온 호수를 출력해보세요. 
		//	7) 관리비 적게 나온순으로 정렬해보세요. 
		
		
		
		
		
		
		
		
		
		
		
//		sc.close();
		
		
		
		
		
		
		
		
		
	}
}