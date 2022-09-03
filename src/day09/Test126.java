package day09;

import java.util.Scanner;

//인터페이스
/*
	Stack 인터페이스를 상속받아 문자열을 저장하는 StringStack 클래스를 구현하세요. 
	아래와 같은 실행결과가 나오도록 main()을 참고하여 작성하세요. 
	실행결과:
		총 스택 저장 공간의 크기 입력 >>  3 (사용자가 입력)
		문자열 입력 >> hello
		문자열 입력 >> sunny
		문자열 입력 >> smile
		문자열 입력 >> happy
		스택이 꽉 차서 푸시 불가!
		문자열 입력 >> 그만
		스택에 저장된 모든 문자열 팝 : smile sunny hello
*/
interface Stack {
	int length();					// 현재 스택에 저장된 개수 리턴
	int capacity();					// 스택의 전체 저장 가능한 개수 리턴
	String pop();					// 스택의 톱(top)에 저장된 문자열 리턴하고 저장소에서 문자열 삭제
	boolean push(String val);		// 스택의 톱(top)에 저장소에 문자열 넣고 실행 결과 boolean 타입으로 리턴
}
class StringStack implements Stack{
	String[] arr;
	int rooms;
	Scanner sc = new Scanner(System.in);
	int count = 0;
	int arrIdx = 0;
	@Override
	public int length() {// 현재 스택에 저장된 개수 리턴
		for(int i = 0; i < rooms; i++) {
			if(!arr[i].equals("")) {
				count++;
			}
		}
		return count;
	}

	@Override
	public int capacity() { // 스택의 전체 저장 가능한 개수 리턴
		return rooms;
	}

	@Override
	public String pop() {// 스택의 톱(top)에 저장된 문자열 리턴하고 저장소에서 문자열 삭제
		for(int i = 0; i < rooms; i++) {
			if(!arr[i].equals("")) {
				arrIdx++;
			}
		}
		String lastword = arr[arrIdx-1];
		arr[arrIdx-1] = "";
		return lastword;
	}

	@Override
	public boolean push(String val) {// 스택의 톱(top)에 저장소에 문자열 넣고 실행 결과 boolean 타입으로 리턴
		boolean tf;
		for(int i = 0; i < rooms; i++) {
			if(!arr[i].equals("")) {
				count++;
			}
		}
		if(count == rooms) {
			tf = false;
		}else {
			tf = true;
			arr[count-1] = val;
		}
		return tf;
	}
	void run(){
		System.out.println("총 스택 저장 공간의 크기 입력 >>");
		this.rooms = Integer.parseInt(sc.nextLine());
		arr = new String[rooms];
		for(int i = 0; i < rooms; i++) {
			arr[i] = "";
		}
		boolean go= true;
		while(go) {
			System.out.println("문자열 입력>>");
			String inStr = sc.nextLine();
			if(inStr.equals("그만")) {
				System.out.print("스택에 저장된 모든 문자열 문자열 : ");
				for(int i = 0; i < rooms; i++) {
					System.out.print(arr[i] + " ");				
				}
				System.out.println();
				return;
			}else if(!inStr.isBlank()) {
				if(arrIdx==rooms) {
					System.out.println("스택이 꽉 차서 푸시 불가!");
				}else {
					arr[arrIdx] = inStr;
					arrIdx ++;
				}
			}else {
				System.out.println("공백을 입력할 수 없어요~~");
			}
		}
	}
	
	
}
public class Test126 {
	public static void main(String[] args) {

		StringStack s = new StringStack();
		s.run();	// 프로그램 구동 시작
		System.out.println(s.length());
		s.capacity();
		s.pop();
		s.push("성공");
		System.out.print("스택에 저장된 모든 문자열 문자열 : ");
		for(int i = 0; i < s.rooms; i++) {
			System.out.print(s.arr[i] + " ");				
		}
		
	}
}