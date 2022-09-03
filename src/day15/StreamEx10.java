package day15;

import java.util.Arrays;

public class StreamEx10 {

	public static void main(String[] args) {

		int [] arr = {2,4,6};
		
		// 
		boolean result = Arrays.stream(arr)	.allMatch(a->a%2 == 0);
		System.out.println("전부 2의 배수인가? :" + result); //true
		
		//
		result = Arrays.stream(arr)			.anyMatch(a -> a%3 ==0);
		System.out.println("3의 배수가 하나라도 있나? "+result);//true
		
		//
		result = Arrays.stream(arr)			.noneMatch(a->a%3 == 0);
		System.out.println("3의 배수가 전혀 없나? " +result);	//false
	}

}
