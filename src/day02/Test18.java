package day02;
import java.util.Scanner;
public class Test18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// *연산자 문제*
		// 문제1. 정수 두개를 입력받고, 몫과 나머지를 출력
		/*
		int num1 = Integer.parseInt(sc.nextLine());
		int num2 = Integer.parseInt(sc.nextLine());
		System.out.println("num1 나누기 num2의 몫 :"+ (num1/num2) + "나머지 :" + (num1%num2));
		*/
//		일수를 입력받고 몇개월 며칠인지 출력 (한달은 30일로 고정)
		/*
		int num3 = Integer.parseInt(sc.nextLine());
		System.out.println((num3/30)+"개월"+(num3%30)+"일");
		*/
//		점수3개 총점과 평균 
		/*
		System.out.println("과목 1 점수:");
		double score1 = Double.parseDouble(sc.nextLine());
		System.out.println("과목 2 점수:");
		double score2 = Double.parseDouble(sc.nextLine());
		System.out.println("과목 3 점수:");
		double score3 = Double.parseDouble(sc.nextLine());
		System.out.println("세 점수의 총점 :"+(score1+score2+score3)+"\n평균 :"+((score1+score2+score3)/3));
		// 다 int로 받고 나눌때 3.0으로 나눌 수도 있다.
		*/
//		*if문 문제*
//		문제4. 숫자 하나를 입력받고, "음수"인지 "양수"인지 출력
		/*
		int num4 = Integer.parseInt(sc.nextLine());
		if(num4>0) {
			System.out.println("양수");
		}else if (num4==0) {
			System.out.println("0");
		}else {
			System.out.println("음수");
		}
		*/
		
//		문제5. 1~99 사이 숫자 짝수 홀수인지 출력
		/*
		System.out.println("1~99 사이의 숫자를 입력하세요")
		int num5 = Integer.parseInt(sc.nextLine());
		if (num5%2==0) {
			System.out.println("양수");
		}else {
			System.out.println("음수");
		}		 
		 */
//		문제6. 정수 3개, 가장 큰 수 출력
		/*
		int input1 = Integer.parseInt(sc.nextLine());
		int input2 = Integer.parseInt(sc.nextLine());
		int input3 = Integer.parseInt(sc.nextLine());
		if (input1>input2) {
			if (input1>input3)
			System.out.println("최대값: "+ input1);
		}else {
			if(input2>input3) {
				System.out.println("최대값: "+ input2);
			}else {
				System.out.println("최대값: "+ input3);
			}
				
		}
		*/
//		문제 7. 2차원 평면에서 직사각형은 왼쪽 모서리와 오른쪽 하단 모서리 두 점으로 표현(왼쪽 위가 0,0)
//		(100,100), (200,200) 두 점으로 이루어진 사각형에서
//		Scanner를 이용해 정수 x, y를 입력받아 점(x,y)가 이 직사각형 안에 있는지 판단하는 프로그램 만들기
		/*
		int x = Integer.parseInt(sc.nextLine());
		int y = Integer.parseInt(sc.nextLine());
		if (x>=100 && x<=200 && y>=100 && y<=200) {   //이항연산자라 한번에 줄여쓸 수 없음. 
			System.out.println("범위 내에 있음");
		}else {
			System.out.println("범위 내에 없음");
		}
		*/
