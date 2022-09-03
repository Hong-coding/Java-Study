package day11;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Api11 {

	public static void main(String[] args) {

		// 문자열 날짜 -> Date 객체 변황
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd");
		try{
			Date d = sdf.parse("2022년 1월 31일");
			Date d2 = sdf2.parse("2022/1/31");
			System.out.println(d.getDate());
			
		}catch(Exception e) {
			
		}
		
		// D-day 계산기 만들어보기
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
