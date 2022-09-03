package day15;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx16 {

	public static void main(String[] args) {

		List<Person> list = Arrays.asList(
				new Person("aaa", 10, Person.Gender.MALE, Person.City.Seoul),
				new Person("bbb", 20, Person.Gender.FEMALE, Person.City.Busan),
				new Person("ccc", 5, Person.Gender.MALE, Person.City.Busan),
				new Person("ddd", 10, Person.Gender.FEMALE, Person.City.Seoul)
		);
//		// 사람들을 성별로 그루핑하고, 같은 그룹에 속하는 사람 List를 생성한 후
//		// 성별을 키로, 사람 List를 값으로 갖는 Map을 얻어보자.
//		//풀어서 작성
//		Stream<Person> orgStream = list.stream(); //Person요소를 가지고있는 스트림을 얻어서
//		
//		// Function<? super Object, ? extends Object> classifier
//		//그루핑 기준. Person받아서 Gender가져와라 (그루핑기준)
//		Function<Person, Person.Gender> classifier = Person::getGender; 
//		// 		Person줄테니, ?생략뭔진모르겠지만, Map으로 줘<키는 젠더고, 값은 리스트야. 펄슨이 들어있는>
//		Collector<Person, ?, Map<Person.Gender, List<Person>>> collector= Collectors.groupingBy(classifier);
//		Map<Person.Gender, List<Person>> mapList = orgStream.collect(collector); //그루핑 할 컬렉터 만들어야
//		
//		
//		//줄여서 작성이 더 쉽다
//		//Map<Person.Gender, Person.Gender> genderMap 
//		Map<Person.Gender, List<Person>> genderMap = list.stream() //리스트로저장
//		.collect(Collectors.groupingBy(Person::getGender));
//		
//		//출력확인 
//		System.out.println("** 남그룹 **");
//		mapList.get(Person.Gender.MALE).stream() //남자를가져와맴형태리스트의 스트림을 얻어서
//		.forEach(p->System.out.println(p.getName()+" "+p.getGender())); //반복하면서 나열
		
		
		
		// 사랍들을 도시별로 그루핑하고, 같은 그룹에 속하는 사람들의 이름List로 생성해, 
		// 도시를 키로, 이름List를 값으로 갖는 Map을 생성하자
		
		//플아서 작성 
		//*원본 데이터에서 스트림 얻어오기
		Stream<Person> orgStr = list.stream(); //
		//#1. 그루핑 기준 : 사람을줄게, 그사람의City를가져와서 / 기준으로 쓸거야~
		Function<Person, Person.City> classifierC = Person::getCity;

		//---------------*이름만 리스트로 수집
		//#2. 이름을 리스트로 수집(매핑)하는 기준: 사람줄게 이름 수집해줘 / 기준으로 쓸거야~
		Function<Person, String> mapperN = Person::getName;
		//이름을 리스트로 수집해줄 컬렉터 
		// mapper(이름)를 기준으로 매핑해서, 리스트로 수집해올 컬렉터
		Collector<String,?,List<String>> collectorNL = Collectors.toList();
		//----------------- #2사람줄테니까 맞는이름을 #1 리스트로 수집해줘
		Collector<Person,?,List<String>> collectorNPL 
				= Collectors.mapping(mapperN, collectorNL);
		
		// *원하는 그룹으로 수집해주는 수집기
		Collector<Person, ?, Map<Person.City, List<String>>> collectorFinal
				= Collectors.groupingBy(classifierC, collectorNPL);
		
		//*최종 수집
		Map<Person.City, List<String>> mapByCity = orgStr.collect(collectorFinal);
		
		
		//줄여서
		list.stream().collect(Collectors.groupingBy(
				Person::getCity,
				Collectors.mapping(Person::getName, Collectors.toList())
				)
		);
		
		
		
		
		//*출력확인
		System.out.println("***********서울**********");
		mapByCity.get(Person.City.Seoul)
		.stream().forEach(p ->System.out.println(p));

		System.out.println("***********부산**********");
		System.out.println("부산");
		mapByCity.get(Person.City.Busan)
		.stream().forEach(p ->System.out.println(p));
	}

}
