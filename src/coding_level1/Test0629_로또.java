package coding_level1;

import java.util.Arrays;

import example.method.main;
class Test0629_로또 {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {};
        
        //1. 정렬한다
        Arrays.sort(lottos);
        //2. 맞는 개수를 센다
        int match = 0;
        for(int num: lottos){
            for(int num2: win_nums){
                if (num== num2) match+=1;
            };
        };
        switch (match){
            case 4:
            	answer[0] = 1;
            	answer[1] = 3;
                break;
            case 3:
                answer[0] = 2;
                answer[1] = 4;
                break;
            case 2:
                answer[0] = 3;
                answer[1] = 5;
                break;
            case 1:
                answer[0] = 4;
                answer[1] = 6;
                break;
            case 0:
                answer[0] = 5;
                answer[1] = 6;
                break;
        }
        //3. 개수+2, 개수 등수를 반환한다
        
        return answer;
    }
    public static void main(String[] args) {
    	int[] lottos = {44,1,0,0,31,25};
    	int[] wins_nums = {31,10,45,1,6,19};
    	Test0629_로또 sol = new Test0629_로또();
    	System.out.println(sol.solution(lottos, wins_nums));
    }
}