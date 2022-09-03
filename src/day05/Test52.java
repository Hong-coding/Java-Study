package day05;

// 1. 클래스 정의: 사용자가 정의한 데이터 타입이 클래스, 변수도 들어가고 메서드도 들어감. 기본형은 메모리 양이 정해진 것/ 참조형은 개발자가 필요한만큼 메모르리를 직접 정의해서 만드는 것. 
//클래스는 유사한 특징 지닌 객체들의 속성을 묶은 집함. 객체는 실제 존재하는 Object라 클래스 내부 값을 사용하려면 객체를 만들어야 쓸 수 있음
class Tv{ // 파일 안에 main 메서드가 있으면 public class 선언 하면 안됨. 파일 내 public 클래스는 하나만.
	// Tv의 상태를 값으로 갖고 있게 변수 생성
	boolean power = false;
	int vol = 0, ch = 1; ////// 클래스 정의하는 부분에 넣는 것이 공장 초기값.
	
}
public class Test52 {
	//변수
	int abc = 123;
	//메서드
	public static void main(String[] args) {
		
		
		Test52 test = new Test52(); //클래스(Test52,Tv)는 객체 생성이 가능하다.
		System.out.println(test.abc);
		//변수를 저장할수도 있는데 변수를 출력하려면 객체를 생성해야 할수 있음
		
		String str = new String(); // (대문자로시작=)클래스 객체 생성 가능.
		
		
		
		
		
		// #2. 객체(인스턴스) 생성 . 마구찍어내야지 
		Tv t = new Tv();
		System.out.println(t.power);
		System.out.println(t.ch);
		System.out.println(t.vol);
		
		Tv t1 = new Tv(); // new하는 순간 주소 (공간) 만들어짐 클래스명@객체고유번호(일련번호)
		Tv t2 = new Tv();
		Tv t3 = new Tv();
		
		t1.ch = 10;		// 객체가 다르기 때문에 이렇게 넣으면 따로 데이터 저장됨
		t2.ch = 20;
		System.out.println(t1.ch);
		System.out.println(t2.ch);
		
		// 같은 타입끼리 대입 가능
		int a = 10;
		int b = 20;
		a = b;
		b = a;
		
		t1 = t2;  // 둘다 참조변수.Tv타입이니까 넣을 수 있지 t1에 연결되어 있던건 끊기면서 heap에 저장된 메모리는 지워짐.
		t2 = t1;
		// 불가능 (다른타입)
		//t1 = t2.ch; // t1 Tv타임, t2의 ch은 int타입이라 대입 불가
		//t1 = t2.power; 
		
		// 가능 (같은 타입)
		t1.ch = t2.ch;
		t2.power = t3.power; 
		
		a = t1.ch;
		boolean play = t3.power; //참조변수의 이름은 아무 상관없음. 데이터 타입이 동일하면 치환가능
								// 메모리의 크기가 동일하게 점유하고 있어야.
		
		
	}

}
