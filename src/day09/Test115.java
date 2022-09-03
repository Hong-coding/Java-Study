package day09;
// 오버라이딩으로 다형성 실현
class Shape{
	public void draw() {
		System.out.println("Shape");
	}
}
class Line extends Shape {
	@Override				// 오버라이딩
	public void draw() {
		System.out.println("Line");
	}
}
class Rect extends Shape {
	@Override
	public void draw() {
		System.out.println("Rect");
	}
}
class Circle extends Shape{
	@Override
	public void draw() {
		System.out.println("Circle");
	}
}
public class Test115 {

	static void paint(Shape s) { //매개변수의 다형성. 오버라이딩 해놔서 가능한 것
		s.draw();
		
	}
	public static void main(String[] args) { 
		Line line = new Line();
		paint(line);
		paint(new Shape());
		paint(new Line());
		paint(new Rect());
		paint(new Circle());
		
	}

}
