package day09;
//상속, 생성자
/*
	Point1를 상속받아 색을 가진 점을 나타내는 ColorPoint1 클래스를 작성하세요. 
	main()메소드 적힌 코드들을 포함하고 아래와 같은 실행결과 출력되게 만드세요. 
	실행결과:
		BLACK색의 (0,0)의 점입니다. 
		RED색의 (5,5)의 점입니다.
*/
class Point1 {
	private int x, y;
	public Point1(int x, int y) { this.x = x; this.y = y; }
	public int getX() { return x; }
	public int getY() { return y; }
	protected void move(int x, int y) { this.x = x; this.y = y; }
}
class ColorPoint1 extends Point1 {
	//생성자
	String col;
	ColorPoint1 (){
		super(0, 0); // 부모의 생성자 부르기// 값을 안받았으니까 0,0
		this.col = "black"; //ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ 매개변수 없으니까 미리 넣어줘야함. 초기화해주는거니까
	}
	
	ColorPoint1 (int x, int y){
//		this.x = x; this.y = y; //이렇게 안되니까 아래처럼 해야함
		super(x, y); // 부모의 생성자 부르기
		this.col = "black"; //ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ 여기도 초기화니까 필요
	
	}
	String setXY(int x, int y){

		return "(" +x +", "+y +")의 점";
	}
//	String setColor(String col) {
	void setColor(String col) { //리턴 타입 업슴니다!ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
//		return col +"색";
		this.col = col; //ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	}
	@Override
	public String toString() {
		return col+"색의 ("+getX()+", "+getY() +")의 점";
	}
}
public class Test123 {

	public static void main(String[] args) {
		
		ColorPoint1 zeroPoint = new ColorPoint1();	// (0,0) 위치의 BLACK 색 점ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ매개변수 없는생성자도 오버로딩하는 문제
		System.out.println(zeroPoint.toString() + "입니다.");
		
		ColorPoint1 cp = new ColorPoint1(10,10);	// (10,10) 위치의 BLACK 색 점
		cp.setXY(5,5);
		cp.setColor("RED");
		System.out.println(cp.toString() + "입니다.");

	}

}
