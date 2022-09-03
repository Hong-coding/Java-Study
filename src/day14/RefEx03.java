package day14;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

class Member2 {
	private String name;
	private String id;
	
	public Member2() {
		System.out.println("Member 기본 생성자");
	}
	public Member2(String id) {
		System.out.println("Member (id) 생성자");
		this.id = id;
	}
	public Member2(String name, String id) {
		System.out.println("Memever(name, id) 생성자");
		this.name = name; this.id = id;
		
	}
	public String getId() {return id;}
	public String getName() {return name;}
	
}
public class RefEx03 {

	public static void main(String[] args) {

		//Function<T, U>
		//U apply(T t) {return new Member2();} //t로받아 내부 구현되있는건 멤버투객체생선리턴 
		Function<String, Member2> func = Member2::new;//문자열 던저주면 Member2객체 돌려주는 (객체생성으로 리턴해줘)
		Member2 member = func.apply("Apple");
		System.out.println(member.getId());
		
		BiFunction<String, String, Member2> func2= Member2::new;
		Member2 member2 = func2.apply("bear", "곰");
		System.out.println(member2.getId());
		System.out.println(member2.getName());
		
		Supplier<Member2> sup = Member2::new;
		Member2 member3 = sup.get();
		System.out.println(member3.getId());//null
		
		Consumer<Integer> c = (x) -> System.out.println(x);//기본람다식
		c = System.out::println; 
		c.accept(100);
	}

}
