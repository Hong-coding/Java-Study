package day09;
//상속, 생성자
/*
	Point를 상속받아 색을 가진 점을 나타내는 ColorPoint 클래스를 작성하세요. 
	main()메소드 적힌 코드들을 포함하고 아래와 같은 실행결과 출력되게 만드세요. 
	실행결과:
		RED색의 (10,20)의 점입니다.
*/
class Point {
	private int x, y;
	public Point(int x, int y) { this.x = x; this.y = y; }
	public int getX() { return x; }
	public int getY() { return y; }
	protected void move(int x, int y) { this.x = x; this.y = y; }
}

class ColorPoint extends Point{
	String col;
	// 생성자

	public ColorPoint(int x, int y, String col) {
		super(x, y); // 니가채워줘 토스
		this.col = col; // 이건 내가해주고
	
	}
	// 메서드
	void setXY(int x, int y) {
//		this.x = x; this.y = y // 구현된게 있으니까 이걸 해줄필요없음. private이라 어차피 못씀. set메서드도 없으니까 조정하려면 move써야만해
//		super(x, y);
		super.move(x, y); // 메서드를 이용해서 값을 넣음 // 생성자를 메서드에서 또 호출할 수 없으니 상속받은 메서드로 대신 일하게
	}
	void setColor(String col) {
		this.col = col;
	}
//	@Override
//	public String toString() {
//		return col+"색의 점"+x+y;
//	}
	
	@Override //
	public String toString() {
		return col+"색 (" + getX() +"," + getY()+")점";
	}
//	@Override
//	protected void move(int x, int y) {
//		super.move(x, y);
//	}	
}
public class Test122 {
	public static void main(String[] args) {

		ColorPoint cp = new ColorPoint(5, 5, "Yellow");
		cp.setXY(10,20);
		cp.setColor("RED");
		String str = cp.toString();
		System.out.println(str+"입니다.");

	}
}
