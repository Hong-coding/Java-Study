package day15;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx04 {

	public static void main(String[] args) {

		List<Member> list = Arrays.asList( //new 선언 없이 빠르게 만드는 방법 Arrays.aslist 리터럴방식
				new Member("aaa", Member.MALE, 30),
				new Member("bbb", Member.FEMALE, 20),
				new Member("ccc", Member.MALE, 45),
				new Member("ddd", Member.FEMALE, 38)
				);
		
		//남성 평균나이
		//하나씩 작성
		Stream<Member> stream = list.stream(); //멤버타입으로 오리지널 스트림 받기
		//boolean test(T t)매개변수하나 predicate
		Stream<Member> maleStream = stream.filter(m -> m.getGender()==Member.MALE); //리턴타입 predicate = 람다로 던져달라는말
		IntStream ageStream = maleStream.mapToInt(Member::getAge);
		OptionalDouble op= ageStream.average();
		double avg = op.getAsDouble();
		
		System.out.println("남자 평균 나이 : " + avg);
		
		double maleAvg = list.stream().filter(m->m.getGender() == Member.MALE) // 간단하게인가?
				.mapToInt(Member::getAge).average().getAsDouble(); 
		double femaleAvg = list.stream().filter(m->m.getGender() == Member.FEMALE) 
				.mapToInt(Member::getAge).average().getAsDouble(); 
		
		System.out.println("남자 평균 나이 : " + maleAvg);
		System.out.println("남자 평균 나이 : " + femaleAvg);
		
		
	}

}
