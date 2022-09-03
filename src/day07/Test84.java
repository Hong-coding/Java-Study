package day07;
// 캡슐화 활용
class Person2{
	private int age = 1;
	public void setAge(int age) {
		if(age > 0&& age <150){ // 입력값 검증할 수 있는 코드 
								//변수에 바로 입력하게 하는 건 검증할 수 있는 절차가 업ㅅ읍
			this.age = age;
			
		}else {
			System.out.println("나이가 이상해요..");
		}
	}
	public int getAge() {
		return age;
	}
}
//연습
//이름, 나이, 혈액형, 키, 주소, 전화번호, 주민번호에 해당하는 변수들과
//get/set메서드 만들기 (캡술화) 데이터타입 여러개 섞어서 해보기

class Person3{
	private String name;
	private int age;
	private String blood;
	private double height;
	private String address;
	private String phone;
	private String id;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public void setBlood(String blood) {
		this.blood = blood;
	}
	public String getBlood() {
		return blood;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	public double getHeight() {
		return height;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getAddress () {
		return address;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPhone() {
		return phone;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return id;
	}
	
	

	
}
public class Test84 {

	public static void main(String[] args) {
		
		Person2 p = new Person2();
		p.setAge(20);
		System.out.println(p.getAge());
		
		
		// 연습
		// 이름, 나이, 혈액형, 키, 주소, 전화번호, 주민번호에 해당하는 변수들과
		// get/set메서드 만들기 (캡술화) 데이터타입 여러개 섞어서 해보기
		Person3 p2 = new Person3();
		p2.setName("피카츄");
		p2.setAge(10);
		p2.setAddress("일본");
		p2.setBlood("ab");
		p2.setHeight(35);
		p2.setPhone("01012341234");
		System.out.println(p2.getName() + p2.getAge() + p2.getAddress()+ p2.getBlood());
	}
	

}
