package day02;

public class Test11 {

	public static void main(String[] args) {
		
		// 문제1. 결과를 먼저 주석으로 작성해보고 실행해서 확인
		int i = 5, j=5;
		System.out.println(i++);// 5   ===> a = 6
		System.out.println(++j);// 6
		System.out.println("i=" + i + ", j=" + j);//i=6, j=6

		// 문제2.
		int k = 10;
		System.out.println(k++);//10 ===> 11
		System.out.println(++k);//12
		++k; //13
		System.out.println(++k); //14
		System.out.println(k++); //14 ===>15
		System.out.println(k); // 15
		
		// 문제3.
		int a =10;
		int b =10;
		int r = ++a + ++b; // 11+11 =22
		r = ++a + b++; //12 + 11 (12) = 23
		r = ++a + a; // 13 + 13 = 26 ////////선 중간에서도 왼쪽에서 오른쪽으로 계속 연산됨
		r = ++a + a++; // 14 + 14 (15) = 28  ////////선 중간에서도 왼쪽에서 오른쪽으로 계속 연산됨
		r = ++a + ++a; // 16 + 17 = 33
		System.out.println(r);
		
		
		
		
		
		
		
		
		
	}

}
