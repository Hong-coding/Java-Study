package day04;

import java.util.Scanner;

public class Test46 {
	public static void main(String[] args) {

		//문제1. 아래와 같은 2차원 배열 arr을 출력하는 프로그램을 작성하세요. 
		/*
			1
			1	2	3
			1
			1	2	3	4
			1	2
		*/
		
		int [][] arr = {{1},{1,2,3},{1},{1,2,3,4},{1,2}}; ///그냥 넣으면 되는것 -
		
		//프린트 할 때 줄내림을 어디에ㅔ 적을지...
		
		
		//문제2. Scanner로 소문자 알파벳 하나 입력받고, 아래와 같이 출력하는 프로그램을 작성하세요. 
		/*
			소문자 알파벳하나 입력 >> 	e (사용자가 입력) 
			abcde		97 98 99 100 101
			abcd
			abc
			ab
			a
		*/
		Scanner sc = new Scanner(System.in);
		String alpha = sc.nextLine();
		char ch = alpha.charAt(0); //char타입은 아스키코드랑 호환이 됨. 숫자로 변환해서 출력하는 것
		
		for(int i = ch; i>=97; i--) {// 뒤에서부터 감소하면서 끝나게
			for(int j = 97; j <=i; j++){
				System.out.print((char)j); //캐릭터로 강제 형변환
			}
			System.out.println();
			
		}
		//문제3. 양의 정수 10개를 입력받아 배열에 저장하고, 3의 배수만 출력하는 프로그램을 작성하세요. 
		int[] n = new int[10];
		for(int i = 0; i < n.length; i++) {
			n[i] = Integer.parseInt(sc.nextLine());
		}
		for(int i = 0; i <n.length; i++) {
			if(n[i]%3 ==0) {
				System.out.println(n[i]);
			}
		}
		
		//문제4. 4x4의 2차원 배열(총16개방)을 만들고, 1 ~ 10까지 범위의 정수를 10개만 
		//		랜덤하게 생성하여 임의의 위치에 삽입하세요. 
		//		동일한 정수가 있어도 상관 없으며, 나머지 6개의 숫자는 모두 0으로 만들고 
		//		4 x 4 형태로 출력해보세요.
		/*
				예) 
				3	0	7	2
				1	7	0	4
				0	6	4	5
				0	8	0	0
		*/
		int[][] board = new int[4][4];
		int[] randNums= new int[10]; // 변수는 데이터를 활용하려고 담아두는 것. 배열은 더 나아가 관리 쉽게 하려고담는 것
		
		//board를 0으로 초기화
		for(int i = 0; i<board.length; i++) {
			for(int j = 0; j < board[i].length; j++) {
				board[i][j] = 0;
			}
		}
		//10개 랜덤 받기
		for(int i = 0; i < randNums.length; i++) {
			randNums[i] = (int)(Math.random()*10)+1;
		}
		// 랜덤 방에 랜덤받은 수 넣기. 방 중복 안됨!!
		// 행렬을 랜덤으로 받음
		for(int i = 0; i < randNums.length; i++ ) {
			int x = (int)(Math.random()*4);
			int y = (int)(Math.random()*4);
			if(board[x][y] !=0 ) { // 이미 한 번 뽑혔던 방 --> for문 횟차를 다시 돌려야
				i--;
				
			}else { //방에 0이 들어 있으면 중복 안된 잘 뽑은 랜덤방이니까 랜덤값으로 방에 넣기
				board[x][y] = randNums[i];
			}
		}
		//출력
		for(int i = 0; i< board.length; i++) {
			for(int j =0; j<board[i].length; j++) {
				System.out.println(board[i][j]+" ");
			}
			System.out.println();
			
		}
		
		
		
		
	}
}
