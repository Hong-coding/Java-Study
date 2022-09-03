package day03;

import java.util.Scanner;

public class Test22 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// 문제1.
		/*
		int i=0;
		while(i<11) {
			System.out.println(i);
			i++;
		}
		*/
		// 문제2.
		/*
		int j=0;
		while(j<15) {
			j++;
			System.out.println(j);
		}
		*/
		// 문제3.
		
//		int k=0;
//		while(k<=100) {
//			System.out.println(k);
//			//k= k + 10;
//			//k++10; 안되네
//			k +=10; //이렇게 해야함 / k= k + 10; 동일
//		}
		
		// 문제4. 홀수 출력
//		
//		int l = 0;
//		while(l<20) {
//			l = l +2;
//			System.out.println(l-1);			
//		}
//		int l = 0;
//		while(l <=20) {
//			if(l%2==1){////////////홀수 짝수니까 나머지값으로 확인★
//				System.out.println(l);
//			}
//			l++;
//		}
		// 문제5. 누적 결과
//		int m = 0; 
//		int total5 = 0;	// 합을 넣을 결과를 담을 변수를 만들어줘야 함★
//		while(m<10) {
//			m ++;
//			total5 += m;
//			System.out.println(total5);
//		}
		//System.out.println(total);
//		
		//문제6.  1~50 내 짝수 합을 출력
//		int i = 0;
//		int total = 0;
//		while(i<50) {
//			if(i%2==0) {
//				total += i;
//				System.out.println(total);
//			}
//			i++;
//		}
		
		
		
	      /*문제7. 주문 프로그램  
         *** 더조은 카페 메뉴 ***
         1. 아메리카노 : 2500원
         2. 카페라떼 : 3000원
         3. 카푸치노 : 3500원
         4. 카라멜마끼아또 : 4000원
         5. 샌드위치 : 6000원
         6. 종료 
      단계1. 메뉴를 출력하고, 메뉴 번호로 주문을 받는다 
            종료를 선택할때까지 주문받을 수 있고, 종료 선택시 주문한 총 금액 출력,종료.
      단계2. int money = 20000; 내 돈에서 주문금액 차감, 돈이 부족하면 주문 못하게하고, 
            총액 출력시 잔액도 출력 
    */
		System.out.println("*** 더조은 카페 메뉴 ***\r\n"
				+ "         1. 아메리카노 : 2500원\r\n"
				+ "         2. 카페라떼 : 3000원\r\n"
				+ "         3. 카푸치노 : 3500원\r\n"
				+ "         4. 카라멜마끼아또 : 4000원\r\n"
				+ "         5. 샌드위치 : 6000원\r\n"
				+ "         6. 종료 ");
		System.out.println("메뉴 번호를 입력하세요");

		int total = 0;
		while(true) {
			int order = Integer.parseInt(sc.nextLine());
			if (total>20000) {
				System.out.println("주문 금액이 초과했습니다.");
				break;
			}else if (order ==1) {
				total += 2500;
				System.out.println("1.아메리카노가 주문되었습니다.");
				System.out.println("주문이 종료되었습니다. 감사합니다. \n총 주문 금액: "+ total +"원");
				System.out.println("잔액: "+(20000-total)+"원");
			}else if (order ==2) {
				total += 3000;
				System.out.println("2.카페라떼가 주문되었습니다.");
			}else if (order ==3) {
				total += 3500;
				System.out.println("3이 주문되었습니다.");
			}else if (order ==4) {
				total += 4000;
				System.out.println("4가 주문되었습니다.");
			}else if (order ==5) {
				total += 6000;
				System.out.println("5가 주문되었습니다.");
			}else if (order ==6) {
				System.out.println("주문이 종료되었습니다. 감사합니다. \n총 주문 금액: "+ total +"원");
				System.out.println("잔액: "+(20000-total)+"원");
				break;
			}
			else {
				System.out.println("주문 범위 밖입니다.");
			}
		}
		
//	      //문제8. -1이 입력될때까지 정수를 계속 입력받아, 합과 평균을 구하여 출력해보세요. 
//
//		System.out.println("정수를 입력하세요");
//		int num8 = Integer.parseInt(sc.nextLine());
//		int sum8 = 0;
//		int count8 =0;
//		while(num8!=-1) {
//			sum8+= num8;
//			count8 ++;
//			if(num8==-1) {
//				break;
//			}
//			
//		}
//		System.out.println("총 합: "+sum8);
//		System.out.println("평균: "+sum8/count8);
	      //문제9. 문자열을 입력받아 출력하되, exit를 입력받으면 종료되는 프로그램. 
	      //       힌트: String문자열 비교는 String의 기능중 .equals()메서드를 이용 
	      //      String str = "abc"; 
	      //      System.out.println(str.equals("abc")); ==> true 출력됨. ★★★★★★★★★★★★

			
		
		
		
		
		
	}

}
