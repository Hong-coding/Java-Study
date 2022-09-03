package day12;

import java.util.Vector;

class Point{
	private int x, y;
	public Point(int x, int y) {
		this.x = x; this.y = y;
	}
	@Override
	public String toString() { // 오버라이딩 안하면 [] 객체 주소들로 나옴.

		return "(" + x +","+y+")";
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
}
public class VecTest02 {

	public static void main(String[] args) {
		
		Vector<Point> v = new Vector<Point>();
		
		v.add(new Point(2,3));
		v.add(new Point(20,30));
		v.add(new Point(200,300));

		
		System.out.println(v);
		
		for(int i = 0; i < v.size(); i++) {
			
			//단발성 호출은 변수에 담을 필요 없으니까
			System.out.println(v.get(i).getX());
			System.out.println(v.get(i).getY());
			
			//이게 위어꺼 풀어놓은 것
//			Point p = v.get(i);
//			System.out.println(p);
//			System.out.println(p.getX());
//			System.out.println(p.getY());
			
		}
		
		
		
		
		
		
		
	}

}
