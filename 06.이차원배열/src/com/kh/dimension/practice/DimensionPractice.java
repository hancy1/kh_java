package com.kh.dimension.practice;

import java.util.Arrays;
import java.util.Scanner;

public class DimensionPractice {

	public void practice1() {

		// 4행 4열짜리 정수형 배열을 선언 및 할당하고
		// 1) 1 ~ 16까지 값을 차례대로 저장하세요.
		// 2) 저장된 값들을 차례대로 출력하세요.

		int[][] arr = new int[4][4];

		int num = 1;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = num++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%4d", arr[i][j]);
			}
			System.out.println();
		}
	}

	public void practice2() {

//		4행 4열짜리 정수형 배열을 선언 및 할당하고
//		1) 16 ~ 1과 같이 값을 거꾸로 저장하세요.
//		2) 저장된 값들을 차례대로 출력하세요.

		int[][] arr = new int[4][4];

		int num = 16;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = num--;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%4d", arr[i][j]);
			}
			System.out.println();
		}
	}

	public void practice3() {

		// 3행 3열짜리 문자열 배열을 선언 및 할당하고
		// 인덱스 0행 0열부터 2행 2열까지 차례대로 접근하여 “(0, 0)”과 같은 형식으로 저장 후 출력하세요

		int[][] arr = new int[3][3];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = i;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("(%d, %d)", arr[i][j], j);
			}
			System.out.println();
		}
	}

	public void practice4() { // 가이드 보기.....3.0 3.1 3.2 구하는 for문 만들기가 어려웠음

		// 4행 4열 2차원 배열을 생성하여 0행 0열부터 2행 2열까지는 1~10까지의 임의의 정수 값 저장 후
		// 아래의 내용처럼 처리하세요

		int[][] arr = new int[4][4];

		int arrilgth = arr.length - 1;

		for (int i = 0; i < arr.length - 1; i++) {
			int sum = 0;
			for (int j = 0; j < arr[i].length - 1; j++) {

				arr[i][j] = (int) (Math.random() * 10 + 1);
				sum += arr[i][j];
			}
			arr[i][arrilgth] = sum;
		}

		arr[3][0] = arr[0][0] + arr[1][0] + arr[2][0];
		arr[3][1] = arr[0][1] + arr[1][1] + arr[2][1];
		arr[3][2] = arr[0][2] + arr[1][2] + arr[2][2];
		arr[3][3] = arr[3][0] + arr[3][1] + arr[3][2] + arr[0][3] + arr[1][3] + arr[2][3];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();

		}
	}

