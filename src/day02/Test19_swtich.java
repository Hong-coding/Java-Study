package day02;

public class Test19_swtich {

	public static void main(String[] args) {
		// 
		
		System.out.println("switch조건문 사용1");
		int a = 1;
		switch(a) {
		case 1:
			System.out.println("a는1이다");
			break;
		case 2:
			System.out.println("a는2다.");
			break;
		case 10:
			System.out.println("a는10이다");
			break;

		}
		System.out.println("switch조건문 사용2");
		
		char ch = 'B';
		switch(ch){
			case 'A':
				System.out.println("A");
				break;
			case 'B':
				System.out.println("BBB");
				break;
			case 'C':
				System.out.println("cccc"); //캐릭터도 가능함
		}
//
//		// 숫자 2개 , 문자1개 입력받아 사칙연산도 가능
		String aaa = "+=*/"; //인덱스를 부여 +-*% 0123
		char aaaCH = aaa.charAt(0); //0번째 인덱스는 +가 나옴 // 캐릭터타입으로 떼어와서 변수에 담겠다
		System.out.println(aaaCH);
		
		String str = "hello"; // 문자열을 넣을수도 있음 
		switch(str) {
		case "hello":
			System.out.println("hellooo");
			break;
		case "ttt":
			System.out.println("ttttt");
		}
		
		
		
		
		
	}

}
