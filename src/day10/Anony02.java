package day10;

class Person{
	void wake() {
		System.out.println("7시 기상");
	}
}
class Anony{
	Person p = new Person() {
		void work() {
			System.out.println("출근");
		}
		void wake() {
			System.out.println("6시기상");
			work();
		}
	}; //확장해서 쓰는거니까 대괄호가 바로 붙어버림
}
public class Anony02 {

	public static void main(String[] args) {

		Anony anony = new Anony();
		anony.p.wake();

	}

}
