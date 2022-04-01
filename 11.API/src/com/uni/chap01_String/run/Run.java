package com.uni.chap01_String.run;

public class Run {

	public static void main(String[] args) {

		Run.method1();
		//new Run().method2();
	}

	private void method2() {
		String str = "abc";
		// charAt(해당 인덱스) : 문자 뽑아내기
		System.out.println(str.charAt(2));
		// concat : 문자열 합치기
		System.out.println(str.concat("def"));
		// contains : 문자열 안에 포함 여부 확인 -> 반환형 boolean
		System.out.println(str.contains("ab"));
		// equals : 문자열이 동일한지 확인 -> 반환형 boolean
		System.out.println(str.equals("abc"));
		// length() : 길이 확인 (믄지얄에 포함된 문자 개수)
		System.out.println(str.length());
		// split : 문자 구분 (특수문자를 기준으로 각각을 문자열 배열로 쪼개서 반환하는 메소드)
		String str1 = "a,bc,de";
		String[] strArr = str1.split(",");
		for (String arr : strArr) {
			System.out.println(arr);
		}
		
		String strCase1 = "Abc";
		String strCase2 = "aBC";
		
		//toUpperCase: 대문자로
	    //tolowerCase: 소문자로 
	    //equalsIgnoreCase : 대소문자 상관없이 문자열 비교 (boolean)
		System.out.println(strCase1.toUpperCase());
		System.out.println(strCase2.toLowerCase());
		System.out.println(strCase1.equalsIgnoreCase(strCase2));
		
		//trim : 문자열의 양쪽 공백을 제거
		String str2 = "        ab     c         ";
		System.out.println(str2);
		System.out.println(str2.trim());
	}

	private static void method1() {
		// 1. 문자열을 리터럴로 생성
		String str = "abc";

		String str1 = "abc";
		String str2 = "def";

		// 2. 문자열을 new 생성자로 생성 -> heap에 생성
		String str3 = new String("abc");
		String str4 = new String("abc");
		str4 = new String("abcd");

		// 출력
		System.out.println(str);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);

		// 주소값을 hash코드 찍기
		System.out.println(str.hashCode());
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());

		// 주소값 System.indentityHashCode로 찍기
		System.out.println(System.identityHashCode(str));
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));

		str3 += "z";
		System.out.println(System.identityHashCode(str3));
	}

}
