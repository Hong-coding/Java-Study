package day10;

public class TestEx08 {
	static void method1() {
		method2();
	}
	static void method2{
		
		throw new Exception(); 
	}
	public static void main(String[] args) {
		method1();
		
	}

}
