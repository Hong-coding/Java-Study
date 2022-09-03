package day15;

import java.util.Arrays;

public class StreamEx11 {

	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5,6};
		
		int sum = Arrays.stream(arr) 	//던져주고
				.sum();
				//리턴타입 확인 int/ 최종임
		System.out.println(sum);
		
		long count = Arrays.stream(arr)
				.count(); 
				//리턴은 long
		System.out.println(count);
		
		int max= Arrays.stream(arr)
				.max().getAsInt(); 
				// 리턴타입 옵셔널이 타입으로 리턴하는 애는 뒤에 어떤애로 받을지 더 붙여줄 수 있다. 
				// getAsDouble/Int/Long()메서드를 더 구체적으로 적습니다~~!!
		System.out.println(max);
		
		int min= Arrays.stream(arr)
				.min().getAsInt(); 
		System.out.println(min);
		
		//집계함수라 숫자들가지고 할 수 있다. 문자들은 합계 평균 불가능하니까~~~
		
		int first = Arrays.stream(arr).filter(n->n%3==0).findFirst().getAsInt(); //리턴옵셔널
		System.out.println(first);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
