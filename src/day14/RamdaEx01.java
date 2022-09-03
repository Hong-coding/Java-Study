package day14;

public class RamdaEx01 {
	//#4
	
	public static int sum(int x, int y) {
		return x+y;
	}
	
	public static void main(String[] args) {
		MyFunctionalInterface my;
		//#4
		my = (x,y) -> sum(x,y);
		System.out.println(my.method(1, 2));
		
		//거꾸로 감싸기
		my = (x,y) ->{ return sum(x,y);};
		
		/*#3.
		my = (x,y) -> {
			int result = x+y;
			return result;
		};
		int rs = my.method(10, 20);
		System.out.println(rs);
		
		//줄여서
		my = (x,y) -> { return x+y;};
		System.out.println(my.method(100, 200));
		//더줄여서
		my = (x,y) -> x+y;// 식 하나니까 중괄호와 리턴키워드 생략 가능
		System.out.println(my.method(123, 456));
		
		/*#2
		
		my = (x) ->{
			int result = x*5;
			System.out.println(result);
		};
		
		my.method(10);
		
		my = (x) -> System.out.println(x*10);
		my.method(10);
		
		/*#1
		my = () ->{
			String str = "method 호출";
			System.out.println(str);
		};
		my.method();
		
		
		my = () -> {System.out.println("호출2");};
		my.method();

		// 중괄호 안에 명령문이 하나라 중괄호 생략 가능
		*/
		
		
		
	}

}
