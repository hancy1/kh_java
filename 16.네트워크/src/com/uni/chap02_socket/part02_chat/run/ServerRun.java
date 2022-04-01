package com.uni.chap02_socket.part02_chat.run;

import com.uni.chap02_socket.part02_chat.controller.ChatServerManager;

public class ServerRun {

	public static void main(String[] args) {

		ChatServerManager s = new ChatServerManager();
		s.startServer();
	}

}
