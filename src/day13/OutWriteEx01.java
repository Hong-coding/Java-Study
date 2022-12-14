package day13;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class OutWriteEx01 {

	public static void main(String[] args) {

		FileOutputStream fos = null;
		OutputStreamWriter out = null; //둘다필요
		Scanner sc = new Scanner(System.in);
		
		String str = "파일생성 시간 : " + new java.util.Date() + "\n\n";
		System.out.println("메세지입력>>");
		str += sc.nextLine();
		
		try {
			fos = new FileOutputStream("c:\\test\\outStrWrt.txt");
			out = new OutputStreamWriter(fos);
			
			System.out.println("encoding: " + out.getEncoding());
			
			out.write(str);
			out.flush();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(fos!=null)try {fos.close();}catch(Exception e) {e.printStackTrace();}
			if(out!=null)try {fos.close();}catch(Exception e) {e.printStackTrace();}
			if(sc!=null)try {fos.close();}catch(Exception e) {e.printStackTrace();}
			
		}
	}

}
