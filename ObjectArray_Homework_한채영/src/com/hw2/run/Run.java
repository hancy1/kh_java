package com.hw2.run;

import java.util.Scanner;

import com.hw2.model.vo.Student;

public class Run {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Student[] stu = new Student[10];
		int count = 0;

		while (true) {
			for (int i = 0; i < stu.length; i++) {
				System.out.println("학년: ");
				int grade = sc.nextInt();

				System.out.println("반: ");
				int classroom = sc.nextInt();

				sc.nextLine();

				System.out.println("이름: ");
				String name = sc.nextLine();

				System.out.println("국어점수: ");
				int kor = sc.nextInt();

				System.out.println("영어점수: ");
				int eng = sc.nextInt();

				System.out.println("수학점수: ");
				int math = sc.nextInt();

				sc.nextLine();

				stu[i] = new Student(grade, classroom, name, kor, eng, math);
				count++;
				// System.out.println(count);
				System.out.println("계속 추가하겠습니까? (y/n)");
				String yn = sc.nextLine();
				if (yn.equals("y") || yn.equals("Y")) {
					continue;
				} else if (yn.equals("n") || yn.equals("N")){
					for (int j = 0; j < stu.length; j++) {
						System.out.println(stu[j].information()); //출력은 되는데 cannot invoke 오류. stu[j]가 오류라고
					}
					break;
				}

			}

			

		}
	}
}
