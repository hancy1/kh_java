package com.method.hw3.controller;

public class StaticSample {

	private static String value;

	public static String getValue() {
		return value;
	}

	public static void setValue(String value) {
		StaticSample.value = value;
	}

	public static void toUpper() {

		char[] arr = new char[value.length()];

		for (int i = 0; i < value.length(); i++) {
			arr[i] = value.charAt(i);

		}
		System.out.print("대문자로: ");
		for (int i = 0; i < value.length(); i++) {
			System.out.print(value.valueOf(value.charAt(i)).toUpperCase());
		}

		System.out.println();
	}

	public static void setChar(int index, char c) {

		char[] arr = new char[value.length()];

		for (int i = 0; i < value.length(); i++) {
			arr[i] = value.charAt(i);
		}

		arr[index] = 'c';

		System.out.print("J --> C: ");
		for (int i = 0; i < value.length(); i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

	}

	public static int valueLength() {

		int num = value.length();

		return num;
	}

	public static String valueConcat(String str) {

		return value + str;

	}
}
