package day14;

import java.util.function.ToIntBiFunction;

public class RefEx02 {

	public static void print(int order) {
		if(order < 0)System.out.println("앞에가 사전순으로 먼저 나온다.");
		else if(order==0) System.out.println("동일한 문자열이다.");
		else System.out.println("앞에가 사전순으로 나중에 나온다");
	}
	public static void main(String[] args) {

		// 객체2개 던지면 int로 리턴해주는  (function의 메서드 이름)
		// int applyAsInt(T t, U u)
		ToIntBiFunction<String, String> function;
		
		function = (a,b) -> a.compareTo(b); //일반람다버전. compareTo는 int로 리턴해줌 사전순으로 비교해줌 . a가 참조형이라 그게 가진 
		function.applyAsInt("java", "JAVA");
		System.out.println(function.applyAsInt("java", "JAVA")); // 앞에가 먼저면 음수, 동일하면 0, 뒤가 먼저면 양수가 나옴 대문자소문자는 32개차이, 대문자가 먼저
		print(function.applyAsInt("java", "JAVA"));
		
		function = String::compareTo;// 위를 간단하게. 메서드 참조 버전.
		print(function.applyAsInt("spring", "Spring"));
		function = String::compareToIgnoreCase;// 대소문자 무시 
		print(function.applyAsInt("spring", "Spring"));
	}

}
