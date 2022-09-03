package day12;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayTest02 {

	public static void main(String[] args) {

		// 영어이름 4개 입력받아 ArrayList에 저장하고
		// 모든 데이터에 직접 접근해 출력한 후 제일 긴 이름을 출력하세요.
	
		Scanner sc = new Scanner(System.in);
		ArrayList<String> aList= new ArrayList<String>();
		
		for(int i = 0; i < 4 ; i++) {
			System.out.println("이름입력 >>");
//			aList.add(sc.nextLine()); 
			String s = sc.nextLine(); //변수에 저장
			aList.add(s);
		}

		for(int i = 0; i < aList.size(); i++) {
			System.out.println(aList.get(i));
		}


		int longextIdx = 0; // 인덱스로 잡쟝
		
		for(int i = 0; i < aList.size(); i++) {
			if (aList.get(longextIdx).length() < aList.get(i).length()) {
				longextIdx = i;
			}
			
		}
		System.out.println("가장 긴 이름 : " + aList.get(longextIdx));
		
		
		
	}

}
