package day12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/* ArrayList
	Scanner 클래스로 -1이 입력될때까지 양의 정수를 입력받아 ArrayList에 저장하고, 
	ArrayList를 검색하여 가장 큰 수를 출력하는 프로그램을 작성하세요.
*/
public class CollEx02 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		sc = new Scanner(System.in);

		ArrayList<Integer> arrList = new ArrayList<Integer>();
		
		while(true) {
			System.out.println("양수 입력>>");
			try {
				int num = Integer.parseInt(sc.nextLine());
				if(num==-1){
					System.out.println("입력이 끝났습니다.");
					break;
				}else if(num>0) {
					arrList.add(num);// 1.요소 넣기
				}
			}catch(Exception e) {System.out.println("잘못 입력했습니다");};
		}
	
		
		int longestIdx = 0;
		for(int i = 0; i < arrList.size(); i++) {
			if (arrList.get(longestIdx)<arrList.get(i)) {
				longestIdx = i;
			}
		}
		System.out.print("ArrayList 요소 : ");
		for(int i = 0; i < arrList.size(); i++) {
			System.out.print(arrList.get(i)+" ");
		}
		System.out.println();
		System.out.println("최대 값 : " + arrList.get(longestIdx)); 
		
		
	}
}
