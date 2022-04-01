package com.uni.varaible;

public class selfpractice {

	public static void main(String[] args) {

		double h = 173.5;
		int age = 28;
		String name = "한채영";
		String s = "안녕하세요. 제 이름은 " + name+ "입니다.";
		char bloodtype = 'A';
	
		System.out.println(s + "\n저는 " + age + "살이고 키는 " + h + "cm입니다." + "\n혈액형은 " + bloodtype + "형입니다.");
		
		final int AGE = 29;
		
		System.out.println("내년에는 " + AGE + "살입니다.");
		
		//==========================================================
		
		byte b = 1;
		int i = 15;
		
		byte result1 = (byte) (b * i);
		//int result2 = b * i;

		System.out.println(result1);
		//System.out.println(result2);
		
		int ii = 1;
		double dd = 3.14;
		
		int result11 = (int) (ii * dd);
		// int result111 = (int)(ii) * dd;
		double result22 = (double) (ii * dd);
		double result222 = (double)(ii) * dd;
		double result2222 = ii * dd;
		
		System.out.println(result11);
		System.out.println(result22);
		System.out.println(result2222);

		//==========================================================


		String ss = "어서오세요.";
		double ddd = 3.14;
		char cc = 'a';
		int iii = 11;
		
		System.out.printf("포맷연습:" + "%d\n", iii);
		System.out.printf("%d\n%d\n", iii,iii);
		System.out.printf("%-5s\t\t%s", ss, ss);
		
	}
}
