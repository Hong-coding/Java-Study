package example.method;

class Person{	
	private String name;
	Person(){
	}
	Person(String name){
		this.name = name;
	}	
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "나는 " + name + "라고~~";
	}
}
public class main {
	public static void main(String[] args) {
		Person person1 = new Person("김하나");
		System.out.println(person1);
		System.out.println(person1.getName());

		int b = 12345;
		double c = 12345.00005;
		
		System.out.println(String.format("%20d", b) + "끝");
		System.out.println(String.format("%20f", c) + "끝");

		System.out.println(String.format("%020d", b) + "끝");
		System.out.println(String.format("%020f", c) + "끝");		
	}
}
