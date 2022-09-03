package day07;
/*
	노래 한곡을 나타내는 Song 클래스를 작성하세요. Song은 다음 필드(변수)로 구성됩니다. 
		- 노래 제목을 나타내는 title
		- 가수를 나타내는 artist
		- 노래가 발표된 연도를 나타내는 year
		- 국적을 나타내는 country
	또한, Song클래스에 다음 생성자와 메서드를 작성하세요. 
		- 생성자 총 2개 : 기본생성자와 매개변수로 모든 필드를 초기화하는 생성자 
		- 노래 정보를 출력하는 show() 메서드 
	그리고 main 메서드에서는 2021년, 한국국적의 이무진이 부른 신호등 을 Song 객체로 생성,
	show() 메서드를 이용하여 정보를 아래와 같이 출력하세요. 
	
	콘솔 출력예 >> 2021년 한국국적의 이무진이 부른 신호등 
*/
class Song {
	// 변수
	private String title;
	private String artist;
	private int year;
	private String country;
	// 생성자 : 모든 필드를 초기화
	Song(){ }
	Song(String title, String artist, int year, String country){
		this.title = title;	this.artist = artist; this.year = year; this.country = country;
	}
	// 메서드
	public void setTitle(String title) {
		this.title = title;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getTitle() {
		return title;
	}
	public String getArtist() {
		return artist;
	}
	public int getYear() {
		return year;
	}
	public String getCountry() {
		return country;
	}
	public void show() {
//		콘솔 출력예 >> 2021년 한국국적의 이무진이 부른 신호등 
		System.out.println(year +"년 "+ country+"국적의 " + artist+"이 부른 "+ title);
	}
	
	
}
public class Test89 {
	public static void main(String[] args) {
		// 작성 필요
		Song s = new Song("신호등","이무진",2021,"한국"); //		그리고 main 메서드에서는 2021년, 한국국적의 이무진이 부른 신호등 을 Song 객체로 생성,
		s.show(); //		show() 메서드를 이용하여 정보를 아래와 같이 출력하세요. 
		
	}
}
