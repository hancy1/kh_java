package com.kh.chap02.practice.example;

import java.util.Scanner;

public class LoopPractice {

	public void practice1() {

		// 사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
		// 단, 입력한 수는 1보다 크거나 같아야 합니다.
		// 만일 1 미만의 숫자가 입력됐다면 “잘못 입력하셨습니다.“를 출력하세요.

		Scanner sc = new Scanner(System.in);

		System.out.println("1 이상의 숫자를 입력하세요: ");

		int num = sc.nextInt();

		if (num >= 1) {

			for (int i = 1; i <= num; i++)

				System.out.print(i + " ");
		} else {

			System.out.println("잘못 입력했습니다.");

		}
	}

	public void practice2() {

		// practice1() 문제와 동일하나, 1 미만의 숫자가 입력됐다면
		// “잘못 입력하셨습니다. 다시 입력해주세요.”가 출력되면서 다시 사용자가 값을 입력하도록 하세요

		Scanner sc = new Scanner(System.in);

		for (;;) {
			System.out.println("1 이상의 숫자를 입력하세요: ");
			int num = sc.nextInt();

			if (num < 1) {
				System.out.println("잘못 입력했습니다. 다시 입력해주세요.");
				continue;
			}

			for (int i = num; i <= num; i++)
				System.out.print(i + " ");
		}

	}

	public void practice3() {

		// 사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
		// 단, 입력한 수는 1보다 크거나 같아야 합니다

		Scanner sc = new Scanner(System.in);

		System.out.println("1 이상의 숫자를 입력하세요: ");

		int num = sc.nextInt();

		if (num < 1) {
			System.out.println("잘못 입력하셨습니다.");
		}
		for (int i = num; i >= 1; i--) {
			System.out.print(i + " ");
		}

	}

	public void practice4() {

		// practice3() 문제와 동일하나, 1 미만의 숫자가 입력됐다면
		// “잘못 입력하셨습니다. 다시 입력해주세요.“가 출력되면서 다시 사용자가 값을 입력하도록 하세요.

		Scanner sc = new Scanner(System.in);

		for (;;) {
			System.out.println("1 이상의 숫자를 입력하세요: ");
			int num = sc.nextInt();

			if (num < 1) {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				continue;
			}
			for (int i = num; i >= 1; i--) {
				System.out.print(i + " ");
			}
			break;
		}
	}

	public void practice5() {

		// 1부터 사용자에게 입력 받은 수까지의 정수들의 합을 출력하세요.

		Scanner sc = new Scanner(System.in);

		System.out.println("정수를 하나 입력하세요: ");
		int num = sc.nextInt();
		int sum = 0;

		for (int i = 1; i <= num; i++) {

			sum += i;

			if (i == num) {
				System.out.println(i + " = " + sum);
			} else {
				System.out.print(i + " + ");
			}
		}
	}

	public void practice6() {
		// 사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
		// 만일 1 미만의 숫자가 입력됐다면 “1이상의 숫자만을 입력해주세요“를 출력하세요.

		Scanner sc = new Scanner(System.in);

		System.out.println("첫 번째 숫자: ");
		int num1 = sc.nextInt();

		System.out.println("두 번째 숫자: ");
		int num2 = sc.nextInt();

		if (num1 < 1 || num2 < 1) {
			System.out.println("1 이상의 숫자만을 입력해주세요.");
			return;
		}

		if (num1 > num2) {
			for (int i = num2; i <= num1; i++)
				System.out.print(i + " ");
		} else {
			for (int i = num1; i <= num2; i++) {
				System.out.print(i + " ");
			}
		}

	}

	public void practice7() {
		// 위 문제와 모든 것이 동일하나, 1 미만의 숫자가 입력됐다면
		// “1 이상의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.

		Scanner sc = new Scanner(System.in);

		for (;;) {

			System.out.println("첫 번째 숫자: ");
			int num1 = sc.nextInt();

			System.out.println("두 번째 숫자: ");
			int num2 = sc.nextInt();

			if (num1 < 1 || num2 < 1) {

				System.out.println("1 이상의 숫자만을 입력해주세요.");
				continue;
			}

			if (num1 > num2) {
				for (int i = num2; i <= num1; i++)
					System.out.print(i + " ");
				break;
			} else {
				for (int i = num1; i <= num2; i++) {
					System.out.print(i + " ");
					break;
				}
			}

		}

	}

	public void practice8() {
		// 사용자로부터 입력 받은 숫자의 단을 출력하세요.

		Scanner sc = new Scanner(System.in);

		int dan = sc.nextInt();
		System.out.println("숫자: " + dan);
		System.out.println("=== " + dan + "단 ===");

		for (int i = 1; i <= 9; i++) {

			System.out.println(dan + " * " + i + " = " + (dan * i));
		}

	}

