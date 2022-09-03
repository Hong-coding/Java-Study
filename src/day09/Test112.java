package day09;

class Person{}
class Student extends Person{}
class Teacher extends Person{}
class Professor extends Teacher{}

public class Test112 {
//	static void print(Person p) { //보내는 파라미터 타입이 다르다는 이유로 계속 쓰는 작업을 해야해
//								//부모변수에 자식객체를 받을 수 있으니까!!!!!!!!!!!!!!!!!!!! 한번만 쓰면돼
//								//p = new Student(); = Teacher(); 
//								// 다형성을 이 매개변수때문에 쓰는것. 데이터를 뭐가 올지 모르니까 부모를 써둠
//		if(p instanceof Person) {System.out.println("Person!");}
//	}
//	static void print(Student p) {
//		if(p instanceof Person) {System.out.println("Person!");}
//	}
//	static void print(Teacher p) {
//		if(p instanceof Person) {System.out.println("Person!");}
//	}
//	static void print(Professor p) {
//		if(p instanceof Person) {System.out.println("Person!");}
//	}
	
//	한줄로 줄이면
	static void print(Person p) { //보내는 파라미터 타입이 다르다는 이유로 계속 쓰는 작업을 해야해
		//부모변수에 자식객체를 받을 수 있으니까!!!!!!!!!!!!!!!!!!!! 한번만 쓰면돼
		//p = new Student(); = Teacher(); 
		// 다형성을 이 매개변수때문에 쓰는것. 데이터를 뭐가 올지 모르니까 부모를 써둠
		if(p instanceof Person) {System.out.println("Person!");}
		if(p instanceof Student) {System.out.println("Student!");}
		if(p instanceof Teacher) {System.out.println("Teacher!");}
		if(p instanceof Professor) {System.out.println("Professor!");}
	}

	public static void main(String[] args) {
			
//		print(new Person());
//		print(new Student());
//		print(new Teacher()); // person, teacher를 출력함
		print(new Professor()); // 조상부터 나까지 person, teacher, professor 3개를 출력함
	}

}
