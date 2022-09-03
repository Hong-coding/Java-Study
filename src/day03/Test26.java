package day03;

import java.util.Scanner;

public class Test26 {

	public static void main(String[] args) {
		
		// 중첩 반복, 2중 for문 
//		for(int i = 0; i <=3; i++) {
//			for(int j = 0; j <= 3; j++) {
//				System.out.println(i + " " + j);
//			}
//		}

		// 문제1. 구구단 2단
//		for(int i = 2; i<3 ; i++) {
//			for(int j = 1; j < 10 ; j++) {
//				System.out.println(i+"x"+j+" = "+(i*j));
//			}
//		}
		/////////// 중첩으로 할 필요없지!
//		for(int i = 1; i < 10; i++) {
//			System.out.println(2+"x"+i+" = "+(2*i));
//		}
		// 문제2. 구구단 단수를 받아서 해당 단을 출력
//		Scanner sc = new Scanner(System.in);
//		int num = Integer.parseInt(sc.nextLine());
//		for(int i = num; i < num+1 ; i++) {
//			for(int j = 1; j < 10; j++) {
//				System.out.println(i+"x"+j+" = "+(i*j));
//			}
//		}
//		sc.close();
		
		
		// 문제3. 구구단 전체 단으로 출력
		// 1단   2단    3단
		// 1*1  2*1   3*1
		// 1*2  2*2   2*3
		// ...
		
//		for(int i = 2; i < 10 ; i++) {
//			for(int j = 1; j < 10; j++) {
//				System.out.println(i+"x"+j+" = "+(i*j));
//			}
		System.out.println("1단	2단	3단	4단	5단	6단	7단	8단	9단");			
//		}
		for(int i = 1; i < 10 ; i++) {
			for(int j = 1; j < 10; j++) {
				System.out.print(j+"x"+i+" = "+(j*i)+" ");
			}
			System.out.println("");
			
		}
//		for(int i = 2; i < 10 ; i++) {
//			for(int j = 1; j < 10; j++) {
//				System.out.println(i+"x"+j+" = "+(i*j));
//			}
//			
//		}
		
		
		// 문제4. 별찍기
		//*
		//**
		//***
		//****
		
//		String out= "i";
//		for (int i = 0; i < 4; i++) {
//			out += "*";
//			System.out.println(out);
//		}
		/////////////////////
//		for(int i = 0; i < 4; i++) { /////////겉에 for문은 몇줄을 뽑을지
//			for(int j = 0; j <= i; j++){ ///////////j와 i같이 써줘야 / 각 줄마다 늘어나는 규칙을 내부 for문
//				System.out.print("*"); ///println을 안해야 줄이 안바뀜
//			}
//			System.out.println();
//		}
		
	
		
		
		
		
	}

}
