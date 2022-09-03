package day13;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class InputReadEx01 {

	public static void main(String[] args) {

		// InputStreamReader : 바이트 스트림 -> 문자 스트림
		
		FileInputStream fin = null;
		InputStreamReader in = null; //둘다 필요 한번 감싼거로 읽어줌. 문자스트림은 보조스트림, 
		
		try {
			fin = new FileInputStream("c:\\test\\fos.txt"); //인코딩할 파일
			in = new InputStreamReader(fin); // workSpace가 UTF-8
			
			System.out.println("encoding: " + in.getEncoding());

			int c;
			while((c=in.read())!=-1) {
				System.out.print((char)c);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(fin!=null)try {fin.close();}catch(Exception e) {e.printStackTrace();}
			if(in!=null)try {fin.close();}catch(Exception e) {e.printStackTrace();}
		}
	}

}
