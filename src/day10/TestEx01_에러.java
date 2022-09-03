package day10;

public class TestEx01_에러 {

	public void func() {
		//변수선언 위로 올려야 try 안에 쓰면 밖에서 못쓰니까
		
		try {
			// 제어문 if, for, while...
			// 메서드 호출
			// 객체 생성
		}catch(Exception e) {
			// 예외 발생시 처리코드
		}
	}
	public static void main(String[] args) { // 어떤 메서드 안에든 작성 가능
		
		try {
			
		}catch(Exception e) {
			
		}
		
	}

}
