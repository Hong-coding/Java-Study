package day07;

class Person {
	// 변수는 모두 private
	private String name;
	private int age; 	
	
	//Person(){}// 기본생성자 만드는게 캠슐화 정석
	
	// 메서드 공개할수 있게 따로 해놔야
	public void setName(String name) { // setter 또는 set메서드
		this.name = name;
	}
	public String getName() { // 외부에서 가져다 쓰는거니까 매개변수는 없지
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
}

public class Test83_게터세터 {

	public static void main(String[] args) {
		// 캡슐화 사용해보기
		
		Person p = new Person();	// 생성자 자동으로 기본생성자 눈에 안보이게 생김
		//p.name = "pikapika"; 불가능 직접 지정안됨
		p.setName("pika");				// 넣기
		//p.age 불가능
		System.out.println(p.getName()); //가져오기
		
		p.setAge(10);
		System.out.println(p.getAge());
	}

}
