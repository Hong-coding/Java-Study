package day07;

class Circle{
	int radius;	// 인스턴스변수 반지름
	
	// 자동으로 기본생성자 생성되는 형태
	// Circle(){} // <- 눈에 안보이는 생성자가 생성되어 실행하며 객체 생성됨. so . 모든 클래스는 다 생성자를 가지고 있다.
	void set(int r) {	// 반지름값을 세팅해주는 메서드
		radius = r;
	}
	double getArea() {	// 원의 너비를 구해주는 메서드
		return radius * radius *3.15;
	}
}
public class Test76 {

	public static void main(String[] args) {

		Circle pizza = new Circle();
		pizza.set(15); //값을 안넣으면 0결과 나옴 기본생성자가 자동으로 만들어진 것. //Circle(){}
		System.out.println(pizza.getArea());

	}

}
