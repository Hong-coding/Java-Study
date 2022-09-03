package day15;

import java.util.Arrays;
import java.util.List;

public class StreamEx06 {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("java8 lamda","stream mapping");
		list.stream() 										//반복자를 얻어와서 개별요소에 접근
		.flatMap(data -> Arrays.stream(data.split(" "))) 	//매개변수타입 Function<?아무거나 던져주면 , ?지정타입으로 반환함
															//리턴타입이 stream으로 리턴해줘야함, 배열을스트림으로변환감싸서리턴.뒤에체인계속써야하니까
		.forEach(word -> System.out.println(word));

		System.out.println();
		
		List<String> list2 = Arrays.asList("10, 20, 30","40, 50, 60"); // 쉽표구분과 띄어쓰기
		list2.stream()
		.flatMapToInt(data -> {
			String[] strArr = data.split(",");				//10 20 30 40 50 60 -공백도포함
			int[] arr = new int[strArr.length];				//크기같은 배열생성
			for(int i = 0; i < strArr.length; i++) {		
				arr[i] = Integer.parseInt(strArr[i].trim());//공백제거한값을 인트로바꿔서 차례로 넣고 
			}
			return Arrays.stream(arr);						//배열을 어레이로담아야스트림가능 -뒤에 최종처리를해주려고
			}).forEach(number -> System.out.println(number));
		
		// mapXXX()
		List<Student> stdList = Arrays.asList(	//아까 쓴 클래스파일 사용
				new Student("aaa",10),
				new Student("bbb",20),
				new Student("ccc",30),
				new Student("ddd",40)
		);
		
		stdList.stream()
		.mapToInt(Student::getScore) //람다 매개변수 다 생략하고 getScore만 참조하겠다~~ 객체 던지면 인트로 돌려줌. 스코어만 리턴받겠다~~
		.forEach(score-> System.out.println(score)); 
		
	
	}

}
