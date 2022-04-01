package com.uni.array;

import java.util.Arrays;

public class B_Arraycopy {

	/*
	 * 배열의 복사 -얕은복사 : 배열의 주소만을 복사 -깊은복사 : 동일한 배열을 하나더 생성해서 실제 내부값들을 복사
	 */

	public void method1() {
		int[] origin = { 1, 2, 3, 4, 5 };

		// 원본배열 출력
		for (int i = 0; i < origin.length; i++) {
			System.out.println("origin[" + i + "]의 값: " + origin[i]);
		}

		// 얕은 복사
		int[] copy = origin;
		System.out.println("복사본 배열 출력");
		for (int i = 0; i < copy.length; i++) {
			System.out.println("copy[" + i + "]의 값: " + copy[i]);
		}

		// 복사한 copy 2번 인덱스를 99로 변경
		copy[2] = 99; // 1,2,99,4,5

		// 원본배열 출력
		for (int i = 0; i < origin.length; i++) {
			System.out.println("origin[" + i + "]의 값: " + origin[i]);
		}
		System.out.println("복사본 배열 출력");
		for (int i = 0; i < copy.length; i++) {
			System.out.println("copy[" + i + "]의 값: " + copy[i]);
		}
		// 둘은 같은 주소값을 지니기 때문에 copy의 인덱스값을 수정해도 origin의 값이 변경
		System.out.println("origin 주소값" + origin.hashCode());
		System.out.println("copy 주소값" + copy.hashCode());
	}

	public void method2() {
		// 깊은 복사
		// 1. for문 - 새로운 배열을 생성해서 반복문 통해 실제값을 넣어주는 방법

		// 인덱스 : 0,1,2,3,4
		int[] origin = { 1, 2, 3, 4, 5 };

		int[] copy = new int[5]; // 크기가 5인 빈 배열을 만듦, 현재 다 0으로 초기화되어있음

		for (int i = 0; i < origin.length; i++) {
			copy[i] = origin[i];
		}

		System.out.println("복사본 배열 출력");
		for (int i = 0; i < copy.length; i++) {
			System.out.println("copy[" + i + "]의 값: " + copy[i]);
		}

		// 복사한 copy 2번 인덱스를 99로 변경
		copy[2] = 99; // 1,2,99,4,5

		// 원본배열 출력
		for (int i = 0; i < origin.length; i++) {
			System.out.println("origin[" + i + "]의 값: " + origin[i]);
		}
		System.out.println("복사본 배열 출력");
		for (int i = 0; i < copy.length; i++) {
			System.out.println("copy[" + i + "]의 값: " + copy[i]);
		}
		// 둘은 같은 주소값을 지니기 때문에 copy의 인덱스값을 수정해도 origin의 값이 변경
		System.out.println("origin 주소값" + origin.hashCode());
		System.out.println("copy 주소값" + copy.hashCode());

	}

	public void method3() {
		// 2. 새로운 배열을 생성하고 System클래스의 arryacopy() 메소드를 이용한 복사

		int[] origin = { 1, 2, 3, 4, 5 };

		int[] copy = new int[10];

		// System.arraycopy(원본배열명, 복사시작할 인덱스, 복사본 배열명, 복사본 배열의 복사될 시작위치, 복사길이)
		System.arraycopy(origin, 0, copy, 2, origin.length);

		System.out.println("복사본 배열 출력");
		for (int i = 0; i < copy.length; i++) {
			System.out.println("copy[" + i + "]의 값: " + copy[i]);
		}
		// 둘은 같은 주소값을 지니기 때문에 copy의 인덱스값을 수정해도 origin의 값이 변경

		System.out.println("origin 길이" + origin.length);
		System.out.println("copy 길이" + copy.length);

		System.out.println("origin 주소값" + origin.hashCode());
		System.out.println("copy 주소값" + copy.hashCode());

	}

	public void method4() {
		// 3. Arrays 클래스에서 제공하는 copyOf() 메소드를 사용

		int[] origin = { 1, 2, 3, 4, 5 };

		// Arrays.copyOf(원본배열명, 복사할 길이(원본보다 길어도 됨: 길면 자동으로 0으로 초기화))
		// 내가 지정한 길이만큼 무조건 할당
		int[] copy = Arrays.copyOf(origin, 8);

		System.out.println("복사본 배열 출력");
		for (int i = 0; i < copy.length; i++) {
			System.out.println("copy[" + i + "]의 값: " + copy[i]);
		}

		System.out.println("origin 길이" + origin.length);
		System.out.println("copy 길이" + copy.length);

		System.out.println("origin 주소값" + origin.hashCode());
		System.out.println("copy 주소값" + copy.hashCode());

		/*
		 * System.arraycopy() 메소드는 내가 복사 하고자할때 인덱스와 갯수를 지정하고 싶을때 사용, 복사본 배열의 크기가 그대로 유지
		 * copy = Arrays.copyOf() 메소드는 내가 복사하고자 하는 것을 복사 하고 크기도 다시 지정 하고 싶을때 사용
		 * 
		 */

	}
	
	public void method5() {
		//4. clone() 메소드를 이용한 복사
		//   시작인덱스 지정 안 됨, 원본배열을 통째로 복사해서 새로운 배열 할당
		
		int[] origin = { 1, 2, 3, 4, 5 };
		int[] copy = origin.clone();
		
		copy[2] = 99;
		
		System.out.println("복사본 배열 출력");
		for (int i = 0; i < copy.length; i++) {
			System.out.println("copy[" + i + "]의 값: " + copy[i]);
		}

		System.out.println("origin 길이" + origin.length);
		System.out.println("copy 길이" + copy.length);

		System.out.println("origin 주소값" + origin.hashCode());
		System.out.println("copy 주소값" + copy.hashCode());

		
		
		
		
		
	}
}
