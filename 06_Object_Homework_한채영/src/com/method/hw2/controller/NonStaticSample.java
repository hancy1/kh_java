package com.method.hw2.controller;

public class NonStaticSample {

	public int[] intArrayAllocation(int length) {

		int[] arr = new int[length];

		for (int i = 0; i < arr.length; i++) {

			arr[i] = (int) (Math.random() * 100 + 1);
		}

		return arr;
	}

	public void display(int[] arr) {

		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i] + " ");
		}

	}

	public void swap(int[] arr, int idx1, int idx2) {

		int tmp = 0;
		tmp = idx1;
		idx1 = idx2;
		idx2 = tmp;

	}

	public void sortDescending(int[] arr) {
		// 위의 swap 메소드를 이용하여 전달받은 배열을 내림차순 적용
		// 위의 display 메소드를 이용하여 출력
		for (int i = 0; i < arr.length; i++) {
			// int num = i;
			for (int j = 0; j < i; j++) {
				if (arr[i] > arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;

				}
				swap(arr, i, j); //적용이 안 되는 듯..
			}
		}
		display(arr);
		
	}

	public void sortAscending(int[] arr) {
		// 위의 swap 메소드를 이용하여 전달받은 배열을 오름차순 적용
		// 위의 display 메소드를 이용하여 출력

		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[i] < arr[j]) {
					int num = arr[i];
					arr[i] = arr[j];
					arr[j] = num;

					swap(arr, i, num);
				}

			}

		}
		display(arr);
		
	}

	public int countChar(String str, char c) {
		// 문자열과 문자 하나를 전달받아 문자열에 포함된 문자의 갯수 리턴

		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == c) {
				count++;
			}
		}
		return count;
	}

	public int totalValue(int num1, int num2) {
		// 정수 두 개를 전달받아 두 수 중 작은 값에서 큰 값 사이의 정수들의 합계를 리턴
		// (단, 전달받은 두 정수는 포함되지 않아야된다.)

		int sum = 0;
		if (num1 > num2) {
			for (int i = num2+1; i < num1; i++) {
				sum += i;
			}

		} else if (num1 < num2) {
			for(int i = num1+1; i < num2; i++) {
				sum += i;
			}
		}
		return sum;
	}
	
	public char pCharAt(String str, int index) {
		// 전달받은 문자열의 인덱스를 통해 해당 인덱스의 문자 리턴
		return str.charAt(index);
		
		}
	
		public String pConcat(String str1, String str2) {
		// 두 개의 문자열을 전달 받아 하나의 문자열로 합쳐서 리턴
			return str1 + str2;
		}

}
