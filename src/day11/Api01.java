package day11;
class A{}
public class Api01 {

	public static void main(String[] args) {

		A a = new A();
		System.out.println(a.getClass());
		System.out.println(Integer.toHexString(a.hashCode()));
		System.out.println(a.hashCode());
		
	}

}
