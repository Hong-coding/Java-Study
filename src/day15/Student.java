package day15;

public class Student implements Comparable<Student> {
	private String name;
	private int score;
	public Student(String name, int score){
		this.name= name; this.score = score;
	}
	public String getName() {return name;}
	public int getScore() {return score;}
	@Override
	public int compareTo(Student o) {
//		return Integer.compare(score, o.score); //정렬을 위해서는 외부에서 던져준 객체의.점수와비교
		return name.compareTo(o.name); //문자로비교
			//String.coparedTo 사전순 비교의 형태와 유사, 숫자리턴
			//	score < o.score : 음수
			//	score == o.score : 0
			//	score > o.score : 양수 리턴
	}
}


