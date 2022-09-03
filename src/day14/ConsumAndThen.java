package day14;

import java.util.function.Consumer;
import java.util.function.Function;

class Member{
	private String name;
	private String id;
	private Address addr;
	public Member(String name, String id, Address addr) {
		this.name = name; this.id = id; this.addr= addr;
	}
	public String getName() {return name;}
	public String getId() {return id;}
	public Address getAddr() {return addr;}
}


class Address{
	private String country;
	private String city;
	public Address(String country, String city) {
		this.country = country;
		this.city = city;
	}
	public String getCountry() {return country;}
	public String getCity() {return city;}
}

public class ConsumAndThen {

	public static void main(String[] args) {

		//#2. Function 매개도 있고 리턴도 있음
		Function<Member, Address> functionA;
		Function<Address, String> functionB;
		Function<Member, Address> functionAB;
		
		//R apply(T t)
		functionA = (m) -> m.getAddr(); //멤버받아서 어드레스 객체 리턴
		functionB = (a) -> a.getCity(); // 어드레스 받아서 String 시티 객체 리턴
		functionAB = functionA.andThen(functionB); // A실행 결과를 B 매개변수로 넣어서 실행 / 멤버받아서 시티 리턴 구현하도록 
		String city = functionAB.apply(// 실행메서드
				new Member("피카츄", "pickaId", new Address("한국", "서울"))
				); 
		System.out.println("거주도시 : "+ city);
		
		/*#1./ void accept(T t)
		Consumer<Member> consumerA = (m) -> {
				System.out.println("consumerA : "+ m.getName());// 매개변수만 하나 받고 , 리턴없음
		};
		Consumer<Member> consumerB = (m) -> {
			System.out.println("consumerA : "+ m.getId());// 
		};
		Consumer<Member> consumerAB = consumerA.andThen(consumerB); //리턴없으니까 토스 없이 순차적 실행되고 끝남.
		consumerAB.accept(new Member("pika","chuid", null));
		
		*/
		
		
		
		
		
	}

}
