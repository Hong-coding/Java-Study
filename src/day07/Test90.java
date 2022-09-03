package day07;
/*
	직사각형을 표현하는 Rectangle 클래스를 작성하세요. 
	- int 타입의 x, y, width, height 필드 : 사각형을 구성하는 점과 크기 정보 
	 * x,y는 사각형의 왼쪽 위의 점을 말함. (0,0)은 왼쪽 위, x값은 오른쪽으로 증가, y값은 아래로 증가 
	- x, y, width, height 값을 매개변수로 받아 필드를 초기화하는 생성자 
	- int squareArea()  메서드 : 사각형의 너비 리턴 
	- void show() 메서드 : 사각형의 좌표와 너비 출력 
	- boolean contains(Rectangle r) : 매개변수로 받은 r이 현 사각형 안에 있으면 true리턴 
	콘솔 출력예 >>
		(2,2)에서 크기가 8x7인 사각형
		b의 면적은 36
		c는 a를 포함합니다. 
*/
class Rectangle {
	// 변수 
	//private int x;private int y;private int width;private int height; 
	// 생성자 
	//Rectangle(int x, int y, int width, int height){this.x = x; this.y = y; this.width = width; this.height = height;}
	
	int x, y, width, height; //	- int 타입의 x, y, width, height 필드 : 사각형을 구성하는 점과 크기 정보 
	public Rectangle(int x, int y, int width, int height) {//- x, y, width, height 값을 매개변수로 받아 필드를 초기화하는 생성자 
		// public안써도 상관없다. 클래스에서 생성자 안쓰면 default 값이니까. 
		this.x = x;	this.y = y;	this.width = width;	this.height = height;
	}
	
	
	public void setX(int x) {this.x = x;}
	public void setY(int y) {this.y = y;}
	public void setWidth(int width) {this.width = width;}
	public void setHeight(int height) {this.height = height;}
	public int getX() {return x;}
	public int getY() {return y;}
	public int getWidth() {return width;}
	public int getHeight() {return height;}
	
	// 메서드
	public int squareArea() { //: 사각형의 너비 리턴하는 메서드. 여기도 마찬가지로 메서드에 public 안붙여도 그만
//		return (width-x)*(height-y);
		return width*height;
	}

	void show () {			//: 사각형의 좌표와 너비 출력하는 메서드
		System.out.println("("+x+","+y+")에서 크기가"+ width+"x"+height+"인 사각형");
		
	}
//	
	boolean contains(Rectangle r) { // 클래스 내부의 메서드 : 매개변수로 받은 r이 현 사각형 안에 있으면 true리턴 
//		System.out.println("도형" + r);// 주소출력. r은 참조형, 주소값만 받은 애고 아직 구체적인 객체가 생성되기 전
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ 이름으로 나오게 하려면 어떻게 해야하지? 구체적인 객체가 생성된 후. 
		if(r.x > x && (x+width) > (r.x + r.width) && r.y > y && (r.y+r.height) < (y+height)) 
		// 왼쪽 상단 꼭지점과 오른쪽 하단 꼭지점 . 두개만 비교해도 되는 것임. ---> 근데 결국 식은 동일하네?
		// 왼쪽 상단의 꼭지점 : (x, y) 와 (r.x, r.y) 비교 앞에 포함되려면 <
		// 오른쪽 하단의 꼭지점 : (x+width, y+height) 와 (r.x + r.width, r.y + r.height) 비교 앞에 포함되려면 >
		//if(r.x > x && (x+width) > (r.x + r.width) && r.y > y && (r.y+r.height) < (y+height)) 
		{return true;}
		return false;
	}
	
	
//	콘솔 출력예 >>
//	(2,2)에서 크기가 8x7인 사각형
//	b의 면적은 36
//	c는 a를 포함합니다. 
}
public class Test90 {
	public static void main(String[] args) {
		// main작성은 완료.
//		/*
		// main에 객체를 생성한다! - 아무런 출력이 없다! 
		Rectangle a = new Rectangle(2, 2, 8, 7); 
		Rectangle b = new Rectangle(5, 5, 6, 6); 
		Rectangle c = new Rectangle(1, 1, 10, 10); 
		// 객체를 생성하고 나서 다른 기능을 구현한 메서드를 작성한걸 실행해야 한다.
		a.show(); 
		System.out.println("b의 면적은 " + b.squareArea()); 
		
		// 불리안 데이터 타입과 결합해서 완성되는 코드. 
		//서로 포함관계를 나타내고 싶다면 ?????/ - a, b, c를 배열에 담아서 반복문을 돌려야겠다. 맞나? 
		if(a.contains(b)) System.out.println("a > b");
		if(a.contains(c)) System.out.println("a > c");
		if(b.contains(a)) System.out.println("b > a");
		if(b.contains(c)) System.out.println("b < c");
		if(c.contains(a)) System.out.println("c는 a를 포함합니다."); // if(true){출력명령} 명령 실행됨
		if(c.contains(b)) System.out.println("c는 b를 포함합니다."); // if(false){출력명령} 명령 실행하지 않음
//		*/
		b.show();
		c.show();
		
		
		
	}
}
