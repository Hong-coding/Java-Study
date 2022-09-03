package day15;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamEx13 {

	public static void main(String[] args) {

		List<Student> stdList = Arrays.asList(	//아까 쓴 클래스파일 사용
				new Student("aaa",10),
				new Student("bbb",20),
				new Student("ccc",30),
				new Student("ddd",40)
				);
		int sum = stdList.stream()
				.mapToInt(Student::getScore)
				.sum(); //일반집계함수 //두개의 누적 형태로 돌아감
		
		int sum2 = stdList.stream()
				.map(Student::getScore) //통합처리 int아니고 object로 인식.. 내용은int니까 자동으로 연산됨
				.reduce((a, b)-> a+b) //a가 sum,b가 요소 뭐를 리턴해라 . 첨과 같은 결과 나와용/ 최종처리.  
				.get();//이걸 안하면 에러남. reudce리턴타입이 optional 로 되니까 가져오는 형태를 지정해야 하니까. get 해야 integer객체로 줌
		
		Optional<Integer> op=stdList.stream().map(Student::getScore).reduce((a,b)->a+b);
		System.out.println(op);
		
		int sum3 = stdList.stream()
				.mapToInt(Student::getScore)//맵을 해서 인트로 바로처리~
				.reduce(0, (a,b)-> a+b); //스트림에 하나도 없으면 0리턴~
							// 아니면 두개받아서 더해서 리턴~		
		
		System.out.println(sum);
		System.out.println(sum2);
		System.out.println(sum3);
	}

}
