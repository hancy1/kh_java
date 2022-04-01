package com.baekjoon;

import java.util.Scanner;

public class Main {

	public static int[] stack; // 스택 생성
	public static int size = 0; // 사이즈 선언

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder(); // 스캐너로만 하면 시간초과가 생겨서 빌더 사용

		int N = sc.nextInt(); // 정수 n을 입력받음

		stack = new int[N]; // 스택 사이즈 할당

		for(int i = 0; i < N; i++) { //while 대신 for문으로 반복을 하게 하는데 이유를 모르겠다.

			String str = sc.next(); // 케이스 값 입력

			switch (str) {

			case "push":
				push(sc.nextInt());
				break;

			case "pop":
				sb.append(pop()).append('\n');
				break;

			case "size":
				sb.append(size()).append('\n');
				break;

			case "empty":
				sb.append(empty()).append('\n');
				break;

			case "top":
				sb.append(top()).append('\n');
				break;

			}

		}
		System.out.println(sb);

	}

	public static void push(int item) {
		stack[size] = item;
		size++;
	}

	public static int pop() { // 반환을 해야하기 때문에 반환형으로 int사용

		if (size == 0) {
			return -1; // 반환할 값이 없다면 -1을 반환하도록
		} else {
			int i = stack[size - 1]; // 가장 위에 있는 값을 할당
			stack[size - 1] = 0; // 0으로 만들고 초기화하기
			size--;
			return i;
		}
	}

	public static int size() {

		return size;
	}

	public static int empty() {

		if (size == 0) {
			return -1;
		} else {
			return 0;
		}
	}

	public static int top() {

		if (size == 0) {
			return -1;
		} else {
			int i = stack[size - 1]; // 가장 위에 있는 값
			return i;
		}

	}
}
