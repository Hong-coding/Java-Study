package day09;

class Aclass {
	int x;
	void func() {
		System.out.println("AAA");
	}
}
class Bclass extends Aclass{
	int y;
	@Override
	void func() {
		System.out.println("BBB");
	}
	void sub() {
		System.out.println("subsub");
	}
}

public class Test111_instanceof {

	public static void main(String[] args) {
		
		/* #5예외처리
		Aclass a = new Bclass();
		Bclass b = null;
		
		if(a instanceof Bclass) { 	// true아니면 false를 도출하는 공식.  // 참조변수가 가르키는 실제객체가 Bclass의 객체가 맞는지 판단검증. 맞으면 true 아래실행
							//프로그램이 멈추지 않도록 안정된 검증을 거치는게 좋다.
			System.out.println("형변환 가능~~");
			b = (Bclass)a; //변수만봐선 안될거같으니까 형변환 공식 써야. 실제는 B<-B인데
		}	else {
			System.out.println("형변환 불가능~~");
		}*/
		
//		* instanceof 형변환체크는 부모를 넣어도 Object를 넣어도 true를 뱉지만,
//		검증을 나 자신을 하려는거니까(부모가 자식객체를 들고있는지 확인하려는거니까) 명확하게 Bclass를 넣어줘야
		
		/* #4
		Aclass a = null;
		Bclass b = new Bclass();
		Bclass b2 = null;
		
		a = (Aclass)b; // 부모에 자식을 넣은 것 O // 형변환을 생략해도 이클립스 에러 발생 안함.
					// 자식을 부모에 박는 것 = 업캐스팅
		//b2 = a; // B타입을 B타입에 넣는 것인데, 이클립스는 에러로 표현되지만 실행은 가능. a의 껍데기가 부모로 되어있어서
				// 에러 없애려면 앞에 실체 표현해야
		b2 = (Bclass)a;// 실체가 같은 타입이더라도 들고있는 변수가 부모라면, 맞는 타입에 대입할 때도 형변환이 반드시 필요하!!!
					// 부모형태를 자식꼅데기로 바꿔주는 것 = 다운캐스팅 // 형변환 생략하면 에러발생
					// 실제객체와 담는 변수의 타입이 무엇인지 잘봐야함.
				// 업이든 다운이든 빨리하고 가독성 늘리려면 다 붙여라. !
		b2.sub();
		
		
		
		/* #3
		Aclass a = new Aclass();
		Bclass b = null;
		
		b = (Bclass)a; //형변환 표기하면 에러가 사라짐 (이클립스가 에러못잡음 = 컴파일은 됨 , 문법적 에러, 컴파일 에러)
						//그러나 에러가 실행하면 부모가 자식으로 형변환 못한다고 나옴. (실행에러 = 런타임에러)
		//Bclass b = new Aclass(); 부모를 자식에게 넣겠다고 한것이나 마찬가지인것이기 때문에.
		//so 실제 a가 뭘 들고 있는지 파악하고 있어야 한다. 
		// so 형변환데이터 쓸대도 검증이 필요하다. 검증하는 법은 곧 배움
		
		/* #2
		Aclass a = null;
		Bclass b = new Bclass();
		a = b; 
		a.func(); //다형성한거라 이렇게 하면 에러가 안남.
		
		//하지만  a = b; 사이가 아주 길면 둘이 타입이 다른걸 모르게됨.  명시해줘야
		a = (Aclass)b; //A클래스타입으로 형변환 표기. 기본형끼리/ 참조형끼리/ 형변환 공식으로 사용 가능
					//클래스타입끼리 호환되지만 기본형과 참조형 호환이 잘 안됨
		
		
		
		/* #1
		Aclass a = new Aclass(); // 변수와 실제 객체 생성 클래스 파일 동일 
								// x, func(syso"AAA")
		Aclass a1 = new Bclass(); // 다형성으로 만듦. 부모자식이라 가능
								// x, @func(syso"BBB"), [y, sub()]
								// (y)를 안쓸거면 굳이 다형성 안하는게 맞지.
								// 다형성은 변수말고 메서드때문에 만드는 것. 오버라이딩된 애를 쓰려고
		System.out.println(a.x);
		a.func();
		
		System.out.println(a1.x); // 실제객체에 [y, sub()]있더라도 클래스 타입이 Aclass라 알아들을 수 업슴
		a1.func();
		*/
		
	}

}
