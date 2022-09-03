package day07;

class Circle2{
	int radius;
	Circle2(){}
	Circle2(int radius){
		this.radius = radius;
	}
	
	Circle2 getCircleObj() {
		System.out.println("getCircleObj :" +this);
		return this;
	}
}
public class Test78 {

	
	public static void main(String[] args) {
			Circle2 c = new Circle2();
			System.out.println("main c : " +c); // c의 주소값
			System.out.println(c.getCircleObj()); // this 는 그 앞에 있는 c니까. 동일한 c의 주소값
			
			Circle2 d = new Circle2();
			System.out.println("main d : " +d); // d의 주소값 . 메모리 주소가 다름.
			System.out.println(d.getCircleObj()); // this는 객체 생성된 그 아이. 
			
		
		
		

	}

}
