package day02;

import java.util.Scanner;

public class Test09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름 입력 :");
		String name = sc.nextLine();
		System.out.println("이름: "+name);
		// 키 입력
		System.out.println("키입력:");
		String height = sc.nextLine(); //입력받아 변수에 저장
		System.out.println(height); // 입력받은 결과를 출력
		
		double dHeight = Double.parseDouble(height);
		//String -> int : Integer.parseInt(String값);
		//String -> double : Double.parseDouble(String값);
		sc.close();

	}

}
