package day12;

import java.util.Vector;

public class VecTest03 {

	public static void main(String[] args) {

//		Vector<String> v = new Vector<String>(); // 10개 공간 == idx 9
//		v.add(0, "hello");
//		v.add(1, "hello"); // 순서대로 넣게 변했네..
//		v.add("hi");
//		System.out.println(v);
		
		Vector v = new Vector(); //제네릭 타입을 안적으면 Object로 처리. 모든 타입을 섞어서 저장 가능
		// 그러나, 꺼냈을때도 Object로 돌려주무르
		// 온전히 내용물을 사용하려면, 맞는 타입으로 형변환해 담아서 사용해야함. 제네릭은 자동으로형변환하는거...
		
		v.add(10);
		v.add("hello");
		v.add(3.14);
		v.add(new Point(1,2)); //이전파일에서 만튼 클래스
		System.out.println(v);
		System.out.println(v.get(0));
		
		//System.out.println(v.get(1).length());// 대신 Object로 받으면 이게 안돼 (ArryTest02.java)
		// Object는 length라는 메서드가 없기 때문 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ 다형성
		Object o = v.get(1);
		String str = (String)o; //형변환해서 받아서 넣어놈. instanceof 생략. 하는게 맞음
		str.length(); //이렇게 하면 먹힘
		System.out.println(str.length());
		
		Object o2 = v.get(3); 
		//System.out.println(o2.getX());
		if(o2 instanceof Point) {
			Point p = (Point)o2;
			System.out.println(p.getX());
			System.out.println(p.getY());
		}
		
		
//		List list = new ArrayList(); //다형성 데이터 전달할 때 부모타입으로 느슨하게 해주려고
//		list = new Vector(); //리스트는 부모. 인터페이트 타입. 어레이를 담든 벡터를 담든 다 담을 수 있어용
//		list = new Stack(); 
		
		
		
		
		
		
		
		
		
	}

}
