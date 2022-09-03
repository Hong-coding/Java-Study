package day09;

import java.util.Scanner;

interface Phone {
	void sendCall(Contact contact); 
	void receiveCall(int seconds);
}
interface Mobile extends Phone {
	void sendSMS(Contact contact);
	String receiveSMS(); //인터페이스로 {}중괄호부분은 작성하지 않은 채 넘기는거. 
}
class IPhone implements Phone, Mobile{		
	IPhone (){							//#1-1. 생성자- 폰 객체생성
	};
	@Override
	public String toString() {			//#2-1. 객체표현 오버라이딩
		return "iPhone";				//System.out.println(iPhone + "을 구매하셨습니다."); 

	}
	@Override
	public void sendSMS(Contact contact) {							//#3-2. 폰객체의.메서드실행(연락처 객체의 표현)				iPhone.sendSMS(pikachu);
		System.out.println(contact +"께 보낼 메세지를 입력하세요 >> ");
		Scanner sc = new Scanner(System.in);
		String txt = sc.nextLine();
		System.out.println(contact +"님께 보낸메세지를 확인합니다.");
		System.out.println("메세지 : 배고파아~ 밥먹자! ");
	}

	@Override
	public String receiveSMS() {		//#3-1. 폰객체의.메서드실행() 		String msg = iPhone.receiveSMS();  
		return "배고프니?";
	}

	@Override
	public void sendCall(Contact contact) {									//#3-5. 폰객체의.메서드실행(연락처 객체의 표현) iPhone.sendCall(kkobug);  /// 연락처객체의.변수호출 contact.mobileNo
		System.out.println(contact+"님, "+contact.mobileNo+" 로 전화를 걸고 있습니다...");
	}

	@Override
	public void receiveCall(int seconds) {								//#3-4. 폰객체의.메서드실행(기본형변수) 	iPhone.receiveCall(125); 
		System.out.println("전화받았습니다. 통화시간은 "+(seconds/60)+"분"+(seconds%60)+"초 입니다.");
	}
	
}
class Contact {
	String name;
	String mobileNo; 									//		#3-3. 연락처 객체의.변수호출 		System.out.println(mom + "님 - " + mom.mobileNo + "번에서 전화가 왔습니다.");

	public Contact(String name, String mobileNo) {		//#1-2. 생성자 - 연락처 객체생성
		this.name = name; this.mobileNo = mobileNo;
	}
	@Override
	public String toString() {							//#2-1.객체 표현오버라이딩 		System.out.println(pikachu + "님에게서 문자가 도착했습니다.");
		return name;
	}
}
/*
	Phone, Mobile 인터페이스를 활용하여 IPhone 작성, Contact 클래스를 체워 넣으세요.  
	main메서드 주석해제하고 실행하면 아래 콘솔 출력예시처럼 진행되야합니다. 
	콘솔출력예 >>
		iPhone을 구매하셨습니다.
		피카츄님에게서 문자가 도착했습니다.
		msg : 배고프니? 
		피카츄님께 보낼 메세지를 입력하세요 >> 안녕?? (사용자 입력) 
		피카츄님께 보낸메세지를 확인합니다.
		메세지 : 배고파아~ 밥먹자! 
		엄마님 - 010-1111-2222번에서 전화가 왔습니다.
		전화받았습니다. 통화시간은 2분5초입니다.
		꼬북이님, 010-1212-3434 로 전화를 걸고 있습니다...
		
*/
public class Test126_0 {
	public static void main(String[] args) {

		
		IPhone iPhone = new IPhone(); 								//#1-1. #2-1.
		Contact pikachu = new Contact("피카츄", "010-1234-5678"); 	//#1-2.
		Contact mom = new Contact("엄마", "010-1111-2222"); 			//#1-2.
		Contact kkobug = new Contact("꼬북이", "010-1212-3434"); 		//#1-2.
		System.out.println(iPhone + "을 구매하셨습니다."); 				//		#2-1.	
		System.out.println(pikachu + "님에게서 문자가 도착했습니다.");		//		#2-1.
		String msg = iPhone.receiveSMS(); 							//			#3-1. 
		System.out.println("메세지 : " + msg);
		iPhone.sendSMS(pikachu);									//			#3-2.
		System.out.println(mom + "님 - " + mom.mobileNo + "번에서 전화가 왔습니다.");	//#3-3. 
		iPhone.receiveCall(125); 									//			#3-4. 
		iPhone.sendCall(kkobug); 									//			#3-5.
//		
		
	}
}
