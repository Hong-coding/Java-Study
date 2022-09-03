package day05;

class Tv5{
	boolean power = false;	
	int ch=1, vol =0;
	
}
public class Test57 {

	Tv5 tv;
	Test57 test;
	
	
	public static void main(String[] args) {
	//1. test에 접근하기
		Test57 a = new Test57(); // 먼저 객체를 생성해야 함 . 
		System.out.println(a.test);

	//2. 다시 test내부 test에 접근하려면 또 객체생성해야함

		//다른방법
		if(a.test!=null) {
			System.out.println(a.test.tv);// tv의 주소를 원해~
		}else {
			a.test=new Test57(); //널이라면
			System.out.println(a.test.tv);//무조건 tv에 접근해라
		}		
		
		
		
		
		
		
	}

}
