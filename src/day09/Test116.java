package day09;
//링크트리스트 구현
class ShapeClass{
	ShapeClass next; //다음 애 주소 들고있을 변수
	ShapeClass() {next = null;}
	void draw() {
		System.out.println("shape");
	}
}
class LineClass extends ShapeClass{
	//ShapeClass next; //눈에 안보이지만 부모거를 들고있음, 다음주소를 받을 곳이 있음.
	@Override				// 오버라이딩
	public void draw() {
		System.out.println("Line");
	}
}class RectClass extends ShapeClass{
	@Override				
	public void draw() {
		System.out.println("Rect");
	}
}class CircleClass extends ShapeClass{
	@Override				
	public void draw() {
		System.out.println("Circle");
	
	}
}
public class Test116 {

	public static void main(String[] args) {
		
		ShapeClass start, last, obj; ////////////여기 왜 타입이 안붙지? - 클래스 선언

		//시작하는 애의 주소는 훼손되면 안된다. 그래서 새로 obj만든다 
		start = new LineClass();
		last = start;
		obj = new RectClass(); 
		last.next = obj;//방금만든 애에 링크 걸어줌. 임시변수
		last = obj; 
		obj = new LineClass();// 다시 하나 더 연결
		last.next = obj;
		last = obj;
		obj = new CircleClass();
		last.next = obj;
		last = obj;

		//모든 도형 출력
		ShapeClass s = start;
		while(s != null) { //널 아닐때까지 반복
			s.draw();
			s = s.next;
		}
	}

}
