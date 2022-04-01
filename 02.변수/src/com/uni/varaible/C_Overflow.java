package com.uni.varaible;

public class C_Overflow {

	public void printVariableSize() {
		System.out.println("byte크기 : " + Byte.BYTES + "byte");
		System.out.println("short의 크기  : "+ Short.BYTES + "byte");
		System.out.println("int의 크기  : "+ Integer.BYTES + "byte");
		System.out.println("long의 크기  : "+ Long.BYTES + "byte");
		System.out.println("float의 크기  : "+ Float.BYTES + "byte");
		System.out.println("double의 크기  : "+ Double.BYTES + "byte");
		System.out.println("char의 크기  : "+ Character.BYTES + "byte");

	}
	
	public void overflow() {
		byte bNum = 127; // byte 최대값
		System.out.println(bNum);
		
		byte result = (byte) (bNum + 3); // byte -127 + 3 = -128 -127 -126
		System.out.println("result값 " +result);
		
		int num1 = 1000000;
		int num2 = 700000;
		
		int result2 = num1 * num2;
		System.out.println("result2 " +result2);
		
		long result3 = num1 * (long)(num2);  //둘 중 하나를 먼저 강제 형변환 후 곱하기
		System.out.println("result3 "+result3);
		
		long result33 = (long) (num1 * num2); //이미 곱셈자체에서 결과가  int형으로 되기 때문에 오버플로우발생
		System.out.println("result33 "+ result33);
	}

}
