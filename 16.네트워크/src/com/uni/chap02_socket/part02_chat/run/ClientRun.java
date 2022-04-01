package com.uni.chap02_socket.part02_chat.run;

import com.uni.chap02_socket.part02_chat.controller.ChatClientManager;

public class ClientRun {

	public static void main(String[] args) {
		
		ChatClientManager client = new ChatClientManager();
		client.startClient();

	}

}
