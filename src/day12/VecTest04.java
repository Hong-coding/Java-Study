package day12;

import java.util.Iterator;
import java.util.Vector;

public class VecTest04 {

	public static void main(String[] args) {

		Vector<Integer> v = new Vector<Integer>();
		v.add(10);
		v.add(20);
		v.add(30);
		
		//iterator는 컬렉션 객체에서 iterator()메서드를 통해 얻을 수 있다.
		Iterator<Integer> it = v.iterator(); // 따로 임포트 필요
		while(it.hasNext()) { // 처음으로 돌아와서 내용이 있으면 true, 다음거로 자동으로 넘어감
			int n = it.next();
			System.out.println(n);
		}
		// // 반복자는 next로 커서를 계속 내리미리면 끝남 다시 얻어와야 함
		it = v.iterator(); //변수재활용 덮어쓰기
		int tot = 0;
		while(it.hasNext()) {
			System.out.println("hello");
			int nn = it.next();
			tot += nn;
			System.out.println(nn); 
		}
		System.out.println(tot);
		
	}

}
