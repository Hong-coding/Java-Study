package day15;
//사용자정의 컬렉트
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamEx15 {

	public static void main(String[] args) {
		
		List<Person> list = Arrays.asList(
				new Person("피카츄", 10, Person.Gender.MALE),
				new Person("라이츄", 20, Person.Gender.FEMALE),
				new Person("파이리", 5, Person.Gender.MALE),
				new Person("꼬부기", 10, Person.Gender.FEMALE)
		);
		
		// 여자만 수집
		
		// 풀어서 작성
		Stream<Person> orgStream = list.stream(); // 전체를 가지고 있음
		Stream<Person> femaleStream = orgStream.filter(p->p.getGender()==Person.Gender.FEMALE); // 성별이 여자만 스트림을 가져옴
		
		//
		Supplier<FemalePerson> supplier = ()-> new FemalePerson(); // female객체가 최종공급 /Supplier는 function에있음
		BiConsumer<FemalePerson,Person> accumulator = (fp,p)->fp.accumulate(p);// 수집2개 던지래
		BiConsumer<FemalePerson,FemalePerson> combiner = (fp1, fp2) -> fp1.combine(fp2); 
		
		
		//<Object> Object java.util.stream.Stream.collect(
		// 		Supplier<Object> supplier, 
		//		 BiConsumer<Object, ? super Person> accumulator, 
		//		 BiConsumer<Object, Object> combiner)
		//				1.최종공급객체, 2.수집메서 드, 3.결합시키는메서드
		FemalePerson femalePerson = femaleStream.collect(supplier, accumulator, combiner); //세개에 들어가는걸위에서 준비
		
		//확인출력
		femalePerson.getList().stream().forEach(p->System.out.println(p.getName() + " " + p.getGender()));
		
		
		//줄여서 작성 (하더라도 기존 조합은 구현 해놔야 femalePerson)
		FemalePerson fPerson = list.stream()
		.filter( p -> p.getGender() == Person.Gender.FEMALE).collect( 
				()->new FemalePerson(),
				(fp,p)-> fp.accumulate(p),
				(fp1, fp2) -> fp1.combine(fp2)
		);//람다 3개작성
		
		  
		//좀더 간단하게. 참조형 ~~ 객체생성도, 메서드도 
		FemalePerson fP = list.stream()
				.filter(p->p.getGender()==Person.Gender.FEMALE)
				.collect( //람다 참조형으로~ (매개변수생략해서 메서드실행되도록)
						FemalePerson::new,
						FemalePerson::accumulate,
						FemalePerson::combine
				);
				fP.getList().stream()
				.forEach(p->System.out.println(p));
		
				
	}

}
