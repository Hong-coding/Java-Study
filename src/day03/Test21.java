package day03;

import java.util.Scanner;

public class Test21 {

	public static void main(String[] args) {
		
		
//		Scanner //////////// ctrl + space bar + Enter 자동으로 import 시켜줌
		Scanner sc = new Scanner(System.in);
		
		// 무한반복해서 숫자를 입력받되 3을 입력받으면 종료시킴
		while(true) {
			System.out.println("정수입력 :");
			int num = Integer.parseInt(sc.nextLine());
			if(num == 3) {//종료 시점
				break;
			}
		}
		System.out.println("프로그램 종료");
		
		
		
		
		
		
		
		
		

	}

}
