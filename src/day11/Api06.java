package day11;

import java.util.Calendar;

public class Api06 {

	public static void main(String[] args) {

		Calendar now = Calendar.getInstance();//new Calendar(); //추상클래스라 객체 생성 불가능
		System.out.println(now); // 객체 정보가 나열되어 나옴.
		
		// 년도와 월 알아보기
		int month = now.get(Calendar.MONTH); //getMonth없어서 상수로 넣어야
		int year = now.get(Calendar.YEAR);
		System.out.println(year+"년"+(month+1)+"월");
		
		
	}

}
