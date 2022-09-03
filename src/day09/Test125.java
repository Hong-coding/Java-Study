package day09;
//상속, 생성자
/*
	Point3를 상속받아 양수의 공간에서만 점을 나타내는 PositivePoint 클래스를 작성하세요. 
	main()메소드 적힌 코드들을 포함하고 아래와 같은 실행결과 출력되게 만드세요. 
	실행결과:
		(10,10)의 점입니다.
		(10,10)의 점입니다.
		(0,0)의 점입니다.
*/
class Point3 {
	private int x, y;
//	Point3 (){};//이걸 건드리는게 아님
	public Point3(int x, int y) { this.x = x; this.y = y; }
	public int getX() { return x; }
	public int getY() { return y; }
	protected void move(int x, int y) { this.x = x; this.y = y; }
}
class PositivePoint extends Point3{
	PositivePoint(){
		super(0,0); 	// ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ준게 없으니까 값을 0으로 채워서 보낸다
	}
	public PositivePoint(int x, int y) {
		super(0,0); //처음 값이 0,0이니까 if문이 될 수 없다// 트릭 먼저 0값을 넣어놓고 시작!!!!
		if(x> 0 && y > 0) {//ㅡㅡㅡㅡㅡ체크를 투스트링아니고 여기서 /super를 체크하는게 아님
//			super(x, y);
			move(x,y);
//		}else {				// 이미 0,0d으로 셋팅 먼저 해놓으면 엘스도 필요없어!!!!!
//			super(0,0);
			
		}
	}
	
	
	//무브 오버라이딩 필요 체크해야
	@Override
	protected void move(int x, int y) {
		if(x> 0 && y > 0) {
//			move(x,y);
		super.move(x, y);// 여기서는 오버라이딩이니까 슈퍼 안붙이면 안돼.
	
		}
	}
	@Override
	public String toString() {
		return "(" + super.getX() + "," + super.getY() +")의 점";
	}
}

public class Test125 {
	public static void main(String[] args) {

		PositivePoint p = new PositivePoint(); //기본생성자 필요
		p.move(10, 10);
		System.out.println(p.toString() + "입니다.");
		
		p.move(-5, 5);		// 객체 p는 음수 공간으로 이동되지 않음
		System.out.println(p.toString() + "입니다.");
		
		PositivePoint p2 = new PositivePoint(-10, -10);
		System.out.println(p2.toString() + "입니다.");
		
	}
}
