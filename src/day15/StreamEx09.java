package day15;

import java.util.Arrays;

public class StreamEx09 {

	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5};
		int total = Arrays.stream(arr)
			.filter(a->a%2==0)				// 짝수인경우만
			.peek(n->System.out.println(n))	//최종메서드가 아니라 여기까지 하면 출력이 안됨
			.sum();
		System.out.println("toal : "+ total);
		
		Arrays.stream(arr)
		.filter(a->a%2==0)
		.forEach(n->System.out.println(n));	// 최종메서드니까 뒤에 또 최종메서드오면 에러남
		//.sum();
		
	}

}
