package day14;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Student2 {
	private String name;
	private String gender;
	private int score;
	public Student2(String name, String gender, int score) {
		this.name = name; this.gender = gender; this.score = score;
	}
	public String getGender() {return gender;}
	public int getScore() {return score;}
}
public class PredEx01 {

	private static List<Student2> list = Arrays.asList(
			new Student2("pika", "남자", 90),
			new Student2("chu", "여자", 90),
			new Student2("pairi", "남자", 93),
			new Student2("raichu", "여자", 90) );
	
	public static double avg(Predicate<Student2> predi) {
		int count = 0; int sum =0;
		for(Student2 stu: list) {
			if(predi.test(stu)) {// 남자인지 여자인지 판별해서 true/false로 리턴
				count++;
				sum += stu.getScore();
			}
		}
		return (double)sum/count;
	}
	public static void main(String[] args) {

		//남자평균
		double maleAvg = avg(stu -> stu.getGender().equals("남자"));
		System.out.println("남자 평균 점수 : "+maleAvg);

		//여자평균
		double femalAvg = avg(stu -> stu.getGender().equals("여자"));
		System.out.println("남자 평균 점수 : "+femalAvg);
	}

}
