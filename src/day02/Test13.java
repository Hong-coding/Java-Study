package day02;

import java.util.Scanner;

public class Test13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // sc라는 이름을 붙였으니 그 이름으로 사용가능
		
		// 문제1. 숫자 2개를 입력받고, 사칙연산의 결과를 출력해보세요.
		/*
		
// 		String a = sc.nextLine();
//		int num1 = Integer.parseInt(a);
 	
		int num1 = Integer.parseInt(sc.nextLine()); //한줄로
		int num2 = Integer.parseInt(sc.nextLine());
		System.out.println(num1+"+"+num2+"값은 "+(num1+num2));
		System.out.println(num1+"-"+num2+"값은 "+(num1-num2));
		System.out.println(num1+"x"+num2+"값은 "+(num1*num2));
		System.out.println(num1+"%"+num2+"값은 "+(num1*(double)num2));
		
		 */
		
		
		// 문제2. 초단위 정수를 입력받고, 몇분 몇초인지 출력해보세요
		/*
		System.out.println("초단위 정수 입력 :");
//		String c = sc.nextLine();
//		int num3 = Integer.parseInt(c);
 		int num3 = Integer.parseInt(sc.nextLine();) //한줄로 입력
 		
		System.out.println((num3/60) +"분" + (num3%60)+"초" );		 
		 */

		// 문제3. 초단위 정수를 입력받고, 몇시간, 몇분, 몇초인지 출력
		/*
		String d = sc.nextLine();
		int num4 = Integer.parseInt(d);
		System.out.println((num4/(60*60)) +"시"+(num4%(60*60)/60)+"분"+(num4%(60*60*60))%60+"초");

		 */
		// 문제4. 최소화폐매수 구하기
//			금액을 입력하며, 최소한의 화폐매수를 구해주는 프로그램.
//			콘솔 예)
//				금액입력 : 67800 (사용자가 숫자 입력)
//				5만원 : 1장
//				1만원 : 1장
//				5천원 : 1장
//				1천원 : 2장
//				500원 : 1개
//				100원 : 3개
		System.out.println("금액 입력 :");
//		String e = sc.nextLine();
//		int num5 = Integer.parseInt(e);
		int num5 = Integer.parseInt(sc.nextLine()); //한줄로 입력
		System.out.println("5만원 :" + (num5/50000)+"장");
		System.out.println(("1만원 :"+(num5%50000)/10000)+"장");
//		System.out.println(("5천원 :"+((num5%50000)%10000)/5000)+"장");
		System.out.println("5천원 :"+((num5%10000)/5000)+"장"); // 바로 만원단위로 떨궈내면 됨
//		System.out.println(("1천원 :"+((num5%50000)%10000)%5000/1000)+"장");
//		System.out.println(("5백원 :"+((num5%50000)%10000)%5000%1000/500)+"개");
//		System.out.println(("1백원 :"+((num5%50000)%10000)%5000%1000%500/100)+"개");
		System.out.println("1천원 :"+((num5%5000)/1000)+"장"); // 바로 만원단위로 떨궈내면 됨
		System.out.println("5백원 :"+((num5%1000)/500)+"개"); // 바로 만원단위로 떨궈내면 됨
		System.out.println("5백원 :"+((num5%500)/100)+"개"); // 바로 만원단위로 떨궈내면 됨
				
		sc.close();
	}

}
