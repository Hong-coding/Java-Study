package day07;
class Car {
	//변수
	String color = "";
	// 생성자
	Car(String color){
		this.color = color;
	}
	// 메서드
	String drive() {
		return color + "색 차가 지나갑니다~ 비키세요~";
	}
}
public class Test80 {

	public static void main(String[] args) {

		String [] cols = {"빨간", "노란", "초록", "파란", "검정"}; //포문 돌리기 쉽게 리스트에
		
		Car [] cars = new Car[5]; // Car 타입의 변수안에 새로운 배열 방 5칸을 만듦. 주차장
		for(int i = 0; i<cars.length; i++) {
			cars[i] = new Car(cols[i]); // 차를 생산해서 주차장에 넣는다
		}
		for(int i = 0; i<cars.length; i++) {
			System.out.println(cars[i].drive());
		}

		
		int [] arr = new int [5];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
		}
		

	
	
	}

}
