package mvc.view;

import java.util.Scanner;

import mvc.controller.MemberController;

public class Memberview {

	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();

	public Memberview() {

	}

	public void mainMenu() {
		System.out.println("아이디를 입력하세요: ");
		String id = sc.nextLine();
		System.out.println("비밀번호를 입력하세요: ");
		String pwd = sc.nextLine();

		mc.login(id, pwd); // 값을 컨트롤의 로그인메소드에 입력

		int result = mc.login(id, pwd);

		if (result == 1) {
			while (true) {
				System.out.println("=== 회원 프로그램 ===");
				System.out.println("1. 내 정보 보기");
				System.out.println("2. 내 나이 조회하기");
				System.out.println("3. 키 수정하기");
				System.out.println("9. 프로그램 종료하기");
				System.out.println("메뉴 번호 선택: ");

				int num = sc.nextInt();

				switch (num) {

				case 1:
					System.out.println(mc.readInfo());
					break;

				case 2:
					System.out.println(mc.readAge());
					break;

				case 3:
					updateHeight();
					break;

				case 9:
					System.out.println("프로그램을 종료합니다.");
					return;

				default:
					System.out.println("잘못 입력했습니다. 다시 입력하세요.");
					break;
				}

			}

		} else {
			System.out.println("아이디 혹은 비밀번호가 틀립니다.");
			return;
		}

	}

	public void updateHeight() {

		System.out.println("수정할 키를 입력하시오: ");

		double newheight = sc.nextDouble();

		mc.updateHeight(newheight);

	}
}
