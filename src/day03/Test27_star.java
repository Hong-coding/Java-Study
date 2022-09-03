package day03;
//별찍기 03제어문 //

public class Test27_star {

	public static void main(String[] args) {
//		행/열
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡ1번ㅡㅡㅡㅡㅡㅡㅡㅡ");
		for(int i = 0; i < 5 ; i++) {
			System.out.print((i+1)+"행 : ");
			for(int j = 0; j<3 ;j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		System.out.println("계속하려면 아무 키나 누르십시오...");
//		증가
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡ2번ㅡㅡㅡㅡㅡㅡㅡㅡ");
		for(int i = 0; i < 5 ; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		System.out.println("계속하려면 아무 키나 누르십시오...");
//		감소
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡ3번ㅡㅡㅡㅡㅡㅡㅡㅡ");
		for(int i = 0; i < 5 ; i++) {
			for(int j = 5; j > i; j--) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		System.out.println("계속하려면 아무 키나 누르십시오...");
		
//		 
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡ연습ㅡㅡㅡㅡㅡㅡㅡㅡ");
		for(int i = 0; i < 5; i++) {
			for(int j = 5; j>i
					; j--) {
				System.out.print("*"+i+j);
			}
			System.out.println("");
		}
		
//		행 - 열 합산
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡ4번ㅡㅡㅡㅡㅡㅡㅡㅡ");
		for(int i = 0; i < 5; i++) {
			for(int j = 1; j <= 5; j++) {
				System.out.print(i+j);
			}
			System.out.println();
		}
//		
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡ5번ㅡㅡㅡㅡㅡㅡㅡㅡ");
		for(int i = 0; i < 5; i++) {
			for(int j = 5; j <= 9; j++) {
				System.out.print(j-i);
			}
			System.out.println();
		}
//		증가하다가 줄어드는 행열
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡ6번ㅡㅡㅡㅡㅡㅡㅡㅡ");
		for(int i = 0; i < 10 ; i++) {
			if(i<5) {
				for(int j = 0; j <= i; j++) {
					System.out.print("*");
				}
			}else {
				for(int j = 9; j >= i; j--) {
					System.out.print("*");
				}
			}
			
			System.out.println();
		}
		
		
//		증가(우측정렬)
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡ7번ㅡㅡㅡㅡㅡㅡㅡㅡ");
		for(int i = 0; i < 5; i++) {
			for(int j = 4; j > i; j--) {
				System.out.print(" ");
			}
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
//		감소(우측정렬)
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡ8번ㅡㅡㅡㅡㅡㅡㅡㅡ");
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for(int j = 5; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
//		증가하다 감소하는 행열(우측정렬)
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡ9번ㅡㅡㅡㅡㅡㅡㅡㅡ");
		for(int i = 0; i < 11; i++) {
			if(i < 6) {
				for(int j=4; j >= i; j--) {
					System.out.print(" ");
				}
				for(int j=0; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}else {
				for(int j=6; j <= i; j++) {
					System.out.print(" ");
				}
				for(int j=10; j >= i; j--) {
					System.out.print("*");
				}
				System.out.println();
				
			}
		}
//		피라미드 모양
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡ10번ㅡㅡㅡㅡㅡㅡㅡㅡ");
		for(int i = 0; i < 5; i++) {
			for(int j = 4; j > i; j--) {
				System.out.print(" ");
			}
			for(int j = 0; j<(2*i)+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡ10번 다른방법ㅡㅡㅡㅡㅡㅡㅡㅡ");
		for(int i = 0; i < 5; i++) {
			for(int j = 1; j < 5-i; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j<(2*i)+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡ10번 다른방법2ㅡㅡㅡㅡㅡㅡㅡㅡ");
		for(int i = 0; i < 5; i++) {
			for(int j = 1; j < 5-i; j++) {
				System.out.print(" ");
			}
			for(int j = (2*i)+1; j>0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡ11번ㅡㅡㅡㅡㅡㅡㅡㅡ");
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for(int j = 10; j>(2*i)+1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡ11번 다른방법ㅡㅡㅡㅡㅡㅡㅡㅡ");
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for(int j = (2*i)+1; j>0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡ12번ㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡ13번ㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡ14번ㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡ15번ㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡ16번ㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡ17번ㅡㅡㅡㅡㅡㅡㅡㅡ");
		
	}

}
