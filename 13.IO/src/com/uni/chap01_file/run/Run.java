package com.uni.chap01_file.run;

import java.io.File;
import java.io.IOException;

public class Run {

	public static void main(String[] args) {
		// file : 파일을 제어하기 위한 클래스로 입출력 기능을 제공하지 않는다.- 파일의 입출력은 입출력 스트림을 사용해야한다.
	
		
		try {
			//1. 경로를 주지 않을 때는 내 프로젝트 폴더에 파일 생성
			File f1 = new File("test.txt"); //new file하면 메모리상에 객체상태로 만든 것.
			//f1.createNewFile(); //이 메소드를 실행해야만 실제 파일이 생성
			
			//2. 존재하는 기본 드라이브나 폴더에 파일 생성
//			File f2 = new File("D:\\test.txt");
//			f2.createNewFile();
			
			//3. 폴더 만들고 파일 생성
//			File f3 = new File("C:\\java\\test.txt"); //없는 폴더 생성이 바로 되지 않고 IOE 에러 발생
//			f3.createNewFile();
			
			File testFolder = new File("C:\\java\\test"); //확장자를 지정하지 않으면 폴더로 인식
			testFolder.mkdir();
			File f3 = new File("C:\\java\\test\\test.txt"); //폴더가 이미 생성되어 있는 상태라 에러 안 뜨고 파일 생성
			f3.createNewFile();
			
			System.out.println(f1.exists()); //존재여부 확인
			//System.out.println(f2.exists());
			System.out.println(f3.exists());
			System.out.println(testFolder.exists());
			
			System.out.println(f3.isFile());
			System.out.println(testFolder.isFile()); //폴더이기 때문에 false반환
			
			//경로 지정을 하지 않아서 현재 프로젝트에 생성, 확장자없으면 폴더로 생성
			File folder = new File("parent");
			folder.mkdir(); //새로운 디렉터리 생성
			
			File file = new File("parent\\parent.txt");
			file.createNewFile();
			System.out.println("파일명 : "+ file.getName());
			System.out.println("절대경로 : "+ file.getAbsolutePath()); // 최상위 경로부터 내 파일이 있는 경로까지 모두 나타낸 것
			System.out.println("상대경로 : "+ file.getPath());// 파일이 위치한 폴더를 기준으로 상대적인 경로
			System.out.println("파일 용량 : "+ file.length());
			System.out.println("상위 폴더 : "+ file.getParent());// parent

					
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