//		if문제
//		문제 8. 369게임. 1~99까지의 정수를 입력받고
//		정수에 3, 6, 9 중 하나가 있는 경우 "박수짝"을 출력
//		두개가 있는 경우 "박수짝짝"을 출력
//		힌트1.
//		String str = "abc";
//		char ch = str.charAt(0); ch ==> a
//		char ch = str.charAt(2); ch ==> c
//		힌트2.
//		int len = str.length(); //==>3 문자열의 길이를 출력
//		String num = sc.nextLine(); //ㅡㅡㅡㅡㅡ이건 망친거같은데
//		if (num.length()==1) {
//			if (Integer.parseInt(num)%3==0)System.out.println("박수짝");
//			else System.out.println(num);
//		}else {
//			if (num.charAt(0) == '3' and 
//		}
//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ풀이1
		//for(int i = 1; i <= 100 ; i++) {
		//	
		//	int num1 = i/10;
		//	int num2 = i%10;
		//	if(i<10) {
		//		if (i%10 ==3 || i%10 == 6 || i%10 ==9) {
		//			System.out.println(i+"짝");
		//		}else {
		//			System.out.println(i);
		//		}
		//	}else if(num1%10==3 || num1%10 == 6 || num1%10 ==9){
		//		System.out.print(i);
		//		System.out.print("짝");
		//		if(num2%10==3||num2%10==6||num2%10==9) {
		//			System.out.print("짝");
		//		}
		//		System.out.println();
		//	}else if(num1%10 != 3 && num1%10 !=6 && num1%10 !=9) {
		//		if(num2%10==3||num2%10==6||num2%10==9) {
		//			System.out.print(i);
		//			System.out.println("짝");
		//		}else{System.out.println(i);}
		//	}
		//}
//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ풀이2
		//	System.out.println("100이하의 정수 입력 >> ");
		//	int num = Integer.parseInt(sc.nextLine());
		//	int cnt =0;
		//	if(num/10==3 || num/10 ==6 || num/10 == 9) {
		//		cnt ++;
		//	}
		//	if(num%10==3 || num%10 == 6 || num%10 ==9 ) {
		//		cnt ++;
		//	}
		//	if(cnt==0) {
		//		System.out.println(num);
		//	}else {
		//		System.out.print("박수");
		//		if(cnt==1)System.out.println("짝");
		//		else System.out.println("짝짝");
		//	}

		for(int i = 0; i<100 ; i++) {
			int cnt=0;
			if(i/10==3||i/10==6|| i/10==9) {
				cnt++;
			}
			if(i%10 == 3 || i%10 == 6 || i%10 == 9) {
				cnt++;
			}
			if(cnt==0) {
				System.out.println(i);
			}else {
				System.out.print("박수");
				if(cnt==1)System.out.println("짝");
				else System.out.println("짝짝");
			}
		}
		
//System.out.println((char)Integer.toString(num)==str1.charAt(0));
// ㅡㅡㅡㅡㅡㅡㅡㅡㅡ 연습 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		String str = "abc";
		System.out.println(str.length());
//		for(int i=0; i<=5; i++) {
//			System.out.println((i+1)+"번째출력");
//		}
		for(int i = 0; i<str.length(); i++) {
			System.out.print( (int)str.charAt(i) + " ");
		}

		
		int num8 = Integer.parseInt(sc.nextLine());
		if (num8<10) {
			if (num8%3==0) {
				System.out.println("박수짝");
			}
		}else if (num8<100){
			
		}
//			char ch1 = str.charAt(0)
//		}
//		char ch = str.charAt(0)
//		
//		switch문제
//		문제9. 정수를 입력받아 3~5는 "봄"/ 6~8 "여름"/ 9~11 "가을"/ 12~2 "봄" / 그 외의 다른 수는 "잘못입력"출력
		/*
		int num9 = Integer.parseInt(sc.nextLine());
		switch(num9/3) {
		case 1:
			System.out.println("봄");
			break;
		case 2:
			System.out.println("여름");
			break;
		case 3:
			System.out.println("가을");
			break;
		case 4:
			System.out.println("겨울");
			break;
		case 0:
			System.out.println("겨울");
			break;
		default:
			System.out.println("잘못 입력");
		}
		*/
//		문제10. 성적 수우미양가
		/*
		int num10 = Integer.parseInt(sc.nextLine());
		switch (num10/10) {
		case 10:
			System.out.println("수");
			break;
		case 9:
			System.out.println("수");
			break;
		case 8:
			System.out.println("우");
			break;
		case 7:
			System.out.println("미");
			break;
		case 6:
			System.out.println("양");
			break;
		default:
			System.out.println("가");
		}
		*/
//		문제11. 두 숫자와 사칙연산기호 중 하나를 입력받아 입력받은 값들의 사칙연산 결과를 출력
//		int 
		
		
		
		
		sc.close();
	}

}
