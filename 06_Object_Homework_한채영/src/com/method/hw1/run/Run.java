package com.method.hw1.run;

import com.method.hw1.controller.NonstaticSample;

public class Run {

	public static void main(String[] args) {

		NonstaticSample a = new NonstaticSample();

		a.printLottoNumbers();
		System.out.println();

		a.outputChar(5, 'a');
		System.out.println();

		char i = a.alphabette();
		System.out.println("3. 랜덤 영문자 출력: " + i);

		String result = a.mySubstring("apple", 2, 4);
		System.out.println(result);
		System.out.println();
		
	}

}
