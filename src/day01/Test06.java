package day01;

public class Test06 {

	public static void main(String[] args) {


		int a = 65;
//		char b = a; 4바이트를 2바이트에 넣으니까 에러나지
		char b = (char)a;
		System.out.println(b); // 숫자 a에 해당하는 아스키코드는 A
		
		// 자동 형변환
		char c = 'A'; //2바이트
		int d = c; //4바이트 
		System.out.println(d);

		int e = 5;
		double dd = e;
		System.out.println(dd); //자동형변환 앞에 괄호 없이도 자동으로 결과 나와
		
		double f = 5.8; //8바이트
		int h = (int)f; //4바이트 
		System.out.println(h); // 강제니까 괄호 해줘야 결과 나와
		
		char cc = 'a'; //2바이트
		double jj = cc; // 8바이트
		System.out.println(jj); // a에 해당하는 앗스키코드 자동으로 97로 변환됨
		
		
		
		
		
		
		
		
		

	}

}
