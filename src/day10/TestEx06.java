package day10;

public class TestEx06 {

	public static void main(String[] args) {
		/*
		try {
			// 예외를 강제로 발생시킴.
			throw new RuntimeException();
			//System.out.println("hello");// 어차피 위 예외라 아래는 실행되지도 않음
		}catch(Exception e) {
			System.out.println("예외가 발생했네요");
			
		}*/
		
		try {
			System.out.println("hello");
//			Exception e = new Exception(); 
			Exception e = new Exception("고의로 작성한거야"); //나만의 메세지는 ()안에
			throw e; 
		}catch(Exception e) {
			System.out.println(e);
			System.out.println(e.getMessage()); //메세지만 따로 꺼낼 수 있는 메서드
			e.printStackTrace(); // 에러가 어디서 발생했는지 경로 추적해서 출력하는 메서드. 
						//try-catch로 예외처리 안하면 콤솔에 뜨는 메세지들을 (try-catch시 안나옴)
						//예외처리를 해놓으면 트레이스가 사라지는데 개발하면서 추적하고 싶으면 이 메서드를 써야함
			
		}
	}

}
