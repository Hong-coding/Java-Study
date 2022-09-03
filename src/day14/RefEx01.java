package day14;

import java.util.function.IntBinaryOperator;

class Calc{
	//클래스 메서드
	public static int staticMethod(int x, int y) {
		return x+ y;
	}
	//인스턴스 메서드
	public int instanceMethod(int x, int y) {
		return x+ y;
	}
}
public class RefEx01 {

	public static void main(String[] args) {

		IntBinaryOperator op; //선언
		
		// int applyAsInt(int x, int y)
		// 클래스 메서드
		op = (x, y) -> Calc.staticMethod(x, y); //알반람다. applyAsInt를 오버라이딩으로 구현해놓고 op에 담아놓음
		System.out.println("결과1 : "+ op.applyAsInt(1, 2));
		
		op = Calc :: staticMethod; //메서드 참조형태, 두개 받겠거니 ~~해서 안적어도 됨
		System.out.println("결과2 : "+ op.applyAsInt(3, 4));
		
		// 인스턴스 메서드 참조하려면 객체생성이 필요
		Calc calc = new Calc();
		
		op = (x,y) -> calc.instanceMethod(x, y);
		System.out.println("결과 3 : "+ op.applyAsInt(5, 6));
		
		op = calc::instanceMetod; //참조로 바꾸기 이름만 붙여주면 됨. 클래스메서드랑 달리 변수명이라 소문자.
		System.out.println("결과 4 : "+ op.applyAsInt(7, 8));
		
		
		
		
		
		
		
		
	}

}
