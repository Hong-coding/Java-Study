package day13;

import java.io.FileInputStream;

public class FileInEx02 {

	public static void main(String[] args) {

		FileInputStream fis = null;
		try {
			fis = new FileInputStream("c:\\test\\fos.txt"); //해당 파일 읽어오기
			
			//int i = 0; 바로출력할거라 안씀
			int c;
			while((c=fis.read()) !=-1) {
				System.out.print((char)c); // 숫자니까 캐릭터타입으로 변형해서 // 한글깨짐 문자스트링을 같이써야함. 파일스트림 한글아닌 이미지같은거 ,....한글같이쓰려면 문자스트링
			}
			System.out.println();
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(fis!=null)try {fis.close();}catch(Exception e) {e.printStackTrace();}
		}
	}

}