//		int arrilgth = 0;
//
//		for (int i = 0; i < arr.length - 1; i++) {
//
//			int sum = 0;
//			int sum2 = 0;
//
//			arrilgth = arr[i].length - 1;
//
//			for (int j = 0; j < arr[i].length - 1; j++) {
//				arr[i][j] = (int) (Math.random() * 10 + 1);
//				sum += arr[i][j];
//				sum2 += arr[j][i];
//			}
//			arr[i][arrilgth] = sum;
//			arr[arrilgth][i] = sum2;
//		}
//
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				System.out.print(arr[i][j] + "\t");
//			}
//			System.out.println();
//
//		}
	// }

	public void practice5() {

		/*
		 * 2차원 배열의 행과 열의 크기를 사용자에게 직접 입력 받되, 1~10사이 숫자가 아니면 “반드시 1~10 사이의 정수를 입력해야 합니다.”
		 * 출력 후 다시 정수를 받게 하세요. 크기가 정해진 이차원 배열 안에는 영어 대문자가 랜덤으로 들어가게 한 뒤 출력하세요. (char형은
		 * 숫자를 더해서 문자를 표현할 수 있고 65는 A를 나타내고 90은 Z를 나타냄)
		 */

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("행 크기: ");
			int num1 = sc.nextInt();
			System.out.println("열 크기: ");
			int num2 = sc.nextInt();

			if (num1 > 10 || num1 < 1 && num2 > 10 || num2 < 1) {
				System.out.println("반드시 1~10사이의 정수를 입력해야 합니다.");
				continue;
			}

			char[][] arr = new char[num1][num2];

			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					arr[i][j] = (char) (Math.random() * 26 + 65);

				}
			}

			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					System.out.print(arr[i][j] + "\t");
				}
				System.out.println();

			}
			break;
		}
	}

	public void practice6() { // 열 먼저 출력할 때는 [j][i]

		String[][] strArr = new String[][] { { "이", "까", "왔", "앞", "힘" }, { "차", "지", "습", "으", "냅" },
				{ "원", "열", "니", "로", "시" }, { "배", "심", "다", "좀", "다" }, { "열", "히", "! ", "더", "!! " } };

		for (int i = 0; i < strArr.length; i++) {
			for (int j = 0; j < strArr[i].length; j++) {

				System.out.print(strArr[j][i]);

			}
		}

	}

	public void practice7() { // 문자를 담는 인덱스니까 char인덱스로 담기

		/*
		 * 사용자에게 행의 크기를 입력 받고 그 수만큼의 반복을 통해 각각 해당 행의 크기도 받아 문자형 가변 배열을 선언 및 할당하세요. 그리고 각
		 * 인덱스에 ‘a’부터 총 인덱스의 개수만큼 하나씩 늘려 저장하고 출력하세요.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("행 크기: ");
		int num = sc.nextInt();

		char[][] arr = new char[num][];

		for (int i = 0; i < num; i++) {
			System.out.println(i + "행의 크기: ");
			arr[i] = new char[sc.nextInt()];
		}

		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (char) ('a' + count++);

			}
			System.out.println();
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void practice8() {

		// 1차원 배열에 12명의 학생들을 출석부 순으로 초기화 하고
		// 3행 2열로 2차원 배열 2개를 이용하여 분단을 나눠서 저장.
		// 1분단 왼쪽부터 오른쪽, 1행에서 아래 행 순으로 자리를 배치하세요.

		Scanner sc = new Scanner(System.in);

		String[] temArr = { "강건강", "남나나", "도대담", "류라라", "문미미", "박보배", "송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하" };

		String[][] arr = new String[3][2];

		int index = 0;

		System.out.println("== 1분단 ==");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = temArr[index++];
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		int indexx = 6;
		System.out.println("== 2분단 ==");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = temArr[indexx++];
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void practice9() {

		// 위 문제에서 자리 배리 배치한 것을 가지고 학생 이름을 검색하여
		// 해당 학생이 어느 자리에 앉았는지 출력하세요

		Scanner sc = new Scanner(System.in);

		String[] temArr = { "강건강", "남나나", "도대담", "류라라", "문미미", "박보배", "송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하" };

		String[][] arr1 = new String[3][2];
		String[][] arr2 = new String[3][2]; // 이차원 배열을 두 개 만들어 구분

		int index = 0;

		System.out.println("== 1분단 ==");

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				arr1[i][j] = temArr[index++];
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("== 2분단 ==");

		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				arr2[i][j] = temArr[index++];
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}

//		int index = 0;
//		System.out.println("== 1분단 ==");
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				arr[i][j] = temArr[index++];
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}
//
//		int indexx = 6;
//		System.out.println("== 2분단 ==");
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				arr[i][j] = temArr[indexx++];
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}

		// ==========================================
		System.out.println("검색할 학생 이름을 입력하세요: ");
		String name = sc.nextLine();
		String lr = null;

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				if (name.equals(arr1[i][j])) {
					System.out.println("검색하신 " + name + " 학생은 1분단 " + (int) (i + 1) + "번째 줄 "
							+ (j == 0 ? lr = "왼쪽" : "오른쪽") + "에 있습니다");
				}
			}
		}
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				if (name.equals(arr2[i][j])) {
					System.out.println("검색하신 " + name + " 학생은 2분단 " + (int) (i + 1) + "번째 줄 "
							+ (j == 0 ? lr = "왼쪽" : "오른쪽") + "에 있습니다");
				}
			}
		}

	}
}
