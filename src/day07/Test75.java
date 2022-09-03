package day07;

class Book {
	String title;
	String author;
	
	// 매개변수가 있는 생성자가 작성되면, 인수를 안넣으면 객체 생성 안됨
	Book(String title){	// 책 제목을 외부로부터 입력받아 책 생산이 되도록 생성자를 만듦.
		this.title = title; //책을 만들 때는 책 제목을 넣어놓고 책을 만든다.
		author = "작자미상";
		
	}
	Book(String title, String author){
		this.title = title;
		this.author = author;
	}
}


public class Test75 {

	public static void main(String[] args) {
		Book kong = new Book("콩쥐팥쥐"); // 매개변수가 하나니까 첫번째 생성자로 만들어짐
		System.out.println(kong.title + " " + kong.author );
		
		Book prince = new Book("어린왕자", "생텍쥐베리"); // 매개변수가 두개라 두번째 생성자로 만들어짐
		System.out.println(prince.title + " " + prince.author);
		
	}

}
