package day07;

class Book2 {
	// 변수
	String title;
	String author;
	
	// 생성자
	Book2() {
		this("무제", "작자미상");
		System.out.println("생성자1 호출");
	}
	Book2(String title){ //생성자 오버로딩				// #3.
		//this.title = title;
		//this.author = "작자미상";
		this(title, "작자미상"); // 매개변수가 두개인 생성자를 호출 / 첫번째 명령문으로 가야 에러가 나지 않는다! 
		System.out.println("생성자2");						//#5
	}
	Book2(String title, String author){ //생성자 오버로딩	//#4.
		System.out.println("생성자3");
		this.title = title;
		this.author = author;
	}
	
	// 메서드
	void show() {
		System.out.println(title +" "+ author);	// 이 메서드 안에서는 동일한 지역변수 없으니까 this없어도 인스턴스변수인지 알지. 붙여도 됨.
	}
	
	
}
public class Test79 {
	

	public static void main(String[] args) { //#1.

//		Book2 little = new Book2("어린왕자","생텍쥐베리");
//		little.show();
		Book2 kong = new Book2("콩쥐팥쥐"); //콩쥐팥쥐 작자미상 #2.
		kong.show();						//#6.
		
		

	}

}
