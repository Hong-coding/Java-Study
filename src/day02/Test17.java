package day02;
import java.util.Scanner;

public class Test17 {
	


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		String score = sc.nextLine();
		
		int score = Integer.parseInt(sc.nextLine());
		if (score>90) {
			System.out.println("수");
		}else if(score>80){
			System.out.println("우");
		}else if(score>70) {
			System.out.println("미");
		}else {
			System.out.println("재시험");
		}
		
		sc.close();
		

		
		
		
		
		
		
		
	}

}
