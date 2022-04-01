package com.hw1.run;

import com.hw1.model.vo.Employee;

public class Run {

	public static void main(String[] args) { 

		Employee[] emp = new Employee[3];

		emp[0] = new Employee();
		emp[1] = new Employee(1, "홍길동", 19, 'M', "01022223333", "서울 잠실");
		emp[2] = new Employee(2, "강말순", "교육부", "강사", 20, 'F', 1000000, 0.01, "01011112222", "서울 마곡");

		System.out.println("emp[0]: " + emp[0].information());
		System.out.println("emp[1]: " + emp[1].information());
		System.out.println("emp[2]: " + emp[2].information());
		System.out.println("========================================");
		
		emp[0] = new Employee(0, "김말똥", "영업부", "팀장", 30, 'M', 3000000, 0.2, "01055559999", "전라도 광주");

		emp[1].setDept("기획부");
		emp[1].setJob("부장");
		emp[1].setSalary(4000000);
		emp[1].setBonusPoint(0.3);
				
		System.out.println("emp[0]: " + emp[0].information());
		System.out.println("emp[1]: " + emp[1].information());
		System.out.println("========================================");
		
		
		int year0 = (int) (emp[0].getSalary()+ (emp[0].getSalary() * emp[0].getBonusPoint())) * 12;
		int year1 = (int) (emp[1].getSalary()+ (emp[1].getSalary() * emp[1].getBonusPoint())) * 12;
		int year2 = (int) (emp[2].getSalary()+ (emp[2].getSalary() * emp[2].getBonusPoint())) * 12;
 
		System.out.println("김말똥의 연봉: " + year0 + "원");
		System.out.println("홍길동의 연봉: " + year1 + "원");
		System.out.println("강말순의 연봉: " + year2 + "원");
		
		System.out.println("========================================");
		
		int avg = (year0 + year1 + year2) / 3;
		System.out.println("직원들의 연봉의 평균: " + avg + "원");
		
		
		
	}
}
