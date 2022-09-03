package day15;

import java.util.Arrays;
import java.util.List;

public class StreamEx05 {

	public static void main(String[] args) {

		List<String> names = Arrays.asList( "김피카츄","박꼬북이","김라이츄","최파이리","김피카츄","이상해씨"	);

	System.out.println("--------중복제거----------");
	//중복제거
	names.stream()
	.distinct() // 중복제거 후
	.forEach(n->System.out.println(n)); //최종처리 꼭 해줘야

	
	System.out.println("---------필터링-----------");
	//필터링
	names.stream()
	.filter(n->n.startsWith("김"))//요소 하나 받아서 어떤 조건인 것(true,flase)으로 걸러내~
	.forEach(n->System.out.println(n)); 
	
	System.out.println("------ 중복제거 + 필터링 -------"); //최종메서드
	//중복제거 후 필터링
	names.stream()
	.distinct()
	.filter(n->n.startsWith("김"))
	.forEach(n->System.out.println(n));
	
	}

}
