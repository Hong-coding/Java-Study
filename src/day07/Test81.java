package day07;

import java.util.Scanner;

class Book3 {
	// 변수
	String title;
	String author;
	// 생성자
	Book3(String title, String author){
		this.title = title;
		this.author = author;
	}
}
public class Test81 {

	public static void main(String[] args) {


		// Book3클래스를 활용하여 2개짜리 Book3
		
		Scanner sc = new Scanner(System.in);
		
		Book3[] books = new Book3[2]; // 배열객체 생성
		for(int i = 0; i < books.length; i++) {
			//이름과 저자를 입력부터 받아야 함
			System.out.println("제목>> ");
			String title = sc.nextLine();
			System.out.println("저자>> ");
			String author= sc.nextLine();
			
			books[i] = new Book3(title,author);
		}
		
		for(int i = 0; i<books.length; i++) {
			System.out.println(books[i].title +", "+books[i].author);
		}
		
		for(Book3 b: books) {
			System.out.println(b.title + "," +b.author);
		}
		
		
		
		System.out.println(books[0]);
		System.out.println(books[1]);
		
		
		sc.close();
	}

}
