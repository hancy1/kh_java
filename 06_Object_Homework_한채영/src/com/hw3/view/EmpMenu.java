package com.hw3.view;

import java.util.Scanner;

import com.hw3.model.vo.Employee;

public class EmpMenu {

	Scanner sc = new Scanner(System.in);

	public void mainMenu() {

		Employee emp = null;

		while (true) {

			System.out.println("===== 사원 정보 관리 프로그램 =====");

			System.out.println("1. 새 사원 정보 입력");
			System.out.println("2. 사원 정보 수정");
			System.out.println("3. 사원 정보 삭제");
			System.out.println("4. 사원 정보 출력");
			System.out.println("9. 프로그램 종료");

			System.out.println("메뉴 번호 선택: ");

			switch (sc.nextInt()) {

			case 1:
				emp = inputEmployee();
				break;

			case 2:
				modifyEmployee(emp);
				break;

			case 3:
				emp = null;
				break;

			case 4:
				System.out.println(emp.information());
				break;

			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못 입력했습니다. 다시 입력해주세요.");
			}
		}

	}

	public Employee inputEmployee() {

		sc.nextLine();
		System.out.println("사원명: ");
		String empName = sc.nextLine();

		System.out.println("부서명: ");
		String dept = sc.nextLine();

		// sc.nextLine();
		System.out.println("직급: ");
		String job = sc.nextLine();

		System.out.println("나이: ");
		int age = sc.nextInt();

		sc.nextLine();
		System.out.println("성별: ");
		char gender = sc.nextLine().charAt(0);

		System.out.println("급여: ");
		int salary = sc.nextInt();

		System.out.println("보너스포인트: ");
		double bonuspoint = sc.nextDouble();

		sc.nextLine();
		System.out.println("전화번호: ");
		String phone = sc.nextLine();

		System.out.println("주소: ");
		String address = sc.nextLine();

		return new Employee(empName, dept, job, age, gender, salary, bonuspoint, phone, address);

	}

	public void modifyEmployee(Employee emp) {

		while (true) {
			System.out.println("===== 사원 정보 수정 =====");
			System.out.println("1. 이름 변경");
			System.out.println("2. 급여 변경");
			System.out.println("3. 부서 변경");
			System.out.println("4. 직급 변경");
			System.out.println("9. 이전 메뉴로");

			int menu = sc.nextInt();
			sc.nextLine(); // 안 쓰면 인풋미스테이크 오류뜨는데 쓰면 몇 번 띄어쓰기됨 ... -> int menu = sc.nextInt(); 하고 switch에서
							// menu로 받으니 해결

			switch (menu) {

			case 1:
				System.out.println("이름: ");
				String empName2 = sc.nextLine();
				emp.setEmpName(empName2);
				break;

			case 2:
				System.out.println("급여: ");
				int salary2 = sc.nextInt();
				emp.setSalary(salary2);
				sc.nextLine();
				break;

			case 3:
				System.out.println("부서: ");
				String dept2 = sc.nextLine();
				emp.setDept(dept2);
				break;

			case 4:
				System.out.println("직급: ");
				String job2 = sc.nextLine();
				emp.setJob(job2);
				break;

			case 9:
				System.out.println("이전 메뉴로 돌아갑니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");

			}
		}
	}

}
