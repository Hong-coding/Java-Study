package day09;
// 매개변수의 다형성
class Product {
	int price;				// 제품 가격
	int bonusPoint;			// 제품 구매시 제공하는 포인트 점수
	Product(int price){ 	// 객체를 생성할 때 가격 받아서 넣을것. 생성자로 가격 초기화. 
		this.price = price;
		bonusPoint = (int)(price/10);// 가격의 10%를 포인트로 지정
	}
	
}
class LGTv extends Product{ // 오브젝트의 자식이라 11개 매서드도 다 들고있음 그 중에 toString포함 객체에 대한 설명. 이걸 바꿔쓸래 오버라이딩!!!
	LGTv(){
		super(100); // 부모의 생성자를 부름
	}
	@Override
	public String toString() {
		return "LG Tv";
	}
//	Tv(int price){ 	// 객체를 생성할 때 가격 받아서 넣을것. 생성자로 가격 초기화. 
//		this.price = price;
//	}
}
class SComputer extends Product{	// 중복되니까 변형을 할 것
//	int price;
//	int bonusPoint;
	SComputer(){
		super(200);
	}
	@Override
	public String toString() {
		return "Samsung Computer";
	}
//	Computer(int price){
//		this.price = price;
//	}
	
}
class Buyer {//고객
	int money = 1000; // 지갑
	int bonusPoint = 0; // 고객포인트
	void buy(Product p) { 	// 고객이 하는 일. 메서드 ///뭘살거냐, 를 알아야 다음 작업이 일어남 매개변수
		if(money < p.price){// 돈이 없을 때 체크를 해줘야 하는 건 여기서 작성해야 함
			System.out.println("돈이 없네요, 다음에 다시 오세요~~");
			return;
		}
		System.out.println(p+"을/를 구입하셨습니다.");
		money -= p.price;
		bonusPoint += p.bonusPoint;
		//tostring 오브젝트가 물려준 매서드 그냥 p 출력과 동일. 오브젝트의 자식이라 11개 매서드도 다 들고있음
	}
	
}
public class Test114 {

	public static void main(String[] args) {
//		Product p = new LGTv();
//		LGTv p1 = (LGTv)p;
		
		Buyer b = new Buyer();
		LGTv tv = new LGTv();
		SComputer com = new SComputer();
		
		b.buy(tv);
		b.buy(com);
		b.buy(com);
		b.buy(com);
		b.buy(com);
		b.buy(com);
		b.buy(com);
		b.buy(com);
		
		System.out.println("현재 남은 돈은 " +b.money +"만원 입니다.");
		System.out.println("현재 누적 포인트는 "+ b.bonusPoint +"점 입니다.");
	}

}
