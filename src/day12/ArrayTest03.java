package day12;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayTest03 {

	public static void main(String[] args) {

		ArrayList<Integer> arr= new ArrayList<Integer>();
		arr.add(5);
		arr.add(4);
		arr.add(3);
		arr.add(2);
		arr.add(0);
		arr.add(1);
		System.out.println(arr); //[5,4,3,2,0,1]

		ArrayList<Integer> list= new ArrayList<Integer>(arr.subList(1, 4)); //[4,3,2]
		
		//소팅 sort 분류 정리
		Collections.sort(arr);
		System.out.println(arr); //오름차순 정렬
		
		list.add(1000);
		System.out.println(arr.containsAll(list)); // 전부 포함여부 true/false
		
		System.out.println(arr.retainAll(list)); //중복값만 두고 나머지는 모두 삭제
		System.out.println(arr); //[2,3,4]
		
		
		
		
		
		
		
		
	}

}
