package day14;
//인터페이스 생성
@FunctionalInterface// 옵션 : 중요한 건 함수적인터페이스 되기위해서는 추상메서드가 1개만 있어야 함)
public interface MyFunctionalInterface {

	//#3.
	public int method(int x, int y);
	/*#2.
	public void method(int x);
	/*#1.
	public void method(); */
	//public void otherMethod();// 두개 불가능
	
	
}
