package day12;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/*  HashMap
	id와 tel(전화번호)로 구성된 Student클래스를 만들고, 
	이름을 key로하고 Student 객체를 값으로 하는 HashMap을 작성해보세요. 
	5명 정도 HashMap에 미리 저장해놓고,  
	이름을 검색하면 id와 전화번호 출력되며, exit를 입력하면 프로그램 종료. 
*/
class Student{
	String id, tel;
}
public class CollEx01 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		HashMap<String, String> h = new HashMap<String, String>();
		h.put("가영", "01012341234");
		h.put("나영", "01023452345");
		h.put("다영", "01034556345");
		h.put("라영", "01045645456");
		h.put("마영", "01056776555");
		
		
		Student s = new Student();
		
		while(true) {
			System.out.println("이름 >>");
			String input = sc.nextLine().trim();
			if(input.equals("exit")) {
				System.out.println("프로그램 종료");
				break;
			}
			if(h.containsKey(input)) {
				System.out.println(input+"님의 연락처는 "+ h.get(input) +"입니다.");
			}else {
				System.out.println("해당 이름 정보는 없습니다.");
			}
			
//			Set<String> keys = h.keySet(); //인덱스 없으니까 키들만 다 모아서 
//			Iterator<String> it = keys.iterator(); // 반복자얻기
//			while(it.hasNext()) {
//				String key  = it.next(); // 키하나 꺼내기
//				if (key.equals(s.id)){
//					System.out.println(s.id+" : "+ h.get(key));
//					break;
//				}
//			}
			
//			if((h.get(s.id).equals(null))){
//				System.out.println("해당 정보는 없습니다");
//			}else {
//				System.out.print(s.id);			
//				System.out.print(", ");
//				System.out.println();
//			}
//			
//			if ((sc.nextLine()).equals("exit")){
//				System.out.println("프로그램 종료");
//				break;
//			}
		}
			
		
			
		
		
	}
}
