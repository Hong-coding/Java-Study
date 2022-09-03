package day07;

public class Test74 {

	double d; 
	
	Test74(){
		System.out.println("생성자 호출");
		d = Math.random();
	}
	
	// 생성자 오버로딩
	Test74(double a){
		d = a;
	}
	
	public static void main(String[] args) {
		Test74 test = new Test74();
		Test74 test1 = new Test74();
		Test74 test2 = new Test74();
		System.out.println(test.d);
		Test74 test3= new Test74(3.14); 
		System.out.println(test2.d);
		
	}

}
