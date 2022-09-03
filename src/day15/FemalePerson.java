package day15;

import java.util.ArrayList;
import java.util.List;

public class FemalePerson {
	
	private List<Person> list; //요소 저장할 컬렉션
	
	public FemalePerson() { //생성자
		list = new ArrayList<Person>();
	}
	//getter 공급
	public List<Person> getList() {return list;}
	
	// 요소를 list에 수집해주는 메서드
	public void accumulate(Person person) {
		list.add(person);
	}
	
	// 두 개의 FemalePerson 이 있을 때 이들을 combine 결합해주는 메서드
	public void combine(FemalePerson other) {
		list.addAll(other.getList()); //리스트를 뽑아서 다른 리스트에 넣는 형태로 추가.
	}
	
}




