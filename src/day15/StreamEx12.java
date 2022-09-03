package day15;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class StreamEx12 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();

		/*/#1. 요소가 없을 때 예외발생 예시 - NoSuchElementException
		List<Integer> list = new ArrayList<Integer>();
		double avg = list.stream()
			.mapToInt(Integer::intValue)
			.average()
			.getAsDouble();*/ // 여기서 에러 발생
		
		//해결방안 #1.		
		OptionalDouble opt = list.stream()
		.mapToInt(Integer::intValue)
		.average();
		
		if(opt.isPresent())
			System.out.println("평균 : "+ opt.getAsDouble());
		else
			System.out.println("평균 : 0.0");
		
		//해결방안 #2.
		double avg = list.stream()
			.mapToInt(Integer::intValue)
			.average()
			.orElse(0.0); //여기서 엘스처리
		System.out.println("평균2 : " + avg);
	
		
		//해결방안 #3.
		list.stream()
		.mapToInt(Integer::intValue) 
		.average()
		.ifPresent(a->System.out.println("평균 3 : "+a));
		//값이 있으면 실행해야 하니까 값이 없을땐 출력을 안함
		
		
		
	}

}