	public void practice9() {
		// 사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요.
		// 단, 2~9 사이의 숫자가 아닌 경우 “2~9 사이의 숫자만 입력해주세요”를 출력하세요.

		Scanner sc = new Scanner(System.in);

		System.out.println("숫자 : ");
		int dan = sc.nextInt();

		if (dan < 2 || dan > 9) {
			System.out.println("2~9 사이의 숫자만 입력해주세요");
		} else {

			for (int i = 2; i <= 9; i++) {
				System.out.println("=== " + i + "단 ===");

				for (int su = 1; su <= 9; su++) {
					System.out.println(i + " * " + su + " = " + i * su);
				}
				if (i == dan) {
					break;
				}
			}

		}
	}

	public void practice10() {

		// Practice9() 문제와 동일하나, 2~9 사이의 숫자가 아닌 값이 입력됐다면
		// “2~9 사이의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요

		Scanner sc = new Scanner(System.in);

		for (;;) {

			System.out.println("숫자 : ");
			int dan = sc.nextInt();

			if (dan < 2 || dan > 9) {
				System.out.println("2~9 사이의 숫자만 입력해주세요");
				continue;
			}

			for (int i = 2; i <= 9; i++) {
				System.out.println("=== " + i + "단 ===");

				for (int su = 1; su <= 9; su++) {
					System.out.println(i + " * " + su + " = " + i * su);

				}
				if (i == dan) {
					break;
				}
			}
			break;
		}
	}

	public void practice11() {

//		사용자로부터 시작 숫자와 공차를 입력 받아
//		일정한 값으로 숫자가 커지거나 작아지는 프로그램을 구현하세요.
//		단, 출력되는 숫자는 총 10개입니다.
		Scanner sc = new Scanner(System.in);

		System.out.println("시작 숫자: ");
		int num1 = sc.nextInt();

		System.out.println("공차: ");
		int num2 = sc.nextInt();

		System.out.print(num1 + " "); // 첫 숫자랑 마지막 숫자 나오는 법을 몰라 직접 출력함

		for (int i = 0; i <= 8; i++) {
			System.out.print((num1 += num2) + " ");

			if (i == 9) {
				System.out.print(num1 + 9 * num2);

			}
		}

	}

	public void practice12() {

//		정수 두 개와 연산자(문자열로 입력 받고 입력된 연산자에 따라 알맞은 결과를 출력하세요.
//		단, 해당 프로그램은 연산자 입력에 “exit”라는 값이 들어올 때까지 무한 반복하며
//		exit가 들어오면 “프로그램을 종료합니다.”를 출력하고 종료합니다.
//		또한 연산자가 나누기이면서 두 번째 정수가 0으로 들어오면
//		“0으로 나눌 수 없습니다. 다시 입력해주세요.”를 출력하며,
//		없는 연산자가 들어올 시 “없는 연산자입니다. 다시 입력해주세요.”라고 출력하고
//		두 경우 모두 처음으로 돌아가 사용자가 다시 연산자부터 입력하도록 하세요.	

		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("연산자(+, -, *, /, %) :");
			String str = sc.nextLine();

			if (str.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}

			System.out.println("정수1: ");
			int num1 = sc.nextInt();

			System.out.println("정수2: ");
			int num2 = sc.nextInt();

			sc.nextLine();

			if (!str.equals("exit")) {

				if (str.equals("+")) {
					System.out.println(num1 + str + num2 + " = " + (num1 + num2));
				}

				if (str.equals("-")) {
					System.out.println(num1 + str + num2 + "=" + (num1 - num2));
				}

				if (str.equals("*")) {
					System.out.println(num1 + str + num2 + "=" + (num1 * num2));
				}

				if (str.equals("/") && num2 == 0) {
					System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
					continue;
				}

				if (str.equals("/")) {
					System.out.println(num1 + str + num2 + "=" + (num1 / num2));
				}

				if (str.equals("%")) {
					System.out.println(num1 + str + num2 + "=" + (num1 % num2));
				}

				if (!str.equals("+") && !str.equals("-") && !str.equals("*") && !str.equals("/") && !str.equals("%")) {
					System.out.println("없는 연산자입니다. 다시 입력해주세요.");
					continue;
				}

			}

		}
	}

	public void practice15() {

		// 사용자로부터 입력 받은 하나의 값이 소수인지 판별하는 프로그램을 구현하세요.
		// 단, 입력한 수가 2보다 작은 경우 “잘못 입력하셨습니다.”를 출력하세요.
		// * ‘소수’는 n을 1부터 n까지로 나누었을 때 나누어 떨어지는 수가 1과 n뿐인 수를 말한다.
		// ex) 2, 3, 5, 7, 11 …

		Scanner sc = new Scanner(System.in);

		System.out.println("숫자: ");
		int num = sc.nextInt();
		int count = 0;

		if (num < 2) {
			System.out.println("잘못 입력하였습니다.");
			return;
		}

		for (int i = 2; i <= num; i++) {
			if (num % i == 0) {
				count++;
				// num이 3이고 i가 2부터일 경우 count가 한 번 오름(3 % 2일 경우 count안 오름, 3%3 경우 count오름
				// num이 4이고 i가 2부터일 경우 count가 두 번 오름(4%2 일 때 한 번, 4%3일 때 안 오름, 4%4일 때 오름)
				// 따라서 소수만 count가 한 번 오르고 다른 수는 약수만큼 count가 오른다.
			}
		}
		if (count == 1) {
			System.out.println("소수입니다.");
			count = 0;
		} else {
			System.out.println("소수가 아닙니다.");
			count = 0;
		}

	}

	public void practice16() {
		// 위 문제와 모든 것이 동일하나, 입력한 수가 2보다 작은 경우
		// “잘못 입력하셨습니다.”를 출력하면서 다시 사용자가 값을 입력하도록 하세요

		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("숫자: ");
			int num = sc.nextInt();
			int count = 0;

			if (num < 2) {
				System.out.println("잘못 입력하였습니다.");
				continue;
			}

			for (int i = 2; i <= num; i++) {
				if (num % i == 0) {
					count++;
				}
			}
			if (count == 1) {
				System.out.println("소수입니다.");
				count = 0;
				break;
			} else {
				System.out.println("소수가 아닙니다.");
				count = 0;
				break;
			}

		}
	}

