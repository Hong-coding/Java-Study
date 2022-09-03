package day07;

class Product{
	
	static int count = 0;// 인스턴스 개수를 저장할(카운트할) 변수
	String serialNo;// 제품 고유 번호 저장할 변수
	
	// 인스턴스 초기화 블럭 (객체 안에 값을 넣어놓고 실행). 이 부분이 없다면 결과값이 달라짐
	{
		++count;	// 객체생성될때마다 추가됨
		serialNo = "P00"+count;
	}
}
public class Test73 {

	public static void main(String[] args) {
		
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		
		System.out.println("p1 제품의 제품번호는 "+p1.serialNo);
		System.out.println("p2 제품의 제품번호는 "+p2.serialNo);
		System.out.println("p3 제품의 제품번호는 "+p3.serialNo);
		System.out.println("생산된 전체 제품 개수 : "+ Product.count);
	}

}
