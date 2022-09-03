package coding_level1;

import java.util.HashMap;
import java.util.Iterator;

class Solution0622_옷조합 {
	

	//옷의 조합의 수 구하기. (단, 하나도 안입는 경우는 없다)
		public int solution0622 (String[][] clothes) {
			//1. 옷을 종류별로 구분한다
			HashMap<String, Integer> map = new HashMap<>();
			for(String [] clothe : clothes) { // ✍️✍️String clothe가 아니다
				map.put(clothe[1], map.getOrDefault(clothe[1], 0)+1);
			}
			System.out.println("map 요소: "+map.toString());
				
			
			
			//2. (옷의 종류 + 1) 별 곱 
			Iterator<Integer> it = map.values().iterator();
			int answer = 1;
			while(it.hasNext()) {
//				System.out.println("value만 뽑는다: "+it.next().intValue()); // Integer를 산술연살을 위해 intValue로 바꿈
				answer *= it.next().intValue()+1;
			}
			//3. -1 아무것도 안입는 수
			answer -= 1;
			return answer;
		}; 
			
		
		public static void main(String[] args) {
			Solution0622_옷조합 sol = new Solution0622_옷조합();
			String[][] clothes = { {"yellowhat", "headgear"},
					{"bluesunglasses", "eyewear"},
					{"green_turban", "headgear"} };
			System.out.println("hi");
			System.out.println(sol.solution0622(clothes));
			
			
		}
		
	}
