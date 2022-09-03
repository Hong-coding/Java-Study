package day08;
//상속
class Super {
	static int a = 100; //클래스변수
	int x = 10;
}

class Sub extends Super {	// x, y
	int y = 20;
}
public class Test101_상속 {

	public static void main(String[] args) {
		
		Sub s = new Sub();
		//s.x 뒤에 x, y 원래소속 Super Sub 도 표기되어 있음
		//s가 가진 s.x, s.y 가 따로 있는것.
		System.out.println(s.toString()); // Object한테 물려받음. 주소형태로 리턴하는 메서드. 생략해도가능
		System.out.println(s); //생략해도가능

		System.out.println(Super.a);
		System.out.println(Sub.a); // 상속받아서 이렇게 자기것인냥 쓸수도 있다.
		
	}

}
