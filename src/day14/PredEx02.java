package day14;

import java.util.function.IntPredicate;

public class PredEx02 {

	public static void main(String[] args) {

		//boolean test(int i)를 오버라이딩 한애.
		
		//2의 배수를 검사
		IntPredicate predA = a -> a%2 == 0;
		//IntPredicate predA = (a) -> {return a%2 == 0;}
		
		//3의 배수를 검사
		IntPredicate predB = a -> a%3 == 0;
		
		IntPredicate predAB;
		boolean result;
		
		predAB = predA.and(predB); //&& 둘다 true여야 true
		result = predAB.test(9); //12는 true가 나옴
		System.out.println("9는 2와 3의 배수인가요?" + result);
		
		predAB = predA.or(predB); // || 
		result = predAB.test(9);
		System.out.println("9는 2또는 3의 배수인가요?" + result);
		
		predAB = predA.negate();
		result = predAB.test(9); // %2 == 0 -> false -> true
		System.out.println("9는 홀수인가요?" +result);
		
	}

}