//	public void practice17() {
//		// 2부터 사용자가 입력한 수까지의 소수를 모두 출력하고 소수의 개수를 출력하세요.
//		// 단, 입력한 수가 2보다 작은 경우 “잘못 입력하셨습니다.”를 출력하세요
//
//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("숫자: ");
//		int num = sc.nextInt();
//		int count = 0;
//
//		if (num < 2) {
//			System.out.println("잘못 입력하였습니다.");
//			return;
//		}
//
//		for (int i = 2; i <= num; i++) {
//			if (num % i == 0) {
//				count++;
//			}
//
//			if (count == 1) {
//				System.out.println(i + " ");
//				System.out.println(2 + "부터 " + num + "까지의 소수의 개수는 " + "" + "개 입니다.");
//			}
//		}
//
//	}	

	public void practice18() {

//		1부터 사용자에게 입력 받은 수까지 중에서
//		1) 2와 3의 배수를 모두 출력하고
//		2) 2와 3의 공배수의 개수를 출력하세요.
//		(for문 이용)
//		* ‘공배수’는 둘 이상의 수의 공통인 배수라는 뜻으로 어떤 수를 해당 수들로 나눴을 때
//		모두 나머지가 0이 나오는 수

		Scanner sc = new Scanner(System.in);

		System.out.println("자연수를 하나 입력하세요. : ");
		int num = sc.nextInt();
		int c = 0;

		for (int i = 1; i <= num; i++) {
			if (i % 2 == 0 || i % 3 == 0) {
				System.out.print(i + " ");
			}
			if (i % 2 == 0 && i % 3 == 0) {
				c++;
			}
		}
		System.out.println();
		System.out.println("count: " + c);
	}

	public void practice19() {

		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력: ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			for (int j = num; j > 0; j--) {
				if (j > i) {
					System.out.print(' ');
				} else {
					System.out.print('*');
				}
			}
			System.out.println();
		}
	}

	public void practice20() {

		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력: ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}

		for (int a = 1; a <= num; a++) {
			for (int b = num; b > 0; b--) {
				if (b > a) {
					System.out.print("*");
				} else {
					System.out.print(" ");
					System.out.println();
				}

			}
		}
	}

	public void practice21() {

		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력: ");
		int num = sc.nextInt();

		for (int line = 0; line < num; line++) {
			for (int star = 0; star <= num - line; star++) {
				System.out.print(" ");
			}
			for (int star = 0; star < 2 * line + 1; star++) {
				System.out.print('*');
			}
			System.out.println();
		}
		System.out.println();
	}

	public void practice22() {

		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력: ");
		int num = sc.nextInt();

		for (int line = 1; line <= num; line++) {
			for (int star = 1; star <= num; star++) {
				if (line == 1 || line == num) {
					System.out.print("*");
					// System.out.print("//");
				} else if (star == 1 || star == num) {
					System.out.print("*");
					// System.out.print("==");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

//	public void practice23() {
//
//		for (int line = 0; line < 5; line++) {
//			for (int blank = 1; blank < 5 - line; blank++) {
//				System.out.print(" ");
//			}
//			for (int num = 1; num <= 2 * line + 1; num++) {
//				System.out.print(num);
//			}
//			System.out.println();
//		}
//
//	}
}