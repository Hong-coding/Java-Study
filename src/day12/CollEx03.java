package day12;

import java.util.ArrayList;
import java.util.Scanner;

/*
	Scanner 클래스를 사용하여 6개 학점(학점단위 : 'A','B','C','D','F')을 문자로 입력받아
	ArrayList에 저장하고 ArrayList를 검색하여 학점을 점수(A=4.0, B=3.0, C=2.0, D=1.0, F=0)로 변환하여 
	평균을 출력하는 프로그램을 작성하세요. 
	콘솔예:
		6개의 학점을 띄어쓰기하여 입력하세요(A/B/C/D/F) >> A C A B F D  (사용자 입력)
		평균 : 2.333333333
		
*/
public class CollEx03 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> arrL = new ArrayList<String>(); // 객체 생성
		
		while(true) {
			System.out.println("6개의 학점을 띄어쓰기하여 입력하세요(A/B/C/D/F) >>");
			String[] scores = sc.nextLine().split(" ");
			for(int i = 0; i < scores.length; i++) {
				arrL.add(scores[i]); // 배열로 만들어서 이렇게 넣는게 맞는가?
			}
			
			if(arrL.size()==6) {
				//평균계산
				int sum = 0;
				for(int i = 0; i < arrL.size(); i++){
					String s = arrL.get(i);
					if(s.equalsIgnoreCase("A")) {
						sum += 4.0;
					}else if(s.equalsIgnoreCase("B")) {
						sum += 3.0;
					}else if(s.equalsIgnoreCase("C")) {
						sum += 2.0;
					}else if(s.equalsIgnoreCase("D")) {
						sum += 1.0;
					}else if(s.equalsIgnoreCase("F")) {
					}
				}
				System.out.println("평균 : " +(double)(sum/arrL.size())+"점 입니다.");
				break;
			}else {
				System.out.println("너무 많거나 적은 값을 입력했네요.");
			}
		}
			
		
		
//			
//			arrL.add(score);
//		}
//		rintln("평균 점수 : "+ (sum/6.0));
//		
		
	}
}
