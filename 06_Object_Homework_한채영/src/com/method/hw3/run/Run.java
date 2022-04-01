package com.method.hw3.run;

import com.method.hw3.controller.StaticSample;

public class Run {

	public static void main(String[] args) {

		
		StaticSample.setValue("Java");
		
		System.out.println("value: " + StaticSample.getValue());

		StaticSample.toUpper();

		System.out.println("길이: " + (int) (StaticSample.valueLength()));

		System.out.println(StaticSample.valueConcat("PROGRAMMING"));

		StaticSample.setChar(0, 'c');

	}

}
