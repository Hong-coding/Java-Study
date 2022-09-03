package day09;
//아래 추상클래스를 상속받은 MyCalc 클래스를 구현하세요.
abstract class Calculator{
	abstract int add(int a, int b);			// 두 정수의 합을 구하여 리턴
	abstract int subtract(int a, int b);	// 두 정수의 차를 구하여 리턴
	abstract double average(int[] a);		// 배열에 저장된 정수의 평균을 구하여 리턴
}
class MyCalc extends Calculator{

	@Override
	int add(int a, int b) {
		return a+b;
	}

	@Override
	int subtract(int a, int b) {
		return a-b;
	}

	@Override
	double average(int[] a) {
		int sum = 0;
		for(int i = 0; i < a.length; i++) { // for(int i:a){ sum += i;} 업글버전. 이렇게 하면 더 간단함
			sum += a[i];
		}
		return sum/(double)a.length;
	}
	
}
public class Test118 {

	public static void main(String[] args) {

		MyCalc c = new MyCalc();
		// c출력문내에서 
		System.out.println(c.add(10,20));
		System.out.println(c.subtract(100, 90));
		System.out.println(c.average(new int[] {1,2,3,4,5}));
	}

}
