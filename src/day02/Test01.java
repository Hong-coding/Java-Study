package day02;

import java.util.Scanner; //#1. import문 작성
public class Test01 {

	public static void main(String[] args) {
		// #2. Scanner 객체 작성
		Scanner sc = new Scanner(System.in);
		// #3. 입력받기
		System.out.println("이름을 입력하세요 :");
		String abc = sc.nextLine();
		System.out.println("이름은 "+abc+" 입니다.");
		
		System.out.println("나이를 입력하세요 :");
		String def = sc.nextLine();
		System.out.println("내년 나이는 "+(def+1)+" 입니다.");
		//형변환
//		int defInt = (int)def; String은 타입이 다름 . int는 기본형이고, String은 참조형임. 서로 호환 바로 안되니까 형변환을 위해서 특별 클래스를 사용해야 한다
		int defInt = Integer.parseInt(def); // 클래스로 만들어논 것. parsing 변환시킴 
		//원하는 만큼 입력받기
		System.out.println("내년 나이는 "+(defInt+1)+" 입니다.");
		// #4. 객체 닫기
		sc.close();

	}

}
