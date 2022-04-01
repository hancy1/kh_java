package com.uni.varaible;

import java.util.Scanner;

public class F_KeyboardInput {

	public void inputScanner1() {

		Scanner sc = new Scanner(System.in); // 입력받은 값을 바이트단위로 받아드리겠다는 뜻
		// 생성자(system.in)을 적지 않으면 기본생성자를 호출한 것

		System.out.println("당신의 이름은 무엇입니까?");

		// 사용자가 입력한 값을 문자열로 받아오는 메소드(next(), nextLine())이 있음
		// String name = sc.next(); //공백있는 경우 공배 전까지 읽어옴
		String name = sc.nextLine(); // 사용자가 입력한 값 모두 읽어옴

		System.out.println("당신의 나이는 몇 살입니까?");

		int age = sc.nextInt(); // 사용자가 입력한 정수에 대한 값만 읽어옴

		System.out.println("당신의 키는 몇입니까?");

		double height = sc.nextDouble(); // 사용자가 입력한 실수에 대한 값만 읽어옴

		System.out.println(name + " 님은 " + age + "세이며, 키는 " + height + "cm입니다.");

		// System.out.println(name + "님");

	}

	public void inputScanner2() {

		/*
		 * sc.nextLine() : 버퍼에서 '엔터' 이전까지의 모든 값을 가져온 후 '엔터'를 비워주는 역할 그 외의 메소드 : 버퍼에서
		 * '엔터' 이전까지의 값을 가져온 후 '엔터'를 비워주지 않음
		 * 
		 * 따라서 sc.nextInt() 후 sc.nextLine()이 오게 되면 버퍼에 남아있는 '엔터'를 sc.nextLine()이 인식하여
		 * 사용자가 값을 입력했다고 생각한 후 읽어오고 넘어가버림
		 * 
		 * (실행 한 후 sc.nextLine() 적어주기) sc.nextLine() 메소드를 제외한 다른 메소드들 (sc.next() 또는
		 * sc.nextXXX())은 해당 값만 읽어온 채 사용자가 입력한 '엔터'는 버퍼에 남아있게된다.
		 * 
		 * 하지만 sc.nextLine() 메소드는 사용자가 입력한 한 줄에 대한 정보 모두 즉, 엔터까지 모둘 읽어온다. 다시 말하면 나이를 입력할
		 * 때 sc.nextInt() 할 때 데이터를 입력하고 엔터를 쳤을 때 값만 age에는 정수 값만 저장되고 '엔터'는 버퍼에 남아있는
		 * 상태이다.
		 * 
		 * 따라서 주소 값일 입력받을 때 사용되는 sc.nextLine() 메소드가 버퍼에 남아있는 '엔터'를 자동으로 읽어와서 입력이 끝났다고
		 * 생각하는 것 --> address 라는 문자열에는 빈값이 들어감
		 * 
		 * 결론 : sc.nextXXX() 메소드 뒤에 sc.nextLine() 메소드를 사용하게 된다면 버퍼에 남아있는 '엔터'를 빼주기 위해
		 * sc.nextLine() 메소드를 한 번 더 써주자
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("당신의 이름은 무엇입니까?");
		String name = sc.nextLine();

		System.out.println("당신의 나이는 몇 살입니까?");
		int age = sc.nextInt();

		sc.nextLine(); // sc.nextLine()이 엔터까지 끌어오기 때문에 띄어쓰기를 가져갈 것이 필요
						// 따라서 sc.nextLine()전에 공백가져가는 용으로 한 번 더 쓰기
		System.out.println("당신의 주소는 무엇입니까?");
		String address = sc.nextLine();

		System.out.println("당신의 키는 몇입니까?");
		double height = sc.nextDouble();

		// System.out.println(name + " 님은 " + age + "세이며, 사는 곳은 " +address+ "이고, 키는 " +
		// height + "cm입니다.");

		// System.out.printf("%s",name + "님은 " + "%d",age + " 세이며, 사는 곳은 " +"%s",address
		// + "이고, 키는 " + "%.2f",height + "cm입니다.");

		System.out.printf("%s 님은 %d 세이며, 사는 곳은 %s이고, 키는 %.2f cm입니다", name, age, address, height);
	}

	public void inputScanner3() {

		Scanner sc = new Scanner(System.in);

		System.out.println("이름 : ");
		String name = sc.nextLine();

		// 문자열 입력받을 때: sc.nextLine();
		// 정수형 입력받을 때: sc.nextInt();
		// 실수형 입력받을 때: sc.nextDouble();

		// sc.nextChar() -> 존재x . CharAt: 문자열에서 지정된 위치에 있는 문자 하나만 뽑아내는 기능을 하는 메소드
		// 이때 위치는 제일 앞문자가 0부터 시작해서 1씩 증가

		System.out.println("성별(M/F)");
		char gender = sc.nextLine().charAt(0);

		System.out.println("나이 : ");
		int age = sc.nextInt();

		System.out.println(name + "님의 개인정보");
		System.out.printf("성별 : " + "%S\n", gender);
		System.out.println("나이 : " + age);

		/*
		 * ** 정리 **
		 * 
		 * 1. 콘솔창에(모니터로) 출력하기위해 : System.out.println() 메소드 이용 2. 콘솔창에(키보드로) 입력받기위해 :
		 * Scanner sc = new Scanner(System.in); sc.nextLine(), sc.next(), sc.nextInt(),
		 * sc.nextDouble() ....
		 * 
		 * 이 때, sc.next() 또는 sc.nextXXX() 메소드 뒤에 sc.nextLine() 메소드가 와야되는 경우
		 * sc.nextLine() 메소드를 한 번 더 써줘서 버퍼에 남은 '엔터'를 빼주는 과정 필수!
		 * 
		 * 그리고 '문자' 값을 입력 받기 위해서는 sc.nextLine() 메소드를 통해 문자열을 먼저 받아주고 그 뒤에 .charAt(0)
		 * 메소드를 통해 문자로 변환해주는 작업 진행해야된다.
		 * 
		 */

	}
}
