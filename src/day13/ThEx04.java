package day13;

import javax.swing.JOptionPane;

class ThreadTime extends Thread{
	@Override
	public void run() {
		System.out.println("10초 안에 값을 입력해야 합니다.");
		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
		ThEx04.inputcheck = true; 
		System.out.println("입력값은 "+input);

	}
}
class ThreadInput extends Thread{
	
	@Override
	public void run() {
		//10초안에 입력해야 함
		for(int i = 10; i > 0; i--) {
			// 다른 스레드 통해 입력했는지 검사
			if(ThEx04.inputcheck) {return;} // 입력했으면 run()메서드 종료 -> 스레드 종료
			System.out.println(i);
			try {
				Thread.sleep(1000);
				
			}catch(Exception e) {e.printStackTrace();}
		}
	


		
		System.out.println("10초동안 값이 입력되지 않아 종료합니다.");
		System.exit(0); //프로그램 종료(빨간버튼 누러 종료하듯)
			
	}

}
public class ThEx04 {

	static boolean inputcheck = false;
	public static void main(String[] args) {
		
		
		ThreadTime th = new ThreadTime();
		ThreadInput inputTh = new ThreadInput(); 
		System.out.println(th.getPriority());
		th.start();
		inputTh.start();
	}	
}
