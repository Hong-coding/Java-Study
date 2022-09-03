package day08;
class Person{
	private int weight; // 몸무게는 숨길래
	int age;
	protected double height;
	public String name;
	
	public void setWeight(int weight) {	// 몸무게만 게터 세터 써주면 돼.
		this.weight = weight;	
	}
	public int getWeight() {
		return weight;
	}
}

class Student extends Person{ 	// weight, age, height, name, set() //setWeight(), getWeight()...
	public void set() {			//초기화
		age = 10;
		name = "김피카츄";
		height = 100.44; // 접근가능 자식이니까
		setWeight(100); // 상속받아도 오리진은 부모니까 우회해서 써야한다. 값을 저장하려면 weight = 100;이거 안됨// 접근 가능하려면 set
	}
}

public class Test103 {

	public static void main(String[] args) {
		Student s = new Student();
		s.set();

	}

}
