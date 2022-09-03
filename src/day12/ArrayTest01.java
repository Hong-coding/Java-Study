package day12;

import java.util.ArrayList;

public class ArrayTest01 {

	public static void main(String[] args) {

		// ArrayList생성
		ArrayList<Integer> arr = new ArrayList<Integer>();
		//ArrayList<int> arr = new ArrayList<int>(); // 기본형 불가능. 래퍼클레스 써야
		
		// 요소 삽입
		arr.add(new Integer(10));
		arr.add(new Integer(-5));
		arr.add(new Integer(200));
		
		arr.add(20); // 그냥 넣으면 자동 언박싱 돼서 들어감
		arr.add(30);
		arr.add(40);
		arr.add(40);
		arr.add(null); // null 삽입 가능 주의 출력에서 nullPointException
		
		arr.add(2,1010);
		System.out.println(arr); // 반복문 없이 편하게 출력됨
		
		
		// 요소 꺼내기
		int val = arr.get(0);
		System.out.println(val);
		
		// 저장된 요소의 개수
		int size = arr.size();
		System.out.println(size);
		
		// 요소 삭제
		arr.remove(1);
		System.out.println(arr);
		
		// 값 변경
		int prev = arr.set(1, 2020);
		System.out.println(arr);
		System.out.println(prev); // 변경 전 기존에 저장되어있던 값을 리턴
		
		
		arr.clear();
		System.out.println(arr);
		
		ArrayList<String> strArr = new ArrayList<String>(); 
		strArr.get(prev);// 인티저로 하면 리턴 인티저로 스티링으로 하면 리턴 스트링으로. 제네릭타입으로 작성한거라 자동변환 편리.
		
		
		
	}

}
