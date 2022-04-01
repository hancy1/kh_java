package com.uni.dimension;

import java.text.DecimalFormat;
import java.util.Scanner;

public class DArray {

	public void method1() {

		// 이차원 배열 : 일차원 배열 여러개를 하나로 묶은 것
		/*
		 * 1. 이차원 배열 선언 자료형 배열명[][]; 자료형[] 배열명[]; 자료형[][] 배열명;
		 */

		int arr1[][];
		int arr2[];
		int[][] arr;

		/*
		 * 2. 이차원 배열 할당 배열명 = new 자료형 [행크기][열크기];
		 */

		arr = new int[3][5]; // 할당하게 되면 heap영역에 해당 크기만큼 공간이 할당

		// 행의 길이를 구할 때
		System.out.println("행의 길이: " + arr.length);

		// 각 행별 열의 길이를 구할 때
		System.out.println("0열의 길이: " + arr[0].length);
		System.out.println("1열의 길이: " + arr[1].length);
		System.out.println("2열의 길이: " + arr[2].length);

		// *****
		// *****
		// *****

		int star[][] = new int[3][5];

		for (int i = 0; i < star.length; i++) { // 바깥쪽 for문->행의 개수만큼 반복
			for (int j = 0; j < star[i].length; j++) { // 안쪽 for문->열의 개수만큼 반복
				System.out.print('*');
			}
			System.out.println();
		}
		for (int i = 0; i < arr.length/* 행의 길이 */; i++) {
			for (int j = 0; j < arr[i].length/* 열의 길이 */; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

	public void method2() {
		int[][] arr = new int[3][5];

		// 1 2 3 4 5
		// 6 7 8 9 10
		// 11 12 13 14 15

		// 값을 기록
		// 1. 인덱스에 접근해서 값 기록
		/*
		 * arr[0][0] = 1 arr[0][1] = 2 arr[0][2] = 3 arr[0][3] = 4 arr[0][4] = 5
		 * 
		 * arr[1][0] = 6 arr[1][1] = 7 arr[1][2] = 8 arr[1][3] = 9 arr[1][4] = 10
		 * 
		 * arr[2][0] = 11 arr[2][1] = 12 arr[2][2] = 13 arr[2][3] = 14 arr[2][4] = 15
		 */

		// 2. 중첩for문 이용해서 값기록
		int value = 1;
		for (int i = 0; i < arr.length; i++) { // 행 정해주는 for문
			for (int j = 0; j < arr[i].length; j++) { // 열 정해주는 for문

				arr[i][j] = value++;
			}
		}
		// 3. 출력
		for (int i = 0; i < arr.length; i++) { // 행 정해주는 for문
			for (int j = 0; j < arr[i].length; j++) { // 열 정해주는 for문
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}
	}

	public void method3() {

		// 이차원배열의 할당과 초기화를 동시에

		// 1 2 3 4 5
		// 6 7 8 9 10
		// 11 12 13 14 15

		int[][] arr = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 } };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void method4() {

		// 가변 배열
		// 행은 정해졌으나 각 행에 대한 열의 갯수가 정해지지 않은 상태
		// 자료형이 같은 1차원 배열 여러 개를 하나로 묶은 게 --> 2차원 배열
		// 묶여있는 1차원 배열의 길이가 꼭 같을 필요는 없다.

		int[][] arr = new int[3][]; // 가변배열 할당한 상태(행 크기는 3)

		// 각 행에 또다른 배열을 참조할 수 있도록 할당
		arr[0] = new int[2]; // 0행2열
		arr[1] = new int[1]; // 1행1열
		arr[2] = new int[3]; // 2행3열

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println();

		// 1. 인덱스 접근

//		arr[0][0] = 0;
//		arr[0][1] = 1;
//		arr[1][0] = 2;
//		arr[2][0] = 3;
//		arr[2][1] = 4;
//		arr[2][2] = 5;		

		// 2. 반복문 통해서
		int value = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = value++;
			}
		}
		// 3. 출력

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void method5() {

		// 가변배열의 할당과 초기화 동시에

		int[][] arr = { { 1, 2 }, { 3 }, { 4, 5, 6 } };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public void method6() {

		// scanner 이용해서 국어점수와 영어점수를 3번 찍어서 각각의 평균을 구하시오

		Scanner sc = new Scanner(System.in);

		double[][] arr = new double[2][4];

		int arrilgth = 0;

		for (int i = 0; i < arr.length; i++) {
			double sum = 0; // 이곳에서 초기화해야 국어점수만 담긴 후 영어점수가 따로 담김

			arrilgth = arr[i].length - 1;

			for (int j = 0; j < arr[i].length - 1; j++) {
				if (i == 0) {
					System.out.println("국어점수를 입력하세요 :");
				} else {
					System.out.println("영어점수를 입력하세요 :");
				}
				arr[i][j] = sc.nextDouble();
				sum += arr[i][j];
			}

			arr[i][arrilgth] = sum;
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

		System.out.println("국어점수 평균: " + arr[0][arrilgth] / arrilgth);
		System.out.println("영어점수 평균: " + arr[1][arrilgth] / arrilgth);

		DecimalFormat f1 = new DecimalFormat("0.00");

		System.out.println("영어점수 평균: " + f1.format(arr[1][arrilgth] / arrilgth));
	}

	public void method7() {

		// 1부터 100까지의 랜덤값을 3행3열에 넣기
		// 중복제거

		// 1. 일차원 배열을 이용해서 먼저 중복제거 후 셋팅

		int[] arr = new int[9];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100 + 1);

			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();

		// 2. 3행 3열에 담아보자

		int[][] newArr = new int[3][3];

		int index = 0;

		for (int i = 0; i < newArr.length; i++) {
			for (int j = 0; j < newArr[i].length; j++) {

				newArr[i][j] = arr[index++];
			}
		}
		for (int i = 0; i < newArr.length; i++) {
			for (int j = 0; j < newArr[i].length; j++) {

				System.out.print(newArr[i][j] + " ");
			}
			System.out.println();
		}

	}

	public void bingo() {

		Scanner sc = new Scanner(System.in);
		// 1차원 배열로 중복제거한 25개 값 구해놓고 이차원배열에 대입

		// 중복값 제거하면서 랜덤값 넣기
		int[] temArr = new int[25];
		for (int i = 0; i < temArr.length; i++) {
			temArr[i] = (int) (Math.random() * 25 + 1);

			for (int j = 0; j < i; j++) {
				if (temArr[i] == temArr[j]) {
					i--;
					break;
				}
			}
		}
		// 이차원 배열로 담기
		int[][] arr = new int[5][5];

		int index = 0;

		for (int i = 0; i < 5/* arr.length */; i++) {
			for (int j = 0; j < 5/* arr[i].length */; j++) {
				arr[i][j] = temArr[index++];
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				System.out.printf("%4d", arr[i][j]);
			}
			System.out.println();
		}

		int count = 0;
		System.out.println("==========빙고 게임 시작==========");

		while (true) {
			System.out.println("정수를 입력하세요: ");
			int num = sc.nextInt();
			sc.nextLine();
			
			count++;

			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 5; j++) {
					if (arr[i][j] == num) {
						arr[i][j] = 0;
					}
					System.out.printf("%4d", arr[i][j]);
				}
				System.out.println();
			}
			System.out.print("게임을 끝내시겠습니까?(Y/N) : ");
			char ch = sc.nextLine().toUpperCase().charAt(0); // 무조건 대문자로 나오는 메소드
			if(ch == 'Y') {
				break;
			}		
		}
		System.out.println(count + "번 입력하였습니다.");
	}
}