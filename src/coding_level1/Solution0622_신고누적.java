package coding_level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

class Solution0622_신고누적 {



    public int[] solution(String[] id_list, String[] report, int k) {
    	int[] answer = new int[id_list.length];
        /*
        //0. 리포트에 있는 배열을 해시셋으로 담는다. == 중복제거를 위해서 전처리
        
    	HashSet<String> reportSet = new HashSet<>();
    	for(String rp:report)reportSet.add(rp);
    	
    	HashMap<String, ArrayList<String>> notifyListHash = new HashMap<>();
    	for(String id:reportSet) {
    		int blankIdx = id.indexOf(" ");
    		String reporter = id.substring(0, blankIdx);
    		String reportee = id.substring(blankIdx+1);
    		
    		ArrayList<String> reporterList = notifyListHash.getOrDefault(reportee, null);
    		if(reporterList == null) reporterList = new ArrayList<String>();
    		
    		reporterList.add(reporter);
    		notifyListHash.put(reportee, reporterList);
    		
    	}
        
        //2. 1을 기반으로 신고결과 보고받을 해시맵 key는 맴버, value는 신고자 목록에서 k이상의 신고당한 value에 값에 해당하면 +1
    	HashMap<String, Integer> reporterHash = new HashMap<>();
    	for(ArrayList<String> notifyList:notifyListHash.values()){
    		if(notifyList.size()>=k) {
    			for(String reporter : notifyList) {
    				reporterHash.put(reporter, reporterHash.getOrDefault(reporter, 0)+1);
    			}
    		}
    	};            

    	// 2를 기반으로 hash에 있는 값을 answer 배열로 옮겨담는다
    	for(int i = 0 ; i<id_list.length; i++) {
    		answer[i] = reporterHash.getOrDefault(id_list[i], 0);
    		System.out.println(answer[i]);
    	}
        
    	
    	
        return answer;
        */
    	
    	//신고리스트 반복제거
    	List<String> list = Arrays.stream(report).distinct().collect(Collectors.toList());
    	for(String i: list) {
    		System.out.println(i);
    	}
    	System.out.println(list.toString());
        HashMap<String, Integer> count = new HashMap<>();
        for (String s : list) {
            String target = s.split(" ")[1];
            count.put(target, count.getOrDefault(target, 0) + 1);
        }

        return Arrays.stream(id_list).map(_user -> {
            final String user = _user;
            List<String> reportList = list.stream().filter(s -> s.startsWith(user + " ")).collect(Collectors.toList());
            return reportList.stream().filter(s -> count.getOrDefault(s.split(" ")[1], 0) >= k).count();
        }).mapToInt(Long::intValue).toArray();
        
    }
    public static void main(String[] args) {
		Solution0622_신고누적 sol = new Solution0622_신고누적();
		String[] id_list = {"muzi", "frodo", "apeach", "neo"};
		String[] report = {"muzi frodo","muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
		
		System.out.println(sol.solution(id_list, report, 2));
	}
}