package com.uni.chap02_byte.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileByteTest {

	// "바이트 기반 스트림" 가지고 데이터 입출력 해보기!
	
	// "바이트 스트림" : 데이터를 1바이트 단위로 전송하는 통로다! (좁은 통로임.. 1바이트면 한글은 깨짐..)
	// "기반 스트림" : 외부매체랑 직접적으로 연결되는 통로다!
	
	// "바이트 기반 스트림"   --> 외부매체를 지정하고 그 외부매체와 직접적으로 연결된 통로에 데이터를 1바이트 단위로 전송하겠다!! (입력 및 출력)
	
	// XXXInputStream	: XXX매체로부터 데이터를 입력받는 통로 (외부매체로 부터  데이터 읽어오겠다. 가져오겠다.)
	// XXXOutputStream	: XXX매체로 데이터를 출력하는 통로 (외부매체에 데이터 쓰겠다. 빼내겠다.)
	
	// File Input/Output Stream 		--> 외부 매체로 파일로 지정!
	// Audio Input/Output Stream		--> 외부 매체로 오디오장치로 지정!
	// Piped Input/Output Stream		--> 외부 매체로 또다른 프로세스로 지정! (프로세스간 통신)

	//프로그램 --> 외부매체(파일)  ( 출력 : 프로그램 내의 데이터를 파일로 내보내기 , 즉 파일로 저장)
	public void fileSave() {
		
		//FileOutputStream : "파일"로 데이터를 1바이트 단위로 출력하는 스트림 
		//1. FileOutputStream 객체 생성시 연결통로가 만들어짐 (해당 파일이 없으면 자동으로 새로 만들어지고 연결, 있으면 그냥 바로 연결 )
		FileOutputStream fout = null;
		try {
			
			//true 미작성시 : 기존에 해당 파일이 있을경우 덮어씌워짐  (기본값 false)
			//true 작성시 : 기존에 파일이 있는 경우 이어서 작성됨 (append)
			fout = new FileOutputStream("a_bite.txt"); 
			
			//2. 파일에 데이터를 출력하고자할때 write()메소드를 사용 //IOException발생
			//1byte 단위로 출력이 되기 때문에 -128~127 까지의 숫자만 출력이 가능 ( 단, 파일에는 해당 숫자의 고유한 문자가 기록됨 )
			//즉, 음수를 출력하면 깨져서 저장됨

			fout.write(97); //-> 해당하는 아스키코드로 변환. 97 == 'a'
			fout.write('b');
			//fout.write('강'); //한글은 2byte이기 때문에 깨져서 저장됨 -> 바이트단위 스트림으로는 제한이 있음
			
			//바이트 배열 저장 가능
			byte[] bArr = {99,100,101};
			fout.write(bArr);
			
			// write(byte[] b, int off, int len) : off 인덱스 부터 len 개 만큼
			fout.write(bArr, 0, 1);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(fout != null)
				try {
					//3. 스트림을 이용했으면 반드시 반납해야 한다.
					fout.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}
	
	public void fileRead() {
		//FileInputStream : "파일"로 부터 데이터를 1바이트 단위로 입력받는 스트림 
		//1. FileInputStream 객체생성 --> 객체 생성시 연결통로가 만들어짐 (해당 파일이 없으면 FileNotFoundException발생 )

		FileInputStream fis = null;
		try {
			fis = new FileInputStream("a_bite.txt");
			/*System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());*/
			
			int value = 0;
			while((value = fis.read()) != -1) { //read() 하면서 담아준다 ,EOF(파일의 끝)을 만나면 -1
				System.out.println(value);
				System.out.println((char)value);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(fis != null);
		} try {
			//3. 스트림을 이용했으면 반드시 반납해야 한다.
			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
	}
}
