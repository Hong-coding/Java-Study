package day02;

public class Test15 {

	public static void main(String[] args) {
		
		// 대입연산자
		int a = 10;
		System.out.println(a+10);
		System.out.println(a);

		System.out.println(a += 10);
		System.out.println(a);
		
		// 복합 대입연산자 : 산술+대입 : +=
		a = a + 1; 
		a +=1; //변수의 이름이 매우 복잡한 경우 유용
		a -=1;
		a ++;
		a --; //자주쓰니까 따로 연산자를 만들어 놓은 것
		a +=10; // 10씩 더해줄 때
		a*=2; //2씩 곱해줄 때
		System.out.println(a);
		
		

		
		
		
		
		
	}
		
}
