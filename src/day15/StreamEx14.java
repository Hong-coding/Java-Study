package day15;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StreamEx14 {

	public static void main(String[] args) {

		List<Person> list = Arrays.asList(
				new Person("피카츄", 10, Person.Gender.MALE),
				new Person("라이츄", 20, Person.Gender.FEMALE),
				new Person("파이리", 5, Person.Gender.MALE),
				new Person("꼬부기", 10, Person.Gender.FEMALE)
		);
		// Person들 중 남자만 필터링 별도의 List 생성
		//풀어서 작성
		Stream<Person> orgStream = list.stream(); // 스트림 얻어와서 
		Stream<Person> maleStream = orgStream.filter(p->p.getGender()== Person.Gender.MALE); //남자만
		Collector<Person, ?, List<Person>>  collector = Collectors.toList(); 
					//Person타입인거아니까이걸 모아 List그릇에.. 리스트로수집하는컬렉터스에서가져온거담아놈
		List<Person> maleList = maleStream.collect(collector); // maleStream아 collector던져줄게 이거로 수집좀해줘거기서
		
		maleList.stream().forEach(l -> System.out.println(l.getName()+"는 "+l.getGender()));
		
		//줄여서
		List<Person> femaleList = list.stream()
		.filter(p->p.getGender() == Person.Gender.FEMALE)
		.collect(Collectors.toList());
		
		femaleList.stream()
		.forEach(l->System.out.println(l.getName()+"는 "+l.getGender()));
		System.out.println();
		
	}

}
