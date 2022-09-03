package day15;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class StreamEx08 {

	public static void main(String[] args) {

		//숫자
		IntStream intStream = Arrays.stream(new int[] {4,3,5,2,1}); 	//배열을 반들면서 단발성으로 바로 단져서 스트림으로 만듦
		intStream
		.sorted()	 													//빈칸이면 default 오름차순// Comparator.reverseOrder() 배열은 안되네...
		.forEach(n->System.out.println(n));
		
		//객체 요소일 경우
		List<Student> stdList = Arrays.asList(
				new Student("bbb",30),
				new Student("ccc",10),
				new Student("aaa",20)
		);
		stdList.stream()
		.sorted()
		.forEach(s-> System.out.println(s.getName() +" "+ s.getScore()));
		
		System.out.println();
		
		stdList.stream().sorted(Comparator.reverseOrder()).forEach(s->System.out.println(s.getName() +" "+ s.getScore()));
		
		
		
		
		
		
		
		
		
		
	}

}
