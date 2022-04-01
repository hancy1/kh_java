package com.uni.part02.personMVC.run;

import com.uni.part02.personMVC.view.PersonMenu;

public class Run {

	public static void main(String[] args) {
		
		//MVC패턴
		// Model : 데이터를 담당하는 역할
		// View  : 사용자의 시각적인 요소를 담당하는 역할 (화면같은것)  --> 사용자에게 출력을 해준다거나, 사용자로부터 값을 입력받는 구문들을 진행할 예정
		// Controller : 사용자가 요청하는 기능을 처리해주는 역할 
		
		/*
		 *  Run  		->   View  		 -> 	 Controller
		 *  첫화면 실행		    출력및입력 요청		 사용자의 요청을 처리해줌
		 *  							<--
		 *  				결과출력		        요청 처리결과 반환
		 */ 

		//소수점 표기 참고
		int sum = 7445;
		int count = 3;
		double avg1 = Math.round(((double)sum/count) *1000)/1000.00;
		double avg4 = Math.round(((double)sum/count) *100)/100.0;

		double avg = (double)sum/count;
		String avg2 = String.format("%.3f",avg1);
		String avg3 = String.format("%.2f",avg1);
		System.out.println(avg+"   "+String.valueOf(avg1)+"  "+avg2+" "+avg3 +" "+ String.valueOf(avg4));
		
		new PersonMenu().mainMenu();
	}

}
