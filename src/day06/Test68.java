package day06;

/*
	char[] 배열을 전달받아 출력하는 printCharArray() 메서드와
	배열속의 '' 공백문자를, ','쉼표로 대치하는 replaceSpace() 메서드를 작성해보세요.
	(편의를 위해 Test68 클래스안에 static 메서드로 작성해보세요)
 */

public class Test68 {
	
	
	static void printCharArray(char[] c) { // ch든 뭐든 이름상관없이 타입만 맞으면됨
		for(char i = 0; i < c.length; i++) {
			System.out.print(c[i]);
		}
		System.out.println();
		return;
	}
	
	static void replaceSpace(char[] a) { // c든 a든 상관없음
		//char[] d = new char[c.length];
		for(int i = 0; i < a.length; i++) {
			if(a[i]==' ') { // 쌍따옴표 안됨/ 캐릭터는 비교연산자 가능, 스트링이 불가
				a[i]=',';
			}
		}
		return;
		
	}

	public static void main(String[] args) {
		
		char[] c = {'I', ' ', 'a', 'm', ' ', 'a' ,' ', 'b', 'o', 'y'};
		printCharArray(c); // I am a boy
		
		replaceSpace(c);
		printCharArray(c); //I,am,a,boy
		// 

	}

}
