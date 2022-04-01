package com.uni.chap02_stringBuffer_stringBuilder.run;

public class Run {

	public static void main(String[] args) {
		// String 클래스의 원리
		// String a 값에 계속 값을 더해가는 경우 새로운 String 클래스가 만들어진다.

		// StringBuffer 나 StringBuilder의 원리

		// 새로운 객체를 생성시키지 않고, 기존에 있는 객체의 크기를 증가시키면서 값을 더한다.
		// * 응답시간
		// String > StringBuffer > StringBuilder
		// * 메모리
		// String > StringBuffer == StringBuilder

		/*
		 * StringBuffer나 StringBuilder는 mutable이다.(가변) 16개의 문자를 저장할 수 있는 공간이 생성된다. 처음에
		 * 어떤 크기로 할지 정해서 생성할 수도 있다.
		 */

		 method1();
		//method2();
		//method3();
		//method4();
	}

	private static void method3() {
		StringBuilder sb = new StringBuilder("난");
		//append : 뒤에 값을 추가
		sb.append("배가고프다").append("!!!!"); // 메소드체이닝 : 여러 메소드를 이어서 호출하는 문법
		
		System.out.println(sb);
		System.out.println(sb.capacity());
		System.out.println(sb.length());

		//insert 삽입
		sb.insert(1, "점심시간전이라 ");
		System.out.println(sb);
		
		//delete 삭제
		sb.delete(0, 8); //시작인덱스부터 끝인덱스-1까지 삭제
		System.out.println(sb);
		
		//reverse 반전
		sb.reverse();
		System.out.println(sb);
	}

	private static void method2() {
		String str = "반가워";
		System.out.println("str 기존 : " + str + " 주소 : " + System.identityHashCode(str));
		str += " 나는 스트링이라고 해";
		System.out.println("str 변경 후 : " + str + " 주소 : " + System.identityHashCode(str));

		StringBuffer sbf = new StringBuffer("안녕~~");
		System.out.println("sbf 기존 : " + sbf + " 주소 : " + System.identityHashCode(sbf));
		sbf.append(" 난 스트링 버퍼야"); // 스트링버퍼에서 문자열 추가는 append
		System.out.println("sbf 변경 후 : " + sbf + " 주소 : " + System.identityHashCode(sbf));

		StringBuilder sbd = new StringBuilder("WoW");
		System.out.println("sbd 기존 : " + sbd + " 주소 : " + System.identityHashCode(sbd));
		sbd.append(" 난 스트링 빌더야");
		System.out.println("sbd 변경 후 : " + sbd + " 주소 : " + System.identityHashCode(sbd));

	}

	private static void method1() {

		StringBuilder sb = new StringBuilder("환불원정대");
		System.out.println(sb.capacity()); // capacity: sb의 크기
		System.out.println(sb.length()); // 문자열의 길이

		StringBuilder sb1 = new StringBuilder(20); // 기본 메모리 크기 확보를 정해서 생성할 수도 있다.
		System.out.println(sb1.capacity());

	}
	
	public static void method4() {
		
		
		StringBuffer stringBuffer = new StringBuffer();
		StringBuilder stringBuilder = new StringBuilder();
		new Thread(() -> {
			int a = 0;
		    for(int i=0; i<10000; i++) {
		    	
		    	a = i;
		        stringBuffer.append(1);
		        stringBuilder.append(1);
		    }
		   System.out.println(a+1);
		}).start();

		new Thread(() -> {
			int b = 0;
		    for(int i=0; i<10000; i++) {
		    
		    	b=i;
		        stringBuffer.append(1);
		        stringBuilder.append(1);
		    }
		    System.out.println(b+1);
		}).start();

		new Thread(() -> {
		    try {
		        Thread.sleep(5000);
		        
		        System.out.println("StringBuffer.length: "+ stringBuffer.length());
		        System.out.println("StringBuilder.length: "+ stringBuilder.length());
		    } catch (InterruptedException e) {
		        e.printStackTrace();
		    }
		}).start();

		}

}
