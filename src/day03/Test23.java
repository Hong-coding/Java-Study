package day03;

public class Test23 {

	public static void main(String[] args) {
		
		// do{}while();
		int num = 0;
		do{
			System.out.println("test");
			num++;
		}while(num<3);

		int i = 12;
		do {
			System.out.println("test");
		}while(i-->10); //후위연산자라 마지막에 차감이 되니까 총 3번이 출력됨 . 가독성면에서 지양해야 함
	}

}
