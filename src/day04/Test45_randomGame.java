package day04;

import java.util.Scanner;

public class Test45_randomGame {
	public static void main(String[] args) {
		
		////////// 문자열 배열로 넣는 방법을 몰라
		/*	
			문제1. Up & Down 게임 
				0 ~ 99 사이의 임의의 수를 받아 숨기고, 그 수를 맞추는 게임. 
				임의의 수보다 낮게 입력하면 "Up" 출력, 
				높게 입력하면 "Down" 출력하면서 범위를 좁혀가며 수를 맞춘다. 
				게임을 반복하기 위해 y/n으로 묻고, n인 경우 프로그램 종료 
				
			콘솔예) 
			숫자가 정해졌습니다. 맞춰보세요! 
			0~99
			1 >>	55 (사용자가 입력) 
			"Up"
			55~99
			2 >>	70
			"Up"
			70~99
			3 >>	85
			"Down"
			70~85
			4 >>	80
			"Down"
			70~80
			5 >>	75
			"Up"
			75~80
			6 >>	77
			맞았습니다!! 
			다시하시겠습니까?(y/n) >>	y 
			숫자가 정해졌습니다. 맞춰보세요!
			0~99
			1 >>	30
			"Up"
			30~99
			2 >>	45
			맞았습니다!!
			다시하시겠습니까?(y/n) >> 	n
			게임 종료!	
		*/
		Scanner sc = new Scanner(System.in);
		while(true) {
			int randint = (int)(Math.random()*100); 			//임의의 숫자 생성
			
			System.out.println("숫자가 정해졌습니다. 맞춰보세요! \n0~99");
			
			//변수
			int i = 0; 
			int ceil = 99;
			int bottom = 0;
			
			System.out.println(randint);
			
			i += 1;							// if 들어가기 전에 해줘야 if마다 하면 여러번 출력됨
			System.out.println(i+">>");
			int input = Integer.parseInt(sc.nextLine());			// 입력받을 변수
			
			if(input<randint) {
				System.out.println("\"Up\"");
				bottom = input;
				System.out.println(bottom+1 +"~"+ceil);
				
				
			}else if(input>randint) {
				System.out.println("\"Down\"");
				ceil = input;
				System.out.println(bottom +"~"+(ceil-1));
				
			}
			if(input==randint) {
				System.out.println("맞았습니다!!");
				System.out.println("다시하시겠습니까?(y/n) ");
				String n = "n";
				String y = "y";
				String yn = sc.nextLine();
				if(yn.equals(n)) { // true
					break;						// 한번에 while까지 다 빠져나옴
				}
				if(yn.equals(y)) {
					i = 0; 
					randint = (int)(Math.random()*100);
					System.out.println("숫자가 정해졌습니다. 맞춰보세요! \n0~99");
				}
			}
		}
		System.out.println("게임 종료");
		
		/****** 중첩 while로 내부 반복 +1 로 작성가능
		while(true) {
			System.out.println(bottom + "~" + ceil);
			System.out.println(i + ">>");
			i++;
			input = Integer.parseInt(sc.nextLine()) ;//내부에서 수를 받음
			if(input == randint) {
				System.out.println("맞췄습니다!!");
				System.out.println("다시하시겠습니까?(y/n) >>");
				String answer = sc.nextLine();
				if(answer.equalsIgnoreCase("y") {///클래스의 비교 직접 하는게아니라 equals이용
					play = false; 	// 겉에 있는 전체 게임 회전 종료  ** play 변수
					break; // 가장 가까운 while true (범위추측 while문 종료)
				}else if(answer.equalsIgnoreCase("y")) {	// 소문자 대문자 구분하지 않고 equalsIgnorCase (String에 있는 기능)
					play=true;
					break; // 게임이 다시 시작하더라도, 추측하든 반복하든 종료해야 함.
				}else {
					System.out.println("잘못입력하셨습니다");
					continue;
				}
			}
			*/
//			if(input < randint) {
//				System.out.println("Up");
//				ceil = input;
//			}
//			if(input > randit) {
//				System.out.println("Down");
//				bottom = input;
//			}
//		}
//		sc.close();
		
		
		
		
		
		
		
	}
}
