package day01;

public class Test03 {

	public static void main(String[] args) {

		char ch = '\u0041';
		System.out.println(ch);
		
		
		byte bb = 127;
		
		//오버플로우 - 루프를 10번정도 돌게됨 에러는 나지 않지만 숫자가 깨지게 됨.
		byte bbb = (byte)128;
		byte bbbb = (byte)129;
		byte bbbbb = (byte)130; 
		System.out.println(bb);
		System.out.println(bbb);
		System.out.println(bbbb);
		System.out.println(bbbbb);
		
		// int : 10진수, 8진수: 0으로 시작하는 수 , 16진수: 0x로 시작(f로.. 컬러표현 #ffffff=#fff), 0부터 F까지 , 2진수도 가능: 0b로 시작
//		int i = 15; // 10진수
//		System.out.println(i);
//		int j = 015; //8진수
//		System.out.println(j);
//		int k = 0x15;
//		System.out.println(k);
//		int l = 0b0101;
//		System.out.println(l);
//		System.out.println("hello");
//		
//		// 문자열
		String str = "안녕하세요";
		System.out.println(str);
		str = "피카츄";
		System.out.println(str);
////		str = 'A'; 홑따옴표에 넣는것은 불가능
//		
//		float d = 10.123F; 
//		System.out.println(d);
//		int iii = (int)11.1;
//		System.out.println(iii);
//		
	}

}
