package com.method.hw2.run;

import com.method.hw2.controller.NonStaticSample;

public class Run {

	public static void main(String[] args) {

		NonStaticSample a = new NonStaticSample();

		System.out.print("크기가 5인 배열의 랜덤값 : ");
		int[] arr = a.intArrayAllocation(5); // 배열값을 받아서 출력할 때
		a.display(arr);

		System.out.println();

		System.out.print("내림차순 출력: ");
		a.sortDescending(arr);
		System.out.println();

		System.out.print("오름차순 출력: ");
		a.sortAscending(arr);

		
		System.out.println();
		System.out.println("apple 문자열에 p의 개수: " + a.countChar("apple", 'p'));
		
		
		System.out.println("13과 7사이의 정수들의 합계: " + a.totalValue(13, 7));
		
		
		System.out.println("programming문자열의 3번 인덱스 문자 : " + a.pCharAt("programming", 3));
		
		
		System.out.println("JAVA와 programming을 합친 문자열: " + a.pConcat("JAVA", "programming"));
		
		
	}
	

}
