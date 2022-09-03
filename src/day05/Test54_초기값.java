package day05;

class TvTest{
	// 클래스 기본형 변수
	static int x;
	// 인스턴스 기본형 변수
	int y; 
	// 인스턴스 참조형 변수
	String str;
	char c; // char c = '';
}
public class Test54_초기값 {

	public static void main(String[] args) {
		//클래스 변수는 객체 생성 없이 바로 사용 가능.
		System.out.println(TvTest.x); //접근 이름.변수명
		// 맴버변수(클래스 변수와 인스턴스 변수)는 초기화 안해도 자동 기본값 채워줌. 0
		// 인스턴스 변수는 객체 생성해야 사용 가능.★★
		TvTest t = new TvTest(); // 객체생성 ★
		System.out.println(t.y); // 기본형 ---------> 자동 초기값 0
		// 지역 기본형 변수 : 초기화를 안해주면 출력x (사용x)
		System.out.println(t.str); // 기본형 -------> 자동 초기값 null
		int a;
//		System.out.println(a); //에러
		System.out.println(t.c);
		
		// 지역 참조형 변수 : 초기화 안해주면 못써
		String ss;
//		System.out.println(ss); //에러

	}

}
