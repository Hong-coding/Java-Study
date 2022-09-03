package day14;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

class Student{
	private String name;
	private int engScore;
	private int mathScore;
	public Student(String name, int engScore, int mathScore) {
		this.name = name; this.engScore = engScore;
		this.mathScore = mathScore;
	}
	public String getName() {return name;}
	public int getEngScore() {return engScore;}
	public int getMathScore() {return mathScore;}
}
public class FuncEx01 {
	
	// 간단하게 Student 객체들을 생성해서 담은 list를 하나 만듦.
	//private static List<Student> list = new ArrayList();
	private static List<Student> list = Arrays.asList(
			new Student("pick", 90, 80),
			new Student("raichu",95,92)
		);
	//#2.
	public static void printString(Function<Student, String> function) {
			for(Student stu : list) {
				System.out.print(function.apply(stu)+" ");
			}
			System.out.println();
	}
	public static void printInt() {
		
	}
	
	
	//#3. 정수 출력( 점수 출력)
	public static void printInt(ToIntFunction<Student> function) {
										// function = t-> t.getEngScore();
		for(Student stu:list) {
			System.out.print(function.applyAsInt(stu)+"  ");
		}
		System.out.println();
	}

	public static void main(String[] args) {

		//#3.
		System.out.println("# 학생 이름 #");
		printString(t -> t.getName());
		System.out.println("# 영어 점수 #");
		printString(t -> t.getEngScore()); // Int applyAsInt(T t)
		System.out.println("# 수학 점수 #");
		printString(t -> t.getMathScore());
		
		/*#2.
		System.out.println("# 학생이름 #");
		printString(t -> t.getName());
		//printString((t)->{return t.getName();}); //생략 전
		
		
		/*#1.
		List list = Arrays.asList("hello","hi");
		Object list2 = Arrays.asList("hello",10); 
		List list3 = Arrays.asList(1,2,3,4,5); // 아래 긴 코드랑 동일
		List list4 = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		*/
	}

}
