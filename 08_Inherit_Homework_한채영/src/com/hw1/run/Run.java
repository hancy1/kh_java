package com.hw1.run;

import java.util.Scanner;

import com.hw1.model.vo.Employee;
import com.hw1.model.vo.Student;

public class Run {

	public static void main(String[] args) {

		Student[] s = new Student[3];

		s[0] = new Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
		s[1] = new Student("김말똥", 21, 187.3, 80.0, 2, "경영학과");
		s[2] = new Student("강개순", 23, 167.0, 45.0, 4, "정보통신공학과");

		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i].information());
		}

		Scanner sc = new Scanner(System.in);

		Employee[] e = new Employee[10];
		int count = 0;

		while (true) {
			
			System.out.println("계속 추가하겠습니까?(Y/N)"); //위치 체크
			char answer = sc.nextLine().charAt(0);
			
			if(answer == 'y' || answer == 'Y') {
			
			System.out.println("이름: ");
			String name = sc.nextLine();

			System.out.println("나이: ");
			int age = sc.nextInt();

			System.out.println("신장: ");
			double height = sc.nextDouble();

			System.out.println("몸무게: ");
			double weight = sc.nextDouble();

			System.out.println("급여: ");
			int salary = sc.nextInt();

			sc.nextLine();

			System.out.println("부서: ");
			String dept = sc.nextLine();

			for (int i = 0; i < e.length; i++) {
				e[count] = new Employee(name, age, height, weight, salary, dept);				
			}
			count++;
			
			//System.out.println("count : "+count);
				
			} else if (answer == 'n' || answer == 'N') {
				break;
			}
		}
		
		for(int i = 0; i < count; i++) {
			System.out.println(e[i].information());
		}

	}

}
