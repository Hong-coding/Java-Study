package day07;
import java.util.Scanner;
/*
	n명이 참가하는 끝말잇기 게임을 만드세요. 
	처음단어는 "자동차"이다. n명의 참가자들은 순서대로 자신의 단어를 입력하면 된다. 
	끝말잇기에서 틀리면 게임오버 -> 진사람 이름 출력하고 프로그램 종료 
	WordGameApp 클래스와 각 선수를 나타내는 Player 클래스 작성. 
	WordGameApp : 게임을 전체적으로 진행하는 run(), 
				run()에서 플레이어수 만큼 Player객체 배열 생성
	Player : 플레이어 이름, 단어입력받는 getWordFromUser()메서드, 
	 		끝말잇기 성공여부와 게임계속할지 판별하는 checkSuccess() 메서드 
	# tip : 문자열중 첫번째 문자 알아내는 방법은 String클래스의 charAt(0); 사용 
	String word = "자동차"; 
	char firstChar = word.charAt(0);
*/
class Player {
//n명이 참가하는 끝말잇기 게임을 만드세요. 
//처음단어는 "자동차"이다. n명의 참가자들은 순서대로 자신의 단어를 입력하면 된다. 
//끝말잇기에서 틀리면 게임오버 -> 진사람 이름 출력하고 프로그램 종료 
//	String player;
//	Scanner sc;
//	int num = Integer.parseInt(sc.nextLine());
//	String [] players = new String[num];
//	void getWordFromUser() {
//		
//	}
//	public Player() {
//	}
	
	private String name; //#5. 			// #7. private붙이기. 캡슐화
	String inputWord =""; //#11. 밖으로 빼기. 입력받은 변수를 여러 메서드에서 써야하니까 / 인스턴스 변수가 되어야 그 아래 메서드들에서 접근 가능해짐
							// nullPointException발생하지 않게 빈칸 넣어둠
	public void setName(String name) { //#7. 캡슐화 세트
		this.name = name;
	}
	public String getName() { 			//#7. 캡술화 세트
		return name;
	}
	 		
	public String getWordFromUser() { //#5. 단어입력받기 메서드 이름만 적어놓고 아직 모르니까 void //#12. 리턴타입 String으로 바꾸기
		Scanner sc = new Scanner(System.in);//#5. 해당 선수차례가 오면 단어를 입력받아야 함//#9.
		System.out.println(name +">>");
		inputWord = sc.nextLine(); 	//#11. 밖으로 빼기 --> 앞에 뺐으니까 선언할 필요없어 String 뺌
		
		return inputWord; // #12. 입력받은 값을 리턴해주고
	}
	boolean checkSuccess(String lastWord) { //#5.이름만 적어놓고 아직 모르니까 void.  입력받은 첫글자와 이전 단어 마지막 글자가 일치하는지 검사하는 메서드
		// #12. 비교해야 하는데 입력하지 전에 입력해둔 단어를 저장할 변수도 만들어야. 저장을 하되 리턴타입 스트링으로 바꿔야
		//#14. 체크 할 때 맞는지 틀린지 while, true로 빠져야되고, 맞으면 다시 반복, 틀리면면 --> inputWord랑 비교해서 true false알려줘야 --> boolean타입으로 바꿔야
		//#14. 매개변수로 지난 단어 받아야
		boolean check = false; // 14. 처음은 false로 초기화
		int lastIdx = lastWord.length() - 1; //문자가 길이가 얼마가 됐든 마지막 글자 인덱스 번호
		char lastChar = lastWord.charAt(lastIdx); // 해당 글자
		char firstChar = inputWord.charAt(0); //첫번째 글자
		if (lastChar == firstChar) {
			check = true;	// 리턴이 아니라 check 변수에 넣어줘야
		}
		return check; // ★ 불리안 타입의 메서드는 true 또는 false 를 리턴해줘야
		
	}
	
}

//Player : 플레이어 이름, 단어입력받는 getWordFromUser()메서드, 
//끝말잇기 성공여부와 게임계속할지 판별하는 checkSuccess() 메서드 
//# tip : 문자열중 첫번째 문자 알아내는 방법은 String클래스의 charAt(0); 사용 
//String word = "자동차"; 
//char firstChar = word.charAt(0);
class WordGameApp {
	private String startWord = "자동차"; //#2. 런되기 전에 넣어 놓는 말. 따로 넣은 이유 게임 세팅을 메서드로 분류잘라넣으려고 
		
