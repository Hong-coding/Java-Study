package day08;
// 상속을 이용하여 다음 클래스들을 간결한 구조로 재작성해보세요.
/*
class SharpPencil{
	private int width; // 펜 굵기
	private int amount;// 남은양
	public int getAmount() {return amount;}
	public void setAmount(int amount) {this.amount=amount;}
}
class BallPenP{
	private int amount;
	private String color;
	public int getAmount() {return amount;}
	public void setAmount(int amount) {this.amount=amount;}
	public String getColor() {return color;}
	public void setColor(String color) {this.color = color;}
}
class FountainPen {
	private int amount;
	private String color;
	public int getAmount() {return amount;}
	public void setAmount(int amount) {this.amount = amount;}
	public String getColor() {return color;}
	public void setColor(String color) {this.color = color;}
	public void refill(int n) {amount = n;}
}

*/
class Pen {
	private int amount;
	public int getAmount() {return amount;}
	public void setAmount(int amount) {this.amount=amount;}
}
class SharpPencil extends Pen{
	private int width;
}
class BallPen extends Pen{
	private String color;
	public String getColor() {return color;}
	public void setColor(String color) {this.color = color;}
}
class FountainPen extends BallPen{ // amount도 있고 color도 있음 // 다중상속 안되니까 여기서는 손녀로 내려가면 됨
	public void refill(int n) {setAmount(n);}// 메서드 안에 출력문 불가능 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
//System.out.println("2가들어갔습니다"); // amount를 바로 접근 불가능
}
	


public class Test102 {

	public static void main(String[] args) {
//		FountainPen p = new FountainPen();
//		System.out.println(p.getAmount()); // 다 프라이빗이니까 메서드로 우회해줘야
//		System.out.println(p.getColor());
//		p.refill(2); //이건 어떻게 쓰지? 이건 값을 넣어주는것.ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ?

	}

}


//package day08;
////상속을 이용하여 다음 클래스들을 간결한 구조로 재작성해보세요. 

//public class Test102 {
//	public static void main(String[] args) {
//		
//		Object obj = new Object(); 
//		
//	}
//}
