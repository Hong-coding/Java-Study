package day03;

public class Test30 {

	public static void main(String[] args) { //arguments의 약자 //프로그램 시작할 때 여기로 받아서 미리 만들어놓은것/ 실행시키는 방법은 run configurations...에 아예 값을 넣어주고 시작
		// 
		
//		String[] args2;
//		args = "abc"; 에러가 나는 이유 선언만 하고 공간을 배정을 안한 것.
//		args = new String[5];
//		args = "abc";
//		System.out.println(args[0]); 
		//이런 용도는 아니다
		
		System.out.println(args[0]);
		System.out.println(args[1]);
		//System.out.println(args[2]); //ArrayIndexOutOfBoundsException
	}

}
