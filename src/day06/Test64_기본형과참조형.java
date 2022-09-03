package day06;

class Circle{
	int radius =  30;
}
public class Test64_기본형과참조형 {
	// 편의상 객체생성 없이 바로 사용가능하도록 static 메서드 만들어본다. 예제.
	
//	static void plus(int num) {
//		num += 1; // num++;
//	} 
	static int plus(int num) { // 매개변수가 지역변수 기본형 int타입
		num += 1; // num++; 이렇게만 하고 끝내면 지역변수라 밖으로 나갈 수 없음 / 기본형은 주소를 가지는 게 아니고 값을 복제한 형태라서 원본에 영향을 줄 수 없다. 호출시 리턴값이 있어야하나보다
		return num;
	}
	static void biggerPizza(Circle pizza) { //Circle타입 사용자정의클래스변수 타입 참조형 pizza를 지역변수로 던져줌 
		pizza.radius++; // 이렇게만 끝내도 참조형은 같은 주소를 가지고 있게 되니까 변형하면 heap쪽에 원본이 훼손된다.
	}
	
	static void increase(int[] arr) {
		for(int i = 0; i< arr.length; i++) {
			arr[i]++;
		}
		 
	}
	public static void main(String[] args) {

		// 기본형 지역변수
		int num = 10; 
		plus(num); // 이렇게만하면 결과값은 11이 아니고 10임
//		num = plus(num); //★ 리턴을 다시 덮어쎠야 11
		System.out.println(num);// 
		
		// 참조형
		Circle pizza = new Circle();
		biggerPizza(pizza);
		System.out.println(pizza.radius); // 결과값은 31이 됨. 
		
		// 배열(역시 참조형)
		int [] arr = {1,2,3,4,5};
		increase(arr);
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
	}

}
