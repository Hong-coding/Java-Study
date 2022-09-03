package day15;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamEx07 {

	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5};
		
		System.out.println("------- (1) -------");
		// int[] -> DoubleStream 으로 바꿔서 그 메서드들을 쓰자
		IntStream intStream = Arrays.stream(arr);
		intStream
		.asDoubleStream()
		.forEach(d->System.out.println(d));
		
		System.out.println("------- (2) --------");
		
		intStream = Arrays.stream(arr);
		intStream
		.boxed() //래퍼클래스로 싸줌
		.forEach(obj->System.out.println(obj.intValue()));//래퍼클래스로 와야 이 메서드 실행이 가능합니다. 
		
		
		
		
		
		
		
	}

}
