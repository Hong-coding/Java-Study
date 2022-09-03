package day10;

public class TestEx02 {

	public static void main(String[] args) {
		//ArrayIndexOutOfBoundsException
		try {
		System.out.println(args[0]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("인수를 입력 안하고 실행하셨습니다");
			System.out.println(e); //toString오버라이딩 되어 잘 나옴
		}catch(Exception e) {
			System.out.println("알 수 없는 오류");
			System.out.println(e); 
			
		}
	}

}
