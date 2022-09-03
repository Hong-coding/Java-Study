package day13;

import java.io.File;

public class FileEx01 {

	public static void main(String[] args) {

		//File f = new File("‪C:\\Windows\\system.ini"); // 역슬래시를 문자로 표현하려면 \\두개 해야. 이크케이프문자로 인식안대게. 
		File f = new File("c:\\Windows\\system.ini");// 복붙하지 않고 직접 적어야 제대로 파일 정보 가져옴.
		long size = f.length();	//파일 크기
		System.out.println(size); 
		String filename = f.getName(); // 파일명
		String path = f.getPath(); // 파일 경로
		String parentPath = f.getParent(); // 파일의 부모 경로
		String absolPath = f.getAbsolutePath(); // 절대경로 (결과는 동일)
		
		// 파일 타입 판별
		if(f.isFile()) {
			System.out.println(f.getPath()+"는 파일입니다.");
		}else if(f.isDirectory()) {System.out.println(f.getPath()+"는 폴더입니다.");}
		
		// 파일 속성
		System.out.println(f.isHidden()); //숨김파일인지
		System.out.println(f.canRead()); //
		System.out.println(f.canWrite()); //
		System.out.println(new java.util.Date(f.lastModified()));
		
		
		// 파일 리스트 얻어오기
		File f2 = new File("c:\\Windows");
		File[] list = f2.listFiles();
		for(int i = 0; i < list.length; i++) {
			System.out.println(list[i].getName());
			System.out.println("\t파일크기: " + list[i].length()); //
		}
		
		// 없는파일 경로확장자까지 다 적고 . create하면 생성됨
		File f3 = new File("c:\\test\\kor.txt");
		try {
			f3.createNewFile();
		}catch(Exception e) {
			System.out.println(e);
		}
		
		File f4 = new File("c:\\test\\iotest");
		if(!f4.exists()) {// 없으면. 중복검사
			f4.mkdir(); //폴더생성
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
