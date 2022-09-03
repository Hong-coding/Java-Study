package day11;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Api10 {

	public static void main(String[] args) {

		Date day = new Date();	// 지금시간정보 객체생성
		System.out.println(day); // 보기 편하게 오버라이딩이 되어있음 
		System.out.println(day.getMonth()); //0~11월
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd"); // 순서바꿔주기
		System.out.println(sdf1.format(day));
		
		// 캘린더로 sdf 포맷팅하는것
		Calendar c = Calendar.getInstance();
		System.out.println(sdf1.format(c.getTime()));
		
		
		
		
		
		
		
	}

}
