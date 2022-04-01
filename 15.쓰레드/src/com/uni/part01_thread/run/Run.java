package com.uni.part01_thread.run;

import com.uni.part01_thread.model.thread.Thread1;
import com.uni.part01_thread.model.thread.Thread2;

public class Run {
	
	// Runnable 인터페이스 vs Thread 클래스의 차이점
	// - Runnable 인터페이스는 스레드화 될 수 있는 메소드 run() 메소드를 가지고있다. 
	// - Thread 클래스는 Runnable 인터페이스를 구현하고 있으며 스레드를 활성화 하는 start() 메소드를 가지고있다.
	// - Thread 클래스는 Thread 상태를 제어 할 수 있는 메소드를 가지고 있다.

	public static void main(String[] args) {

		Thread1 th1 = new Thread1(); //메인 스레드
		
		Thread2 th2 = new Thread2(); //runnable 인터페이스 받은 스레드
		Thread th = new Thread(th2);
		
//		th1.run();
//		th.run();
		
		th1.start();
		th.start();
		
		System.out.println("메인메소드"); //스레드보다 나중에 작성되었지만 먼저 실행됨.
		
		//th1.start(); //한번 스타트해서 사용한 객체는 다시 사용이 불가함. 새로운 객체를 만들어야 함.
	}

}
