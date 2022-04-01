package com.method.hw1.controller;

import java.util.Arrays;
import java.util.Scanner;

public class NonstaticSample {

	public void printLottoNumbers() {

		int[] lotto = new int[6];

		for (int i = 0; i < lotto.length; i++) {

			lotto[i] = (int) (Math.random() * 45 + 1);

			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--;
					return;
				}
			}
		}

		Arrays.sort(lotto);

		System.out.print("1. 랜덤 값 : ");

		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");

		}

	}

	public void outputChar(int num, char c) {

		System.out.print("2. " + c + "문자 " + num + "개 출력: ");
		for (int i = 1; i <= num; i++) {
			System.out.print(c + " ");
		}

	}

	public char alphabette() { //반환값 있을 때 리턴하는 게 헷갈림

		int num = (int) (Math.random() * 65 + 57); // 65~122 값 다시 확인하기
		for (int i = 1; i < num; i++) {

			i = (char) (num);

		}
		return (char) (num);

	}

	public String mySubstring(String str, int index1, int index2) {
		Scanner sc = new Scanner(System.in);

		char index = 0;

		for (int i = 0; i <= index2; i++) {
			index = str.charAt(i); //애매한 부분.. 다시보기
		}

		return str + "의 " + index1 + "번 " + index2 + "번 인덱스 사이의 값 출력: " + index;
	}

}
