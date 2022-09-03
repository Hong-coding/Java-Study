package day15;
// Iterator vs. Stream
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx01 {

	public static void main(String[] args) {

			List<String> list = Arrays.asList("aaa","bbb","ccc"); //new말고 리터럴방식으로 배열생성
			
			// Iterator
			Iterator<String> it = list.iterator();// 반복자 얻어오기
			while(it.hasNext()) {
				String str = it.next();
				System.out.println(str);
			}
			// Stream
			Stream<String> stream = list.stream(); //반복자 얻어오기 컬렉션에 있는 매서드.
			stream.forEach(str->System.out.println(str));//업그레이드포문 포이치문처럼 개별 데이터 요소를 반복함 (괄호 내부 변수 하나) (던져주는 변수가 str)
			//동일결과
			for(String s: list) {
				
			}
			/*
			 컬렉션의 Stream() 메서드로 스트림객체(반복자)얻고,
			 stream.forEach(람다); 메서드를 통해
			 컬렉션의 요소를 하나씩 접근해 사용가능.
			 
			 forEach(Consumer<T> action)
			 		void accept(T t) 추상 오버라이드 <-- 람다
			 */
			
	}

}
