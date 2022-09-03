package coding_level1;
//정수 num이 짝수일 경우 "Even"을 반환하고 홀수인 경우 "Odd"를 반환하는 함수, solution을 완성해주세요.
//
//제한 조건
//num은 int 범위의 정수입니다.
//0은 짝수입니다.
//입출력 예
//num	return
//3	"Odd"
//4	"Even"
//class Solution {
//  public String solution(int num) {
//      String answer = "";
//      return answer;
//  }
//}
class Test01 {
  public String solution(int num) {
      String answer = "";
      //
      if(num%2==0) {
      	answer = "Even";
      }else {
      	answer = "Odd";
      }
      return answer;
  }
  public static void main(String[] args) {
	  Test01 sol = new Test01();
	  System.out.println(sol.solution(2));
  }
}
