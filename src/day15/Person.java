package day15;

public class Person {

	public enum Gender {MALE, FEMALE} //열거형상수집합 만드는 방법 
			//이름 첫글자 대문자로. << 일반변수 아닌거 표시(클래스이름이대문자니까) 
			//이름 {상수이름나열, 상수이름...} <<세미콜론 없음 
	public enum City{Seoul, Busan} // person.G
	

	private String name;
	private int age;
	private Gender gender;
	private City city;
	public Person(String name, int age, Gender gender) {			//3개받는 생성자 오버로딩
		this.name = name; this.age = age; this.gender = gender;
	}
	public Person(String name, int age, Gender gender, City city) {  //4개 받는 생성자 오버로딩
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.city = city;
	}
	public String getName() {return name;}
	public int getAge() {return age;}
	public Gender getGender() {return gender;}
	public City getCity() {return city;}
			
}
