package com.uni.chap02_socket.part01_tcp.sample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	public void serverStart() {
		
		//1. 서버의 포트번호 정하기(0~65536) // (0~1023)이 번호들은 이미 지정된 경우가 많아 8천번대 이상으로 많이 씀
		int port = 8500;
		String serverIp = null;
		
		//2. 서버소켓만들기
		ServerSocket server = null;
		try {
			server = new ServerSocket(port);
			
			//3. 클라이언트로부터 접속 요청이 올 때까지 대기
			System.out.println("클라이언트의 요청을 기다리고 있습니다.");
			
			//4. 접속요청이 오면 요청수락 후 해당 클라이언트에 대한 소켓 객체 생성
			Socket client = server.accept();
			
			String clientIp = client.getInetAddress().getHostAddress(); //우리꺼에서 했기 때문에 본인 ip를 가져옴. 다른 상황이라면 해당 ip를 호출해야함
			System.out.println(clientIp + "가 연결을 요청했습니다.");
			
			//5. 연결된 클라이언트와 입출력 스트림 생성
			InputStream input = client.getInputStream();
			OutputStream output = client.getOutputStream();
			
			//6. 보조스트림을 사용해서 성능개선
			BufferedReader br = new BufferedReader(new InputStreamReader(input));
			
			PrintWriter pw = new PrintWriter(output);
			
			//7. 스트림 통해 읽고 쓰기
			String message = br.readLine();
			System.out.println(clientIp + "가 보낸 메세지: " + message);

			//서버 -> 클라이언트 메세지 전송
			pw.println("만나서 반갑습니다.");
			pw.flush();
			
			//8. 통신종료
			pw.close();
			br.close();
			
			server.close();
			
					
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
