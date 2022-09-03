package day04;

import java.util.Scanner;

public class Test43 {

	public static void main(String[] args) {
	      // * 1차원 배열 문제 * 
	      // 문제1-1. arr이라는 이름의 배열에 사용자로부터 서로다른 5개의 정수를 입력받아, 출력해보세요.
		Scanner sc = new Scanner(System.in);
		
//		int[] arr = new int[5];
//				
//		System.out.println("정수를 입력하세요");
//		for(int i = 0; i < arr.length; i++) {
//			int num = Integer.parseInt(sc.nextLine());
//			arr[i] = num;
//			
//		}
//		for(int a : arr) {
//			System.out.print(a + " ");
//			
//		}
		
		System.out.println("--------------------------------------");
		
	      // 문제1-2. 위에서 만든 배열 arr에 저장된 값들을 오름차순으로 정렬해보세요. 
		int[] arr = {5,8,2,4,1};
//		for(int i = 0; i < arr.length-1; i++) { // (length-1)이 length보다 일을 하나 줄여줌
//			for(int j = i+1; j < arr.length; j++) { // (i+1)이 i보다 일을 줄여줌
//				if(arr[i] > arr[j]) {
//					int tmp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = tmp;
//				}
//			}
//		}
//		for(int a : arr) { // 업그레이드 for문
//			System.out.print(a + " ");
//			
//		}
		
		System.out.println("--------------------------------------");
		
	      // 문제1-3. 정수 한개를 더 입력받아 저장해보세요. 
	      //         입력받은 정수는 기존배열의 마지막 데이터 다음 방에 저장되어야한다. 
	      //         단, 배열은 문법적으로 방크기 조절불가.... 
		  // 		  결국, arr의 방 크기가 6이 되어야 함
//		System.out.println("추가할 정수를 1개 더 입력하세요>> ");
//		int num2 = Integer.parseInt(sc.nextLine());
		
////		//int[] tmp; // 이렇게 말고 
//		int[] tmp = arr; // 배열 원본 잠시 주소 복사 ★★★★★★★★ (arr 자체는 참조형. 주소니까.)

//		//tmp = new int[6]; // 주소를 복사해서 쓸거니까 아래 모두 기존 arr을 사용하면 됨 
//		arr = new int[6]; // 이렇게 덮어 쓰는 순간 기존에 있던 arr의 주소는 끊어지고 새로 연결됨
		
//		int len = arr.length; // 새로 만든 방의 개수 (6개) 담아두기 ******
//		//arr[(arr.length)-1] = num2;
//		arr[len-1] = num2;
		
//		for(int i=0; i < tmp.length; i++) { // 수가 적은 방의 개수를 담아야함★
//			//tmp[i] = arr[i];
//			arr[i] = tmp[i]; 
//		}
//		for(int a : tmp) {
//			System.out.print(a + " ");
//			
//		}
		
		System.out.println("--------------------------------------");
		
	      // 문제2-1. 게임 랭킹 보드. 5개의 데이터를 저장할 수 있는 users와 scores라는 배열이 있고, 
	      //      users배열에는 유저네임, scores 배열에는 유저의 게임점수를 입력받는다. 
	      //      단, 유저네임과 게임점수는 배열 인덱스상으로 서로 일치해야한다. 
	    /*  
//		String[] users;
//		int[] scores;
//		users = new String[5];
//		scores = new int[5];
		String[] users = new String[5]; //한줄로
		int[] scores = new int[5]; 
		
		
		for(int i = 0; i<users.length; i++) {
			System.out.println("유저네임을 입력하세요>>");
			String user = sc.nextLine();
			users[i] = user; 
			//users[i] = sc.nextLine(); //한줄로 
			 * 

			System.out.println("점수를 입력하세요>>");
			int score = Integer.parseInt(sc.nextLine());
			scores[i] = score; 			
		}
		for(int i = 0; i<users.length; i++) {
		}
		for(String a: users) {
			System.out.print(a + " ");
			
		}
		for(int a: scores) {
			System.out.print(a + " ");
		}
		System.out.println("\n\n\n");

		*/
		
		
	      // 문제2-2. 위 저장된 users와 scores를 아래와 같은 형태로 출력해보세요. 
	      /*      출력예)
	               user_name      score
	               ----------------------
	               피카츄          87
	               파이리          24
	               ....
	      */
//		System.out.println(" user_name    score");
//		System.out.println("---------------------");
//		for(int i = 0; i <5; i++) {
//			System.out.println(users[i]+"\t\t"+scores[i]);
//			
//		}
//		
//		String[] users= {"가", "나", "다", "라", "마"};
//		int[] scores= {100, 20, 43, 55, 90};
//		
	      // 문제2-3. 두번째 유저의 점수와 세번째 유저의 점수가 바뀌어 저장되었다 하네요.
	      //         교환해서 저장해주세요. 
	      
//		int tmp3 = scores[1];
//		scores[1] = scores[2];
//		scores[2] = tmp3;
//		
		
		
	      // 문제2-4. 점수가 높은순으로 게임 랭킹보드를 만들고, 출력해주세요. (1~5위) 
	      /*      출력예)
	                rank      user_name      score
	                ---------------------------------
	                1         꼬북이         97
	                2         피카츄         87
	                3...
	      */
//		for(int i = 0; i < scores.length-1; i++) {
//			for(int j = i+1; j < scores.length; j++) {
//				if(scores[i]<scores[j]) {
//					int tmp = scores[i];
//					scores[i] = scores[j];
//					scores[j] = tmp; // 점수 최고점 순서 정렬
//					
//					String stmp = users[j];
//					users[i] = users[j];
//					users[j] = stmp; // 유저 순서 정렬
//				}
//			}
//		}
		//======================================버블정렬이 선택정렬보다 더 짧게 끝나는군.
		
//		System.out.println("rank   user_name   score");
//		System.out.println("--------------------------");
//		for(int i = 0; i < scores.length; i++) {
//			System.out.print((i+1) +"\t"+ users[i] + "\t" + scores[i]);
//			System.out.println("\n");
//		}
		/////////// +++++인덱스값이 변하기 전에 원본을 유지해야하는데. 새로운 그릇에 저장을 해두어야하나? ==> 아님 동일 인덱스 사용하는 값으로 바로 코딩 가능
		
	      
	      // 문제2-5. 또 한명의 유저가 게임을 끝냈습니다. 
	      //         점수와 유저네임을 입력받고, 기존의 게임 랭킹보드를 업데이트 해주세요. 
	      //         이때 입력받은 새로운 유저의 데이터는 기존데이터에 추가.(1-3문제참고) 
	      //         저장 후, 랭킹을 출력하시되 1~5위까지만 출력해주세요.

		
//		int len = users.length; // 기존 방 크기 5
//	    String[] usrTmp = users; // 임시 배열에 복사
//	    int[] scoTmp = scores;
//	    users = new String[len+1]; // 방 크기 늘리기
//	    scores = new int[len+1];
//	    for(int i = 0; i < len; i++) { // 기존 점수 채우기
//	    	  users[i]= usrTmp[i];
//	    }
//	    for(int i = 0; i < usrTmp.length; i++) {
//	    	scores[i]= scoTmp[i];
//	    }
//	    System.out.println("유저 네임을 추가 입력하세요 >> "); 
//	    //String addU = sc.nextLine();
//	    //users[len]= addU; // 굳이 크기를 담을 이유가 없음 한줄로
//	    users[len] = sc.nextLine(); // 6번방에 받은 값 저장 
//      
//	    System.out.println("점수를 추가 입력하세요 >> ");
//	    scores[scores.length-1] = Integer.parseInt(sc.nextLine());
//	    // 점수 출력
//		System.out.println(" user_name    score");
//		System.out.println("---------------------");
//		for(int i = 0; i <users.length; i++) {
//			System.out.print(users[i]+"\t\t");
//			System.out.print(scores[i]);
//			System.out.print("\n");
//		}
//		
		
		
		//////////코드 옆에 주석 달아 내용별로 깔금하게 정리하기
		
//	    // 랭킹 출력
//		for(int i = 0; i < scores.length-1; i++) {
//			for(int j = i+1; j < scores.length; j++) {
//				if(scores[i]<scores[j]) {
//					int tmp = scores[j];
//					scores[j] = scores[i];
//					scores[i] = tmp;
//					String stmp = users[j];
//					users[j] = users[i];
//					users[i] = tmp;
//				}
//			}
//		}
//		
//		
//		System.out.println("rank   user_name   score");
//		System.out.println("--------------------------");
//		for(int i = 0; i < 5; i++) {
//			System.out.println((i+1) +"\t"+ users[i] + "\t" + scores[i]);
//		}
		
		////////////랭크 6아닌 5번만 돌려야 하니까 수정
		
		sc.close();


	}

}