	//#18. 게입시작 세팅을 따로 메서드로 빼기
	int num = 0; // 18.4 그냥 넘을 빼는 게 아니고 0을 넣어놈. 스캐너가 아래에 있어 복잡해지니까..
	Player[] p ; //#4. //run()에서 플레이어수 만큼 Player객체 배열 생성	//18.3. 위로 뺀다  //18.5 이것도 객체생성 선언만 해두고 아래에서 작성
									//18.4 num도 뺀다
	void createPlayers() {
		System.out.println("게임참가 인원 >>"); 
		Scanner sc = new Scanner(System.in); 
		num = Integer.parseInt(sc.nextLine()); // 18.4. num을 위로 빼면서 정의했으니까 여기서는 int를 뺌
		p = new Player[num]; //#4. //run()에서 플레이어수 만큼 Player객체 배열 생성	//18.3. 위로 뺀다. 선언만위로. 
									// 18.4선언만 위에서하고 객체 생성 뒤에서 하는 이유는 이 메서드가 나중에 불리니까. 더 효율적
		
		for(int i = 0; i < num; i++){//#6.
		
			p[i] = new Player();
			System.out.println("참가자 이름 입력>>");
			p[i].setName(sc.nextLine()); // #7 캡슐화 참가자 이름 입력받아 객체 배열 안 변수에 저장. 
										//이로써 게임참가자까지 준비 완료됨.
		//18.2 옮기고나서 스캐너가 문제가 생기니까 스캐너 옮기기
		}
	}
	void run() {		//#1. 
		System.out.println("게임시작");
		/*
		Scanner sc = new Scanner(System.in); //#3. 개발할 때 런에 다 넣어놔도 된다. 
								//플레이어까지 따로 안만들어도 상관은없지. 
							//여기에 다 작성 후 메서드로 분류할 수 있는 것들 = 플레이어로 갈 수 있는 것들을 보내면 된다.
		
		//게입시작 세팅 --> #18 메서드를 따로 빼서 옮기기 ( run()을 간결하게 만들기 위해서)
		//String lastWord = startWord;//#13.  --->#18.0 게임 진행 전으로 옮기기
		
		System.out.println("게임참가 인원 >>"); 
		int num = Integer.parseInt(sc.nextLine());
		
		Player[] p = new Player[num]; //#4. //run()에서 플레이어수 만큼 Player객체 배열 생성
		
		for(int i = 0; i < num; i++){//#6.
		
			p[i] = new Player();
			System.out.println("참가자 이름 입력>>");
			p[i].setName(sc.nextLine()); // #7 캡슐화 참가자 이름 입력받아 객체 배열 안 변수에 저장. 
										//이로써 게임참가자까지 준비 완료됨.
		}
		*/

		//#19. 이제 옮긴거를 호출해야함. 게임 진행 전에 플레이어 만드는 메서드를 호출
		createPlayers(); // 메서드가 메서드를 호출
		
			
		//#8. 게임 진행 . 단어 입력 시작. 단어입력 메서드는 따로 있지. 기능구현을 여기서 해놓고 실현은 위에 메서드로. 
		String lastWord = startWord; //#18.0
		System.out.println("시작 단어는 "+ startWord +"입니다.");
		
		int idx = 0; // while문 안에서 인덱스 번호로 사용할 변수 미리 선언. 0부터 시작
		while(true) { // 계속 돌리는 무한반복. 인덱스 번호 모르니까 위에 지정
			String newWord = p[idx].getWordFromUser(); //#12. 변수에 저장  새로 입력받은 것.
			//p[idx].checkSuccess(lastWord); //#10. 12. 성공했는지 확인할 때 이전 거를 매개변수로 넣어줄건데, 첫게임은 startword. 이전에 받은 걸 이 매개변수로 던져줘야
								//#13. 게임 시작세팅에서 단어순서 정리
			if(!p[idx].checkSuccess(lastWord)) { //#15. true false를 리턴하니까 이걸 if문으로 체크하도록 감싸줘야함
				System.out.println("게임오버"+ p[idx].getName()+"님이 졌습니다");	// 맞았을 땐 할 게 없고, 틀렸다면 반복문을 나가야
																			// idx .getName 게터로 해당 이름 가져오고
				break;
			}
			lastWord = newWord; //#13. 체크가 끝난 다음에는 지난 단어로 입력받은 단어를 내내
			idx++;//#16 번호도 증가해야
			idx %= p.length;//#17 인덱스 증가하면서 점점 증가가 아니라 0,1,2,n+1 -> 0,1,2 이렇게 반복해야되니까
		}
		//#18.3 p가 다른 메서드로 빠져나가니까 문제가 생겼으니 해당 p를 위로 빼면 됨

		// #20 문제는 스캐너가 닫기지 않았으니까 닫으려면 
		//Scanner sc 도 인스턴스 변수로 만들어서 밖에 놓고,
		//종료되는 메서드로 호출되게 만들어서 close하면됨.
	}
}
public class Test91 {
	public static void main(String[] args) {
		
		
		
		// main 작성 완료
		WordGameApp game = new WordGameApp();
		game.run(); // #0 WordGameApp{}클래스에 run()메서드 있어야 부를 수 있겠지.
	
	}
}
