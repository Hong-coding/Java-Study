package day11;

public class Api05 {

	public static void main(String[] args) {
		
		int i = new Integer(10); // 바로 호환가능 언박싱 자동으로 됨
		Integer ii = new Integer(20);
		i = ii ; //반대로도 호환 바로 됨
		
		//문자연형태를 기본형으로 바꾸고싶다
		int a = Integer.parseInt("123");
		boolean b = Boolean.parseBoolean("true");
		double d = Double.parseDouble("3.14");
		
		int x = 10;
		Object obj = x;
		System.out.println(obj.getClass()); // 기본형이 클래스타입으로 호환이 된다는 말..
		
		/*
		Integer i = new Integer(10);
		int ii = i.intValue();
		int iii = i; 
		
		int a = 10; //언박싱
		Integer iCls = a; //기본형을 인티저에 넣음 자동으로... 
		
		System.out.println(i);
		Character c = new Character('c');
		System.out.println(c);
		Double d = new Double("3.14");
		System.out.println(d);
		Boolean b = new Boolean(true);
		Float f = new Float(3.14);
		*/
	}

}
