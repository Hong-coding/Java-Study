package day11;

import java.util.Calendar;

public class Api09 {
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR) + "년" + (date.get(Calendar.MONTH)+1)+ "월"+ date.get(Calendar.DATE)+"일";
	}
	public static void main(String[] args) {

		Calendar date = Calendar.getInstance();
		date.set(2022, 1, 28);
		System.out.println(toString(date));
		System.out.println("== 1일 후 ==");
		date.add(Calendar.DATE, 1);
		System.out.println(toString(date));

		System.out.println("== 6달 전 ==");
		date.add(Calendar.MONTH, -6);
		System.out.println(toString(date));
	
		System.out.println("== 31일 후 ==");
		date.roll(Calendar.DATE, 31); // month무시하고 일만 31번 돌림.
		System.out.println(toString(date));
	
	}

}
