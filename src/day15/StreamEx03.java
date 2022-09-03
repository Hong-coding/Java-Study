package day15;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx03 {
	public static int sum = 0; //지역변수는 파이널 수정이 안대니까 #3

	public static void main(String[] args) {
		
		//strArr. //배열은 스트림을 가져올 수 없다. 리스트는 가져올수 잇엇자나// 배열은 스트림stream()메서드가 존재하지 않아서~~
		String[] strArr = {"aaa","bbb","ccc"};
		Stream<String> strStream = Arrays.stream(strArr); //(타입[]) 이렇게 가져오면됨 클래스 매서드를 이용하여 스트림을 얻는다.
		strStream.forEach(a -> System.out.println(a)); 
		
		//인트배열에서 얻어오자
		int[] intArr = {1,2,3,4,5};
		
		IntStream intStream = Arrays.stream(intArr);
		intStream.forEach(a -> System.out.println(a));
		
		//숫자범위로 스트림 얻기 #3
		IntStream stream = IntStream.rangeClosed(1, 100); //1~100
		stream.forEach(a -> sum+= a);
		System.out.println("총합 : " + sum);
		
		
	}

}
