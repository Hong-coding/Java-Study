package day15;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;



public class StreamEx02 {

	public static void main(String[] args) {

		List<Student> list = Arrays.asList(
				new Student("aaa", 90),
				new Student("ccc", 95),
				new Student("bbb", 93));

		//#2.
		double avg = list.stream() //스트림 가져옴. 리턴되는 타입맞춰서. 
		.mapToInt(Student::getScore)// 중간처리 : 학생 갹체를 점수로 타입별로 매핑(Student의 getScore참조). 점수 뽑아옴
		.average() // 최종처리 : 알아서 개수만큼 나눠줌
		.getAsDouble(); // 최종결과 리턴 타입별로 
		//모두 한줄 하나의 명령~~ 부르고 부르고 부르고~~~
		
		System.out.println("평균 : "+avg);
		/*/#1.
		Stream<Student> stream = list.stream();
		stream.forEach(s -> {
			String name = s.getName();
			int score = s.getScore();
			System.out.println(name +" : "+score);
		});*/
	}

}
