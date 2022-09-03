package day05;

//클래스 안에 들어가는것은 변수와 메서드
//변수의 종류 3가지
class TvEx{ //ㅡㅡㅡㅡㅡㅡㅡㅡ동일패키지 내에 동일한 이름으로 클래스만들 수 없다
	// 1. 클래스 변수 (static이 붙음) ///// 프로그램 끝까지 -> 프로그램시작부터. 많이 만들지 않는게 좋다. 메모리 차지 끝까지 하고있으니까
	static boolean power = false; 
	// 2. 인스턴스 변수(클래스 내부이지, 메서드 내부가 아니니까) -> new부터. 가비지 컬렉터가 수거하거나 , 프로그램 종료시까지
	int vol = 0, ch =1;
	
	//클래스 안에는 변수와 메서드만 작성할 수 있으므로. 기능 성립하게 하려면 메서드형식으로 넣어줘야 함.
	void volUp() {
		// 3.지역변수
		int x=100;
	}
}
public class Test53_변수의종류 {
	// 클래스(static붙음) 메서드 
	public static void main(String[] args) {
		// 클래스 변수니까 : 객체 생성 없이 바로 사용가능
		System.out.println(TvEx.power); // (클래스명.변수명)

		// 인스턴스 변수니까 = 객체 생성 후 사용 가능
		TvEx tv = new TvEx();
		System.out.println(tv.vol);
		System.out.println(tv.ch);
		System.out.println(tv.power); // 참조변수명.변수명로도 접근 가능하지만 
		System.out.println(TvEx.power); //클래스변수인데 클래스 변수인지 인스턴스변수인지 구분이 어려우니까 
										//(클래스명.변수명)으로보는게 구분확실/ 
										// 클래스명.power로 작성하자! 그래야 내가 만든게 아닌 경우에도 무슨타입인지 알수있으므로
		
		// 지역변수 (메서드 내부{유효기간}) -> 메서드 실행시 만들어지고, 메서드 끝나면 없어짐
		int abc = 10; 
		
		System.out.println(abc); //System : 클래스명/ out 소괄호없으니까 변수. 메서드를들고있을수있는 참조변수./ println() 메서드명
				// out을 쓰기위해 System으로 객체 생성 하지 않았는데도 사용가능하다는말은 out은 클래스변수= static 변수라는말
		

	}

}
