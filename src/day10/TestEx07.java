package day10;

public class TestEx07 {

	public static void main(String[] args) {

		
		try {
			//Exception e = new Exception();
			//NullPointerException e = new NullPointerException();
			RuntimeException e = new RuntimeException();
			throw e;
		
		}catch(NullPointerException e) {	
			System.out.println("NullPointerException  처리");
		}catch(RuntimeException e) {
			System.out.println("runtime");
		}catch(Exception e) { // 부모니까 먼저 걸리면 아래로 갈일 없음
			System.out.println("모든 예외 처리");
		}
		
	}

}
