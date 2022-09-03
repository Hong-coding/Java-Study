package day09;

import java.util.Scanner;

class AA{
	int x;	
}

class BB extends AA{
	int y;
}

public class Test113 {

	public static void main(String[] args) {
		
		AA a = new AA();
		AA a1 = new BB();
		Object o = new AA();
		Object o2 = new BB();
		Object o3 = new Scanner(System.in); // Object는 조상이라 다 담을 수 있다. 
						//대신 11개뿐이 못써. 자식이 뭘가지고있는지 몰라
		//o. 찍어보면 자동완성에 x가 나오지 않는다!! 숨겨져 있으니까. 형태는 부모니까. 실질과달라
					//x를 쓰고싶다면 변수의 타입을 바꿔줘야
		if(o instanceof AA) {
			AA abc = (AA)o;
			//abc. //찍어보면 이제 나온다. 변수 껍데기를 바꾸는 작업
			
			//자바 보호하려는 데이터는 확실히하되
			//객체들 간 연결고리 매개변수 느슨하게 부모형태로 담는 게 유지보수에서 더 편하진다.
			//equals(Object obj) 같은 객체인지 비교해보는 . 던져주는 객체가 뭐든지간에 비교하려고 매개변수 타입을 Object타입으로 만들어 놓은 것.
		}

	}

}
